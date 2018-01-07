package evenement;

import java.util.ArrayList;
import java.util.List;

import variable.Teleconseilleur;
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
		
		
		int i;
		Teleconseilleur TC = null;
		List<Teleconseilleur> listTC = new ArrayList<Teleconseilleur>();
		for(i=0;i<N;i++){
			TC = new Teleconseilleur(i);
			listTC.add(TC);
		}
		
		for(i=0;i<Nt;i++){
			listTC.get(i).setTE(0);
			listTC.get(i).setTD(0);
		}
		
		for(i=Nt;i<N;i++){
			listTC.get(i).setTE(1);
			listTC.get(i).setTD(1);
		}
		
		var.setListTeleconseilleur(listTC);
		
		ArrTelephone arrTele=new ArrTelephone("Arrivee Telephone",var); 
		ArrCouriel arrCour=new ArrCouriel("Arrivee Couriel",var); 
		Thread threadTele=new Thread(arrTele); 
		Thread threadCour=new Thread(arrCour); 
		threadTele.start(); 
		threadCour.start();
	}
}
