package evenement;

import java.util.Random;

import loi.Lois;
import variable.ClientCourriel;
import variable.ClientTelephone;
import variable.Variables;


public class ArrCouriel extends Evenement{
	private double DS;
	
	public ArrCouriel(double DS){
		this.DS = DS;  //Mettre ¨¤ jour DS (DateSimu)
	}
	
	public void operation(){

		int NC = 0;
		if(DS == 8){
			Random random = new Random();
	        NC = random.nextInt(80-20+1) + 20;
		}
		else{
			NC= Variables.NC + 1;
		}
		Variables.NC = NC;
		
		ClientCourriel CC = new ClientCourriel(NC);
		CC.setDateArrC(DS);
		Variables.listClientC.add(CC);
		
		int counterArrClientC = Variables.counterArrClientT+1;
		Variables.counterArrClientC = counterArrClientC;
		System.out.println(Variables.NC);
		
		for(int i=0; i< Variables.N;i++){
			if(Variables.listTeleconseilleur.get(i).getB() == 0){  //si TCi est libre
				if(Variables.listTeleconseilleur.get(i).getTD() == 1){  //TCi doit r¨¦pondre le t¨¦l¨¦phone
					AccTeleconseilleur accTC = new AccTeleconseilleur(DS);
					accTC.operation(i,Variables.listClientC.get(0).getIdClientC());
					break;
				}
			}
		}
		
		Lois loi = new Lois();
		if(DS>=8 && DS<9){
			DS = DS + loi.exponentielle(0.5);
			operation();
		}
		if(DS>=9 && DS<=12){
			DS = DS + loi.exponentielle(1);
			operation();
		}
	}
}
