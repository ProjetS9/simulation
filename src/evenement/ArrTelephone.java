package evenement;

import loi.Lois;
import variable.Variables;

public class ArrTelephone implements Runnable{
	private String threadName;
	private Variables var;
	
	public ArrTelephone(String name,Variables var){
		this.threadName = name;
		this.var = var;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Lois loi = new Lois();
		float DS = var.getDS()+loi.exponentielle();
		var.setDS(DS);  //Mettre ¨¤ jour DS (DateSimu)
		
		int NT = var.getNT()+1;
		var.setNT(NT);
		
		int counterArrClientT = var.getCounterArrClientT()+1;
		var.setCounterArrClientT(counterArrClientT);
		
		for(int i=0; i< var.getN();i++){
			if(var.getListTeleconseulleur().get(i).getB() == 0){  //si TCi est libre
				if(var.getListTeleconseulleur().get(i).getTD() == 0){  //TCi doit r¨¦pondre le t¨¦l¨¦phone
					AccTeleconseilleur accTC = new AccTeleconseilleur();
					accTC.operation(i);
					break;
				}
			}
		}
	}

}
