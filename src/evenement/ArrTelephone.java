package evenement;


import loi.Lois;
import variable.ClientTelephone;
import variable.Variables;

public class ArrTelephone extends Evenement{

	public ArrTelephone(double DS){
		this.DS = DS;  //Mettre ¨¤ jour DS (DateSimu)
	}
	
	public void operation(){
		Lois loi = new Lois();
		
		int NT = Variables.NT + 1;
		Variables.NT = NT;
		
		ClientTelephone CT = new ClientTelephone(NT);
		CT.setDateArrT(DS);
		Variables.listClientT.add(CT);
		
		int counterArrClientT = Variables.counterArrClientT+1;
		Variables.counterArrClientT = counterArrClientT;
		System.out.println(Variables.NT);
		
		for(int i=0; i< Variables.N;i++){
			if(Variables.listTeleconseilleur.get(i).getB() == 0){  //si TCi est libre
				if(Variables.listTeleconseilleur.get(i).getTD() == 0){  //TCi doit r¨¦pondre le t¨¦l¨¦phone
					AccTeleconseilleur accTC = new AccTeleconseilleur(DS);
					accTC.operation(i,Variables.listClientT.get(0).getIdClientT());
					break;
				}
			}
		}
		
		if(DS>=8 && DS<9){
			DS = DS + loi.exponentielle(5);
			operation();
		}
		if(DS>=9 && DS<11){
			DS = DS + loi.exponentielle(1);
			operation();
		}
		if(DS>=11 && DS<=12){
			DS = DS + loi.exponentielle(10);
			operation();
		}
	}
}
