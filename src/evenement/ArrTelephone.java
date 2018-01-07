package evenement;

import java.util.ArrayList;
import java.util.List;

import loi.Lois;
import variable.ClientTelephone;
import variable.Variables;

public class ArrTelephone implements Runnable{
	private String threadName;
	private double DS;
	
	public ArrTelephone(String name, float DS){
		this.threadName = name;
		this.DS = DS;  //Mettre ¨¤ jour DS (DateSimu)
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		operation();
	}
	
	public void operation(){
		Lois loi = new Lois();
		
		int NT = Debut.var.getNT()+1;
		Debut.var.setNT(NT);
		
		ClientTelephone CT = new ClientTelephone(NT);
		CT.setDateArrT(DS);
		Debut.var.getListClientT().add(CT);
		
		int counterArrClientT = Debut.var.getCounterArrClientT()+1;
		Debut.var.setCounterArrClientT(counterArrClientT);
		System.out.println(Debut.var.getNT());
		
		for(int i=0; i< Debut.var.getN();i++){
			if(Debut.var.getListTeleconseulleur().get(i).getB() == 0){  //si TCi est libre
				if(Debut.var.getListTeleconseulleur().get(i).getTD() == 0){  //TCi doit r¨¦pondre le t¨¦l¨¦phone
					AccTeleconseilleur accTC = new AccTeleconseilleur(DS);
					accTC.operation(i);
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
