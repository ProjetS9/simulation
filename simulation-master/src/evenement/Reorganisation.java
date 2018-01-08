package evenement;

import variable.ToDoQueue;
import variable.Variables;

public class Reorganisation extends Evenement{
	public int idTeleconseilleur;
	
	public Reorganisation(double DS, int idTeleconseilleur){
		this.DS = DS;  //Mettre ¨¤ jour DS (DateSimu)
		this.idTeleconseilleur = idTeleconseilleur;
	}
	
	public void operation(){
		System.out.print("Reorg----------------------");
		System.out.println(DS);
		//TCi est en train de r¨¦pondre le t¨¦l¨¦phone
		if(Variables.listTeleconseilleur.get(this.idTeleconseilleur).getTE() == 0){
			//la File d'attent de t¨¦l¨¦phone est vide
			if(Variables.NT == 0){
				Variables.listTeleconseilleur.get(this.idTeleconseilleur).setTD(1);
			}
			else{
				Variables.listTeleconseilleur.get(this.idTeleconseilleur).setTD(0);
			}
		}
		//TCi est en train de r¨¦pondre le courriel
		else{
			//si autant ou plus d¡¯appels en attente que TC en train de r¨¦pondre
			if(Variables.NTT <= Variables.NT){
				//nb de TC qui sont en train de r¨¦pondre tele moins ou autant que Ntmax
				if(Variables.NTT < Variables.Ntmax){
					Variables.listTeleconseilleur.get(this.idTeleconseilleur).setTD(0);
				}
				else{
					Variables.listTeleconseilleur.get(this.idTeleconseilleur).setTD(1);
				}
			}
			else{
				Variables.listTeleconseilleur.get(this.idTeleconseilleur).setTD(1);
			}
		}
		if(Variables.NT > 0 && Variables.listTeleconseilleur.get(this.idTeleconseilleur).getTD() == 0){
			int idClient = 0;
			for(;idClient<Variables.listClientT.size(); idClient++){
				if(Variables.listClientT.get(idClient).getDateAccT() == 0){
					break;
				}
			}
			Evenement accTC = new AccTeleconseilleur(DS,
					this.idTeleconseilleur, idClient);
			ToDoQueue.toDoQueue.offer(accTC);
		}
		else if(Variables.NC > 0 && Variables.listTeleconseilleur.get(this.idTeleconseilleur).getTD() == 1){
			int idCouriel = 0;
			for(;idCouriel<Variables.listClientC.size();idCouriel++){
				if(Variables.listClientC.get(idCouriel).getDateAccC() == 0){
					break;
				}
			}
			System.out.print("Reorga : ");
			System.out.println(idCouriel);
			Evenement accTC = new AccTeleconseilleur(DS,
					this.idTeleconseilleur, idCouriel);
			ToDoQueue.toDoQueue.offer(accTC);
		}
	}
}
