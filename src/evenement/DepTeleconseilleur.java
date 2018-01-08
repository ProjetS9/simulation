package evenement;

import variable.ToDoQueue;
import variable.Variables;

public class DepTeleconseilleur extends Evenement{
	
	public int idTeleconseilleur;
	public int idClient;
	
	public DepTeleconseilleur(double DS, int idTeleconseilleur, int idClient){
		this.DS = DS;  //Mettre ¨¤ jour DS (DateSimu)
		this.idTeleconseilleur = idTeleconseilleur;
		this.idClient = idClient;
	}
	
	public void operation(){
		
		System.out.print("DepTele----------------------");
		System.out.println(DS);
		//Changer le statut du TCi en ¡°libre¡±
		Variables.listTeleconseilleur.get(this.idTeleconseilleur).setB(0); 
		
		//TCi est en train de r¨¦pondre telephone
		if(Variables.listTeleconseilleur.get(this.idTeleconseilleur).getTE() == 0){
			Variables.NTT--;
			Variables.listClientT.get(idClient).setDateDepT(DS);
		}
		else
			Variables.listClientC.get(idClient).setDateDepC(DS);
		
		Evenement reorg = new Reorganisation(DS, this.idTeleconseilleur);
		ToDoQueue.toDoQueue.offer(reorg);
	}
}
