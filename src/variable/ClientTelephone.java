package variable;

import java.util.Date;

public class ClientTelephone {
	private int idClientT;
	private Date dateArrT;
	private Date dateAccT;
	private Date dateDepT;
	
	public ClientTelephone(){
		idClientT = 0;
		dateArrT = new Date();
		dateAccT = new Date();
		dateDepT = new Date();
	}
	
	public int getIdClientT() {
		return idClientT;
	}
	public void setIdClientT(int idClientT) {
		this.idClientT = idClientT;
	}
	public Date getDateArrT() {
		return dateArrT;
	}
	public void setDateArrT(Date dateArrT) {
		this.dateArrT = dateArrT;
	}
	public Date getDateAccT() {
		return dateAccT;
	}
	public void setDateAccT(Date dateAccT) {
		this.dateAccT = dateAccT;
	}
	public Date getDateDepT() {
		return dateDepT;
	}
	public void setDateDepT(Date dateDepT) {
		this.dateDepT = dateDepT;
	}

}
