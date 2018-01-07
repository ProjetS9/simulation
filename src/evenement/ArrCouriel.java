package evenement;

import variable.Variables;

public class ArrCouriel implements Runnable{
	private String threadName;
	private Variables var;
	
	public ArrCouriel(String name,Variables var){
		this.threadName = name;
		this.var = var;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
