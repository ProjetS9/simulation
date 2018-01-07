package evenement;

import java.util.Random;

import loi.Lois;


public class ArrCouriel implements Runnable{
	private String threadName;
	private double DS;
	
	public ArrCouriel(String name,float DS){
		this.threadName = name;
		this.DS = DS;  //Mettre ¨¤ jour DS (DateSimu)
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		operation();
	}
	
	public void operation(){

		int NC = 0;
		if(DS == 8){
			Random random = new Random();
	        NC = random.nextInt(80-20+1) + 20;
		}
		else{
			NC= Debut.var.getNC()+1;
		}
		Debut.var.setNC(NC);
			
		int counterArrClientC = Debut.var.getCounterArrClientT()+1;
		Debut.var.setCounterArrClientC(counterArrClientC);
		System.out.println(Debut.var.getNC());
		
		for(int i=0; i< Debut.var.getN();i++){
			if(Debut.var.getListTeleconseulleur().get(i).getB() == 0){  //si TCi est libre
				if(Debut.var.getListTeleconseulleur().get(i).getTD() == 1){  //TCi doit r¨¦pondre le t¨¦l¨¦phone
					AccTeleconseilleur accTC = new AccTeleconseilleur(DS);
					accTC.operation(i);
					break;
				}
			}
		}
		
		Lois loi = new Lois();
		if(DS>=8 && DS<9){
			DS = DS + loi.exponentielle(0.5);
			operation();
		}
		if(DS>=9 && DS<=12){
			DS = DS + loi.exponentielle(1);
			operation();
		}
	}
}
