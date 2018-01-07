package variable;

public class Indicateurs {
	private double tauxTraitCour;
	private double tempsAttenteTele;
	private double delaiRepCour;
	private double tauxOccupTele;
	private double tauxOccupCour;
	private double ponderation;
	
	public Indicateurs(){
		tauxTraitCour = 0;
		tempsAttenteTele = 0;
		delaiRepCour = 0;
		tauxOccupTele = 0;
		tauxOccupCour = 0;
		ponderation = 0;
	}
	
	public double getTauxTraitCour() {
		return tauxTraitCour;
	}
	public void setTauxTraitCour(double tauxTraitCour) {
		this.tauxTraitCour = tauxTraitCour;
	}
	public double getTempsAttenteTele() {
		return tempsAttenteTele;
	}
	public void setTempsAttenteTele(double tempsAttenteTele) {
		this.tempsAttenteTele = tempsAttenteTele;
	}
	public double getDelaiRepCour() {
		return delaiRepCour;
	}
	public void setDelaiRepCour(double delaiRepCour) {
		this.delaiRepCour = delaiRepCour;
	}
	public double getTauxOccupTele() {
		return tauxOccupTele;
	}
	public void setTauxOccupTele(double tauxOccupTele) {
		this.tauxOccupTele = tauxOccupTele;
	}
	public double getTauxOccupCour() {
		return tauxOccupCour;
	}
	public void setTauxOccupCour(double tauxOccupCour) {
		this.tauxOccupCour = tauxOccupCour;
	}
	public double getPonderation() {
		return ponderation;
	}
	public void setPonderation(double ponderation) {
		this.ponderation = ponderation;
	}
}
