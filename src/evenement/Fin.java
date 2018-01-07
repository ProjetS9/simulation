package evenement;

public class Fin {
	
	public void operation(){
		double TTC;  //Taux de traitement de courriel
		double TAT; //Temps moyen d¡¯attente au t¨¦l¨¦phone
		double TOT;  //Taux d¡¯occupation des t¨¦l¨¦conseillers
		double TOPT;  //Taux d¡¯occupation des postes t¨¦l¨¦phoniques
		double DRC;  //D¨¦lai de r¨¦ponse aux courriel
		double ponderation;
		
		TTC = Debut.var.getCounterTraitClientC()/Debut.var.getCounterTraitClientC();
		
		int telephoneMargin = 0;
		for(int i=0; i<Debut.var.getCounterArrClientT(); i++)
			telephoneMargin += Debut.var.getListClientT().get(i).getDateAccT() - Debut.var.getListClientT().get(i).getDateArrT();
		TAT = telephoneMargin/Debut.var.getCounterArrClientT();
		
		int TeleconseilleurOccupe = 0;
		for(int i=0; i<Debut.var.getN(); i++){
			if(Debut.var.getListTeleconseulleur().get(i).getB() == 1)
				TeleconseilleurOccupe ++;
		}
		TOT = TeleconseilleurOccupe / Debut.var.getN();
		
		int PosteTelephoniqueOccupe = 0;
		for(int i=0; i<Debut.var.getN(); i++){
			if(Debut.var.getListTeleconseulleur().get(i).getTE() == 0 &&
					Debut.var.getListTeleconseulleur().get(i).getB() == 1)
				PosteTelephoniqueOccupe ++;
		}
		TOPT = PosteTelephoniqueOccupe/Debut.var.getNTT();
		
		int courrielMargin = 0;
		for(int i=0; i<Debut.var.getCounterTraitClientC(); i++)
			courrielMargin += Debut.var.getListClientC().get(i).getDateAccC()-Debut.var.getListClientC().get(i).getDateArrC();
		DRC = courrielMargin/Debut.var.getCounterTraitClientC();
		
		ponderation = 0.5*TTC + 0.2*TAT + 0.25*TOT + 0.025*TOPT + 0.025*DRC;
	}
}
