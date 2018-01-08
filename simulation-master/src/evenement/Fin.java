package evenement;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import variable.Indicateurs;
import variable.Variables;

public class Fin extends Evenement{
	
	public Fin(double DS){
		this.DS = DS;
	}
	
	public void operation(){

		System.out.print("Fin----------------------");
		System.out.println(DS);
		Indicateurs.tauxNonTraitCour = 1 - Variables.counterTraitClientC / (double)Variables.counterArrClientC;
		
		int telephoneMargin = 0;
		for(int i=0; i<Variables.counterArrClientT; i++){
			if(Variables.listClientT.get(i).getDateAccT() != 0)
				telephoneMargin += (Variables.listClientT.get(i).getDateAccT() - Variables.listClientT.get(i).getDateArrT());
			else
				telephoneMargin += (720 - Variables.listClientT.get(i).getDateArrT());
		}
		Indicateurs.tempsAttenteTele = telephoneMargin/Variables.counterArrClientT;
		
		int TeleconseilleurOccupe = 0;
		for(int i=0; i<Variables.counterTraitClientT; i++){
			if(Variables.listClientT.get(i).getDateDepT() == 0)
				TeleconseilleurOccupe += (720 - Variables.listClientT.get(i).getDateAccT());
			else
				TeleconseilleurOccupe += (Variables.listClientT.get(i).getDateDepT() - Variables.listClientT.get(i).getDateAccT());
		}
		for(int i=0; i<Variables.counterTraitClientC; i++){
			if(Variables.listClientC.get(i).getDateDepC() == 0)
				TeleconseilleurOccupe += (720 - Variables.listClientC.get(i).getDateAccC());
			else
				TeleconseilleurOccupe += (Variables.listClientC.get(i).getDateDepC() - Variables.listClientC.get(i).getDateAccC());
		}
		Indicateurs.tauxOccupTele = TeleconseilleurOccupe / (double)(Variables.N * (720 - 480));
		
		int PosteTelephoniqueOccupe = 0;
		for(int i=0; i<Variables.counterTraitClientT; i++){
			if(Variables.listClientT.get(i).getDateDepT() == 0)
				PosteTelephoniqueOccupe += (720 - Variables.listClientT.get(i).getDateAccT());
			else
				PosteTelephoniqueOccupe += (Variables.listClientT.get(i).getDateDepT() - Variables.listClientT.get(i).getDateAccT());
		}
		Indicateurs.tauxOccupPoste = PosteTelephoniqueOccupe / (double)(Variables.Ntmax * (720 - 480));
		
		int courrielMargin = 0;
		int count = 0;
		for(int i=0; i<Variables.counterTraitClientC; i++){
			if(Variables.listClientC.get(i).getDateDepC() == 0)
				count++;
			else
				courrielMargin += Variables.listClientC.get(i).getDateDepC()-Variables.listClientC.get(i).getDateArrC();
		}
			
		Indicateurs.delaiRepCour = courrielMargin/ (double)(Variables.counterTraitClientC - count);
		
		Indicateurs.ponderation = 0.5*Indicateurs.tauxNonTraitCour + 0.2*Indicateurs.tempsAttenteTele + 
				0.25*Indicateurs.tauxOccupTele + 0.025*Indicateurs.tauxOccupPoste + 0.025*Indicateurs.delaiRepCour;
		
		Variables.stop = true;
		System.out.println(Variables.counterTraitClientC);
		System.out.println(Variables.counterArrClientT);
		
		try {
			WriteToFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void WriteToFile() throws IOException{
		 File file = new File("HistCourriels.txt");
		 if(!file.exists())
			 file.createNewFile();
         BufferedWriter out = new BufferedWriter(new FileWriter(file));
         String content="";
         for(int i=0; i<Variables.counterTraitClientC; i++){
			if(Variables.listClientC.get(i).getDateDepC() != 0){
				content += String.valueOf(Variables.listClientC.get(i).getDateArrC())+"\t"
						+String.valueOf(Variables.listClientC.get(i).getDateDepC()-Variables.listClientC.get(i).getDateAccC())+"\n";
			}
		}
         out.write(content);
         out.flush();
         out.close();  
	}
}
