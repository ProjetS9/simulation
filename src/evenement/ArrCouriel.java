package evenement;

import java.util.Random;

import loi.Lois;
import variable.ClientCourriel;
import variable.ClientTelephone;
import variable.ToDoQueue;
import variable.Variables;


public class ArrCouriel extends Evenement{

	public ArrCouriel(double DS){
		this.DS = DS;  //Mettre ¨¤ jour DS (DateSimu)
	}
	
	public void operation(){
		System.out.print("ArrCouriel----------------------");
		System.out.println(DS);

		if(DS == 480){
			Random random = new Random();
			Variables.NC = random.nextInt(80-20+1) + 20;
			for(int i=0; i<Variables.NC; i++){
				Variables.listClientC.add(new ClientCourriel(i));
			}
			Variables.counterArrClientC = Variables.NC;
		}
		else{
			Variables.NC++;
		}
		
		ClientCourriel CC = new ClientCourriel(Variables.listClientC.size());
		CC.setDateArrC(DS);
		Variables.listClientC.add(CC);
		
		Variables.counterArrClientC ++;
		//System.out.println(Variables.NC);
		
		for(int i=0; i< Variables.N;i++){
			if(Variables.listTeleconseilleur.get(i).getB() == 0){  //si TCi est libre
				if(Variables.listTeleconseilleur.get(i).getTD() == 1){  //TCi doit r¨¦pondre le t¨¦l¨¦phone
					int idCouriel = 0;
					for(;idCouriel<Variables.listClientC.size();idCouriel++){
						if(Variables.listClientC.get(idCouriel).getDateAccC() == 0){
							break;
						}
					}
					Evenement accTC = new AccTeleconseilleur(DS,i,idCouriel);
					ToDoQueue.toDoQueue.offer(accTC);
					break;
				}
			}
		}
		
		Lois loi = new Lois();
		if(DS>=480 && DS<540){
			//DS = DS + loi.exponentielle(0.5);
			Evenement arrC = new ArrCouriel(DS + loi.exponentielle(0.5));
			ToDoQueue.toDoQueue.add(arrC);
		}
		if(DS>=540 && DS<=720){
			//DS = DS + loi.exponentielle(1);
			Evenement arrC = new ArrCouriel(DS + loi.exponentielle(5));
			ToDoQueue.toDoQueue.add(arrC);
		}
	}
}
