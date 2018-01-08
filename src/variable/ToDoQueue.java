package variable;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

import evenement.Evenement;

public class ToDoQueue {
	public static int count = 0;
	public static Comparator<Evenement> idComparator = new Comparator<Evenement>(){
		@Override
		public int compare(Evenement e1, Evenement e2) {
			if(e1.DS != e2.DS){
				if(e1.DS < e2.DS)
					return -1;
				else
					return 1;
				}
			else
				return (int)(e1.priorite-e2.priorite);
			}
		};
		
	public static Queue<Evenement> toDoQueue = new PriorityQueue<Evenement>(50, idComparator);
}