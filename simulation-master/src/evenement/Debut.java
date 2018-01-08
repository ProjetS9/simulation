package evenement;

import java.util.ArrayList;
import java.util.List;

import loi.Lois;
import variable.Teleconseilleur;
import variable.ToDoQueue;
import variable.Variables;

public class Debut extends Evenement{
	
	public Debut(double DS){
		this.DS = DS;
	}
	
	public void operation(){
		
		int i;
		Teleconseilleur TC = null;
		List<Teleconseilleur> listTC = new ArrayList<Teleconseilleur>();
		for(i=0;i<Variables.N;i++){
			TC = new Teleconseilleur(i);
			listTC.add(TC);
		}
		
		for(i=0;i<Variables.Nt;i++){
			listTC.get(i).setTE(0);
			listTC.get(i).setTD(0);
		}
		
		for(i=Variables.Nt;i<Variables.N;i++){
			listTC.get(i).setTE(1);
			listTC.get(i).setTD(1);
		}
		
		Variables.listTeleconseilleur = listTC;
		
		Lois loi = new Lois();
		
		Evenement arrTele=new ArrTelephone(DS+loi.exponentielle(5)); 
		Evenement arrCour=new ArrCourriel(DS);
		Evenement fin = new Fin(720);
		ToDoQueue.toDoQueue.offer(arrTele);
		ToDoQueue.toDoQueue.offer(arrCour);
		ToDoQueue.toDoQueue.offer(fin);
	}
}
