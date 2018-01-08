package evenement;

import loi.Lois;
import variable.Variables;

public class AccTeleconseilleur extends Evenement{
	
	public AccTeleconseilleur(double DS){
		this.DS = DS;  //Mettre ¨¤ jour DS (DateSimu)
	}
	
	public void operation(int idTeleconseilleur, int idClient){
		Lois loi = new Lois();
		
		if(Variables.listTeleconseilleur.get(idTeleconseilleur).getTE() == 0){
			Variables.listClientT.get(idClient).setDateAccT(DS);
		}
		else{
			int counterTraitClientC = Variables.counterTraitClientC+1;
			Variables.counterTraitClientC = counterTraitClientC;
			Variables.listClientC.get(idClient).setDateAccC(DS);
		}
		
		//Changer le statut du TCi en ¡°occupe¡±
		Variables.listTeleconseilleur.get(idTeleconseilleur).setB(1);  
		
		//Changer le statut du travail ¡°en train de faire¡± en le travail ¡°doit faire¡±
		Variables.listTeleconseilleur.get(idTeleconseilleur).setTE(Variables.listTeleconseilleur.get(idTeleconseilleur).getTD()); 
		
		//TCi doit r¨¦pondre le t¨¦l¨¦phone
		if(Variables.listTeleconseilleur.get(idTeleconseilleur).getTD() == 0){
			int NT = Variables.NT - 1;
			Variables.NT = NT;
			
			int NTT = Variables.NTT + 1;
			Variables.NTT = NTT;
			
			Variables.listClientT.remove(0);
			
			DepTeleconseilleur depTC = new DepTeleconseilleur(DS + loi.uniforme(5, 15));
		}
		else{
			int NC = Variables.NC - 1;
			Variables.NC = NC;
			
			Variables.listClientC.remove(0);
			
			DepTeleconseilleur depTC = new DepTeleconseilleur(DS + loi.uniforme(3, 7));
		}
		
	}
}
