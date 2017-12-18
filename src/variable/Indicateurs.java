package variable;

public class Indicateurs {
	private float tauxTraitCour;
	private float tempsAttenteTele;
	private float delaiRepCour;
	private float tauxOccupTele;
	private float tauxOccupCour;
	private float ponderation;
	
	public Indicateurs(){
		tauxTraitCour = 0;
		tempsAttenteTele = 0;
		delaiRepCour = 0;
		tauxOccupTele = 0;
		tauxOccupCour = 0;
		ponderation = 0;
	}
	
	public float getTauxTraitCour() {
		return tauxTraitCour;
	}
	public void setTauxTraitCour(float tauxTraitCour) {
		this.tauxTraitCour = tauxTraitCour;
	}
	public float getTempsAttenteTele() {
		return tempsAttenteTele;
	}
	public void setTempsAttenteTele(float tempsAttenteTele) {
		this.tempsAttenteTele = tempsAttenteTele;
	}
	public float getDelaiRepCour() {
		return delaiRepCour;
	}
	public void setDelaiRepCour(float delaiRepCour) {
		this.delaiRepCour = delaiRepCour;
	}
	public float getTauxOccupTele() {
		return tauxOccupTele;
	}
	public void setTauxOccupTele(float tauxOccupTele) {
		this.tauxOccupTele = tauxOccupTele;
	}
	public float getTauxOccupCour() {
		return tauxOccupCour;
	}
	public void setTauxOccupCour(float tauxOccupCour) {
		this.tauxOccupCour = tauxOccupCour;
	}
	public float getPonderation() {
		return ponderation;
	}
	public void setPonderation(float ponderation) {
		this.ponderation = ponderation;
	}
}
