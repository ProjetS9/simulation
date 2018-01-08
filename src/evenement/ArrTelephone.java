package evenement;


import loi.Lois;
import variable.ClientTelephone;
import variable.ToDoQueue;
import variable.Variables;

public class ArrTelephone extends Evenement{

	public ArrTelephone(double DS){
		this.DS = DS;  //Mettre ¨¤ jour DS (DateSimu)
	}
	
	public void operation(){
		System.out.print("ArrTelephone----------------------");
		System.out.println(DS);
		Lois loi = new Lois();
		
		Variables.NT++;
		
		ClientTelephone CT = new ClientTelephone(Variables.listClientT.size()-1);
		CT.setDateArrT(DS);
		Variables.listClientT.add(CT);
		
		Variables.counterArrClientT++;
		//System.out.println(Variables.NT);
		
		for(int i=0; i< Variables.N;i++){
			if(Variables.listTeleconseilleur.get(i).getB() == 0){  //si TCi est libre
				if(Variables.listTeleconseilleur.get(i).getTD() == 0){  //TCi doit r¨¦pondre le t¨¦l¨¦phone
					int idClient = 0;
					for(;idClient<Variables.listClientT.size(); idClient++){
						if(Variables.listClientT.get(idClient).getDateAccT() == 0){
							break;
						}
					}
					Evenement accTC = new AccTeleconseilleur(DS,i,idClient);
					ToDoQueue.toDoQueue.offer(accTC);
					break;
				}
			}
		}
		
		if(DS>=480 && DS<540){
			Evenement arrT = new ArrTelephone(DS + loi.exponentielle(5));
			ToDoQueue.toDoQueue.add(arrT);
		}
		if(DS>=540 && DS<660){
			Evenement arrT = new ArrTelephone(DS + loi.exponentielle(1));
			ToDoQueue.toDoQueue.add(arrT);
		}
		if(DS>=660 && DS<=720){
			Evenement arrT = new ArrTelephone(DS + loi.exponentielle(10));
			ToDoQueue.toDoQueue.add(arrT);
		}
	}
}
