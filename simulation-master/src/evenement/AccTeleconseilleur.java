package evenement;

import loi.Lois;
import variable.ToDoQueue;
import variable.Variables;

public class AccTeleconseilleur extends Evenement{
	
	public int idTeleconseilleur;
	public int idClient;
	
	public AccTeleconseilleur(double DS, int idTeleconseilleur, int idClient){
		this.DS = DS;  //Mettre ¨¤ jour DS (DateSimu)
		this.idTeleconseilleur = idTeleconseilleur;
		this.idClient = idClient;
	}
	
	public void operation(){
		System.out.print("Acctele----------------------");
		System.out.println(DS);
		Lois loi = new Lois();

		//Changer le statut du TCi en ¡°occupe¡±
		Variables.listTeleconseilleur.get(this.idTeleconseilleur).setB(1);  
		
		//Changer le statut du travail ¡°en train de faire¡± en le travail ¡°doit faire¡±
		Variables.listTeleconseilleur.get(this.idTeleconseilleur).setTE(Variables.listTeleconseilleur.get(idTeleconseilleur).getTD()); 
		
		//TCi doit r¨¦pondre le t¨¦l¨¦phone
		if(Variables.listTeleconseilleur.get(this.idTeleconseilleur).getTD() == 0){
			Variables.listClientT.get(this.idClient).setDateAccT(DS);
			Variables.counterTraitClientT++;
			Variables.NT--;
			Variables.NTT++;
			Evenement depTC = new DepTeleconseilleur(DS + loi.uniforme(5, 15), this.idTeleconseilleur, this.idClient);
			ToDoQueue.toDoQueue.offer(depTC);
		}
		else{
			Variables.NC--;
			Variables.counterTraitClientC++;
			Variables.listClientC.get(this.idClient).setDateAccC(DS);
			Evenement depTC = new DepTeleconseilleur(DS + loi.uniforme(3, 7), this.idTeleconseilleur, this.idClient);
			ToDoQueue.toDoQueue.offer(depTC);
		}
		
	}
}
