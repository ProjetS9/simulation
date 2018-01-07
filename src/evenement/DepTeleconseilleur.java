package evenement;

public class DepTeleconseilleur {
	private double DS;
	
	public DepTeleconseilleur(double DS){
		this.DS = DS;  //Mettre ¨¤ jour DS (DateSimu)
	}
	
	public void operation(int idTeleconseilleur){
		
		//Changer le statut du TCi en ¡°libre¡±
		Debut.var.getListTeleconseulleur().get(idTeleconseilleur).setB(0); 
		
		//TCi est en train de r¨¦pondre telephone
		if(Debut.var.getListTeleconseulleur().get(idTeleconseilleur).getTE() == 0){
			int NTT = Debut.var.getNTT() - 1;
			Debut.var.setNTT(NTT);
		}
		
		Reorganisation reorg = new Reorganisation(DS);
		reorg.operation(idTeleconseilleur);
	}
}
