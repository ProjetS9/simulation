package evenement;

import variable.Variables;

public class DepTeleconseilleur extends Evenement{
	private double DS;
	
	public DepTeleconseilleur(double DS){
		this.DS = DS;  //Mettre ¨¤ jour DS (DateSimu)
	}
	
	public void operation(int idTeleconseilleur){
		
		//Changer le statut du TCi en ¡°libre¡±
		Variables.listTeleconseilleur.get(idTeleconseilleur).setB(0); 
		
		//TCi est en train de r¨¦pondre telephone
		if(Variables.listTeleconseilleur.get(idTeleconseilleur).getTE() == 0){
			int NTT = Variables.NTT - 1;
			Variables.NTT = NTT;
		}
		
		Reorganisation reorg = new Reorganisation(DS);
		reorg.operation(idTeleconseilleur);
	}
}
