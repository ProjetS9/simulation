package evenement;

import java.util.ArrayList;
import java.util.List;

import loi.Lois;
import variable.Teleconseilleur;
import variable.ToDoQueue;
import variable.Variables;

public class Debut extends Evenement{
	public double DS;
	
	public Debut(){
		DS = 0;
	}
	
	public void operation(int N, int Nt, int Ntmax){
		Variables.N = N;
		Variables.Nt = Nt;
		Variables.Ntmax = Ntmax;
		
		
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
		
		Variables.listTeleconseilleur = listTC;
		
		Lois loi = new Lois();
		Evenement arrTele=new ArrTelephone(DS+loi.exponentielle(5)); 
		Evenement arrCour=new ArrCouriel(DS);
		ToDoQueue.toDoQueue.add(arrTele);
		ToDoQueue.toDoQueue.add(arrCour);
	}
}
