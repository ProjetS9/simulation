package evenement;

import variable.Variables;

public class Fin extends Evenement{
	
	public void operation(){
		double TTC;  //Taux de traitement de courriel
		double TAT; //Temps moyen d¡¯attente au t¨¦l¨¦phone
		double TOT;  //Taux d¡¯occupation des t¨¦l¨¦conseillers
		double TOPT;  //Taux d¡¯occupation des postes t¨¦l¨¦phoniques
		double DRC;  //D¨¦lai de r¨¦ponse aux courriel
		double ponderation;
		
		TTC = Variables.counterTraitClientC / Variables.counterTraitClientC;
		
		int telephoneMargin = 0;
		for(int i=0; i<Variables.counterArrClientT; i++)
			telephoneMargin += Variables.listClientT.get(i).getDateAccT() - Variables.listClientT.get(i).getDateArrT();
		TAT = telephoneMargin/Variables.counterArrClientT;
		
		int TeleconseilleurOccupe = 0;
		for(int i=0; i<Variables.N; i++){
			if(Variables.listTeleconseilleur.get(i).getB() == 1)
				TeleconseilleurOccupe ++;
		}
		TOT = TeleconseilleurOccupe / Variables.N;
		
		int PosteTelephoniqueOccupe = 0;
		for(int i=0; i<Variables.N; i++){
			if(Variables.listTeleconseilleur.get(i).getTE() == 0 &&
					Variables.listTeleconseilleur.get(i).getB() == 1)
				PosteTelephoniqueOccupe ++;
		}
		TOPT = PosteTelephoniqueOccupe/Variables.NTT;
		
		int courrielMargin = 0;
		for(int i=0; i<Variables.counterTraitClientC; i++)
			courrielMargin += Variables.listClientC.get(i).getDateAccC()-Variables.listClientC.get(i).getDateArrC();
		DRC = courrielMargin/Variables.counterTraitClientC;
		
		ponderation = 0.5*TTC + 0.2*TAT + 0.25*TOT + 0.025*TOPT + 0.025*DRC;
	}
}
