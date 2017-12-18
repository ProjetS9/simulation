package variable;

public class Teleconseilleur {
	private int idTeleconseilleur;
	private int B;  //Occupation du t¨¦l¨¦conseiller i, 0 libre, 1 occupe
	private int TE;  //Travail que t¨¦l¨¦conseiller i est en train de faire
	private int TD;  //Travail que t¨¦l¨¦conseiller i doit faire
	
	private Teleconseilleur(){
		idTeleconseilleur = 0;
		B = 0;
		TE = 0;
		TD = 0;
	}
	
	public int getIdTeleconseilleur() {
		return idTeleconseilleur;
	}
	public void setIdTeleconseilleur(int idTeleconseilleur) {
		this.idTeleconseilleur = idTeleconseilleur;
	}
	public int getB() {
		return B;
	}
	public void setB(int b) {
		B = b;
	}
	public int getTE() {
		return TE;
	}
	public void setTE(int tE) {
		TE = tE;
	}
	public int getTD() {
		return TD;
	}
	public void setTD(int tD) {
		TD = tD;
	}
	
}
