package evenement;

import loi.Lois;

public class AccTeleconseilleur {
	private double DS;
	
	public AccTeleconseilleur(double DS){
		this.DS = DS;  //Mettre ¨¤ jour DS (DateSimu)
	}
	
	public void operation(int idTeleconseilleur, int idClient){
		Lois loi = new Lois();
		
		if(Debut.var.getListTeleconseulleur().get(idTeleconseilleur).getTE() == 0){
			Debut.var.getListClientT().get(idClient).setDateAccT(DS);
		}
		else{
			int counterTraitClientC = Debut.var.getCounterTraitClientC()+1;
			Debut.var.setCounterTraitClientC(counterTraitClientC);
			Debut.var.getListClientC().get(idClient).setDateAccC(DS);
		}
		
		Debut.var.getListTeleconseulleur().get(idTeleconseilleur).setB(1);  //Changer le statut du TCi en ¡°occupe¡±
		
		//Changer le statut du travail ¡°en train de faire¡± en le travail ¡°doit faire¡±
		Debut.var.getListTeleconseulleur().get(idTeleconseilleur).setTE(Debut.var.getListTeleconseulleur().get(idTeleconseilleur).getTD()); 
		
		if(Debut.var.getListTeleconseulleur().get(idTeleconseilleur).getTD() == 0){
			int NT = Debut.var.getNT() - 1;
			Debut.var.setNT(NT);
			
			int NTT = Debut.var.getNTT() + 1;
			Debut.var.setNTT(NTT);
			
			DepTeleconseilleur depTC = new DepTeleconseilleur(DS + loi.uniforme(5, 15));
		}
		else{
			int NC = Debut.var.getNC() - 1;
			Debut.var.setNC(NC);
			
			DepTeleconseilleur depTC = new DepTeleconseilleur(DS + loi.uniforme(3, 7));
		}
		
	}
}
