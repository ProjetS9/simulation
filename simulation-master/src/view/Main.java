package view;
import evenement.Debut;
import evenement.Evenement;
import variable.ToDoQueue;
import variable.Variables;
import view.Accueil;
public class Main{

	public void run(){
		Evenement debut = new Debut(480);
		ToDoQueue.toDoQueue.add(debut);
		Evenement e = ToDoQueue.toDoQueue.poll();
		while(e != null && !Variables.stop) {
			System.out.println("----------------------");
			e.operation();
			e = ToDoQueue.toDoQueue.poll();
		}
		ToDoQueue.init();
	}
	public static void main(String[] args) {
		Accueil acc = new Accueil();
	}
}
