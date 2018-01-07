package evenement;

import java.util.ArrayList;
import java.util.List;

import loi.Lois;
import variable.Teleconseilleur;
import variable.Variables;

public class Debut {
	public static Variables var;
	public double DS;
	
	public Debut(){
		var = new Variables();
		DS = 0;
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
		
		Lois loi = new Lois();
		ArrTelephone arrTele=new ArrTelephone("Arrivee Telephone",DS+loi.exponentielle(5)); 
		ArrCouriel arrCour=new ArrCouriel("Arrivee Courriel",DS); 
		Thread threadTele=new Thread(arrTele); 
		Thread threadCour=new Thread(arrCour); 
		threadTele.start(); 
		threadCour.start();
	}
}
