package variable;

import java.util.Date;

public class ClientCourriel {
	private int idClientC;
	private Date dateArrC;
	private Date dateAccC;
	private Date dateDepC;
	
	public ClientCourriel(){
		idClientC = 0;
		dateArrC = new Date();
		dateAccC = new Date();
		dateDepC = new Date();
	}
	
	public int getIdClientC() {
		return idClientC;
	}
	public void setIdClientC(int idClientC) {
		this.idClientC = idClientC;
	}
	public Date getDateArrC() {
		return dateArrC;
	}
	public void setDateArrC(Date dateArrC) {
		this.dateArrC = dateArrC;
	}
	public Date getDateAccC() {
		return dateAccC;
	}
	public void setDateAccC(Date dateAccC) {
		this.dateAccC = dateAccC;
	}
	public Date getDateDepC() {
		return dateDepC;
	}
	public void setDateDepC(Date dateDepC) {
		this.dateDepC = dateDepC;
	}	
}
