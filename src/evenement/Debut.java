package evenement;

import variable.Variables;

public class Debut {
	private Variables var;
	
	public Debut(){
		var = new Variables();
	}
	
	public void demarrer(int N, int Nt, int Ntmax){
		var.setN(N);
		var.setNt(Nt);
		var.setNtmax(Ntmax);
		
		ArrTelephone arrTele=new ArrTelephone("Arrivee Telephone",var); 
		ArrCouriel arrCour=new ArrCouriel("Arrivee Couriel",var); 
		Thread threadTele=new Thread(arrTele); 
		Thread threadCour=new Thread(arrCour); 
		threadTele.start(); 
		threadCour.start();
	}
}
