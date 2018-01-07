package variable;


public class ClientCourriel {
	private int idClientC;
	private double dateArrC;
	private double dateAccC;
	private double dateDepC;
	
	public ClientCourriel(int idCC){
		idClientC = idCC;
		dateArrC = 0;
		dateAccC = 0;
		dateDepC = 0;
	}
	
	public int getIdClientC() {
		return idClientC;
	}
	public void setIdClientC(int idClientC) {
		this.idClientC = idClientC;
	}
	public double getDateArrC() {
		return dateArrC;
	}
	public void setDateArrC(double dateArrC) {
		this.dateArrC = dateArrC;
	}
	public double getDateAccC() {
		return dateAccC;
	}
	public void setDateAccC(double dateAccC) {
		this.dateAccC = dateAccC;
	}
	public double getDateDepC() {
		return dateDepC;
	}
	public void setDateDepC(double dateDepC) {
		this.dateDepC = dateDepC;
	}	
}
