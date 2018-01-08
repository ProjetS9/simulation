package evenement;

import variable.Variables;

public class Reorganisation extends Evenement{
	
	public Reorganisation(double DS){
		this.DS = DS;  //Mettre ¨¤ jour DS (DateSimu)
	}
	
	public void operation(int idTeleconseilleur){
		//TCi est en train de r¨¦pondre le t¨¦l¨¦phone
		if(Variables.listTeleconseilleur.get(idTeleconseilleur).getTE() == 0){
			//la File d'attent de t¨¦l¨¦phone est vide
			if(Variables.NT == 0){
				Variables.listTeleconseilleur.get(idTeleconseilleur).setTD(1);
			}
			else{
				Variables.listTeleconseilleur.get(idTeleconseilleur).setTD(0);
			}
		}
		//TCi est en train de r¨¦pondre le courriel
		else{
			//si autant ou plus d¡¯appels en attente que TC en train de r¨¦pondre
			if(Variables.NTT <= Variables.NT){
				//nb de TC qui sont en train de r¨¦pondre tele moins ou autant que Ntmax
				if(Variables.NTT <= Variables.Ntmax){
					Variables.listTeleconseilleur.get(idTeleconseilleur).setTD(0);
				}
				else{
					Variables.listTeleconseilleur.get(idTeleconseilleur).setTD(1);
				}
			}
			else{
				Variables.listTeleconseilleur.get(idTeleconseilleur).setTD(1);
			}
		}
		if(Variables.NT > 0 && Variables.listTeleconseilleur.get(idTeleconseilleur).getTD() == 0){
			AccTeleconseilleur accTC = new AccTeleconseilleur(DS);
			accTC.operation(idTeleconseilleur,Variables.listClientT.get(0).getIdClientT());
		}
		if(Variables.NC > 0 && Variables.listTeleconseilleur.get(idTeleconseilleur).getTD() == 1){
			AccTeleconseilleur accTC = new AccTeleconseilleur(DS);
			accTC.operation(idTeleconseilleur,Variables.listClientC.get(0).getIdClientC());
		}
	}
}
