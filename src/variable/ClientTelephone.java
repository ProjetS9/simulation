package variable;


public class ClientTelephone {
	private int idClientT;
	private double dateArrT;
	private double dateAccT;
	private double dateDepT;
	
	public ClientTelephone(int idCT){
		idClientT = idCT;
		dateArrT = 0;
		dateAccT = 0;
		dateDepT = 0;
	}
	
	public int getIdClientT() {
		return idClientT;
	}
	public void setIdClientT(int idClientT) {
		this.idClientT = idClientT;
	}
	public double getDateArrT() {
		return dateArrT;
	}
	public void setDateArrT(double dS) {
		this.dateArrT = dS;
	}
	public double getDateAccT() {
		return dateAccT;
	}
	public void setDateAccT(double dateAccT) {
		this.dateAccT = dateAccT;
	}
	public double getDateDepT() {
		return dateDepT;
	}
	public void setDateDepT(double dateDepT) {
		this.dateDepT = dateDepT;
	}

}
