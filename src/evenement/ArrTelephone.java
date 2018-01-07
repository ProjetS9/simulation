package evenement;

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
		
	}

}
