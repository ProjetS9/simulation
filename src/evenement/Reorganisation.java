package evenement;

public class Reorganisation {
	private double DS;
	
	public Reorganisation(double DS){
		this.DS = DS;  //Mettre ¨¤ jour DS (DateSimu)
	}
	
	public void operation(int idTeleconseilleur){
		//TCi est en train de r¨¦pondre le t¨¦l¨¦phone
		if(Debut.var.getListTeleconseulleur().get(idTeleconseilleur).getTE() == 0){
			//la File d'attent de t¨¦l¨¦phone est vide
			if(Debut.var.getNT() == 0){
				Debut.var.getListTeleconseulleur().get(idTeleconseilleur).setTD(1);
			}
			else{
				Debut.var.getListTeleconseulleur().get(idTeleconseilleur).setTD(0);
			}
		}
		//TCi est en train de r¨¦pondre le courriel
		else{
			//si autant ou plus d¡¯appels en attente que TC en train de r¨¦pondre
			if(Debut.var.getNTT() <= Debut.var.getNT()){
				//nb de TC qui sont en train de r¨¦pondre tele moins ou autant que Ntmax
				if(Debut.var.getNTT() <= Debut.var.getNtmax()){
					Debut.var.getListTeleconseulleur().get(idTeleconseilleur).setTD(0);
				}
				else{
					Debut.var.getListTeleconseulleur().get(idTeleconseilleur).setTD(1);
				}
			}
			else{
				Debut.var.getListTeleconseulleur().get(idTeleconseilleur).setTD(1);
			}
		}
		if(Debut.var.getNT() > 0 && Debut.var.getListTeleconseulleur().get(idTeleconseilleur).getTD() == 0){
			AccTeleconseilleur accTC = new AccTeleconseilleur(DS);
			accTC.operation(idTeleconseilleur,Debut.var.getListClientT().get(0).getIdClientT());
		}
		if(Debut.var.getNC() > 0 && Debut.var.getListTeleconseulleur().get(idTeleconseilleur).getTD() == 1){
			AccTeleconseilleur accTC = new AccTeleconseilleur(DS);
			accTC.operation(idTeleconseilleur,Debut.var.getListClientC().get(0).getIdClientC());
		}
	}
}
