package variable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Variables {
	private int N, Nt, Ntmax;
	
	private int NT;	//nombre d'appel (telephone) dans la file d'attente de telephone
	private int NC;	//nombre de courriel dans la file d'attente de courriel
	private int NTT;	//nombre de teleconseiller qui sont en train de repondre les telephones
	
	private Date DS;	//Date de simulation
	private Date DDS;	//Derniere date de simulation
	
	private int counterArrClientT;	//le nombre total d'appels arriv��
	private int counterArrClientC;	//le nombre total de courriels arriv��
	private int counterTraitClientC;	////le nombre total de courriels trait��
	
	private List<Teleconseilleur> listTeleconseulleur;
	private List<ClientTelephone> listClientT;	//la file d'attente de telephone
	private List<ClientCourriel> listClientC;	//la file d'attent de courriel
	
	public Variables() {
		N = 0;
		Nt = 0;
		Ntmax = 0;
		NT = 0;
		NC = 0;
		NTT = 0;
		DS = new Date();
		DDS = new Date();
		counterArrClientT = 0;
		counterArrClientC = 0;
		counterTraitClientC = 0;
		
		listTeleconseulleur = new ArrayList<Teleconseilleur>();
		listClientT = new ArrayList<ClientTelephone>();
		listClientC = new ArrayList<ClientCourriel>();
	}
	
	public int getN() {
		return N;
	}
	public void setN(int n) {
		N = n;
	}
	public int getNt() {
		return Nt;
	}
	public void setNt(int nt) {
		Nt = nt;
	}
	public int getNtmax() {
		return Ntmax;
	}
	public void setNtmax(int ntmax) {
		Ntmax = ntmax;
	}
	public int getNT() {
		return NT;
	}
	public void setNT(int nT) {
		NT = nT;
	}
	public int getNC() {
		return NC;
	}
	public void setNC(int nC) {
		NC = nC;
	}
	public int getNTT() {
		return NTT;
	}
	public void setNTT(int nTT) {
		NTT = nTT;
	}
	public Date getDS() {
		return DS;
	}
	public void setDS(Date dS) {
		DS = dS;
	}
	public Date getDDS() {
		return DDS;
	}
	public void setDDS(Date dDS) {
		DDS = dDS;
	}
	public int getCounterArrClientT() {
		return counterArrClientT;
	}
	public void setCounterArrClientT(int counterArrClientT) {
		this.counterArrClientT = counterArrClientT;
	}
	public int getCounterArrClientC() {
		return counterArrClientC;
	}
	public void setCounterArrClientC(int counterArrClientC) {
		this.counterArrClientC = counterArrClientC;
	}
	public int getCounterTraitClientC() {
		return counterTraitClientC;
	}
	public void setCounterTraitClientC(int counterTraitClientC) {
		this.counterTraitClientC = counterTraitClientC;
	}
	public List<Teleconseilleur> getListTeleconseulleur() {
		return listTeleconseulleur;
	}
	public void setListTeleconseulleur(List<Teleconseilleur> listTeleconseulleur) {
		this.listTeleconseulleur = listTeleconseulleur;
	}
	public List<ClientTelephone> getListClientT() {
		return listClientT;
	}
	public void setListClientT(List<ClientTelephone> listClientT) {
		this.listClientT = listClientT;
	}
	public List<ClientCourriel> getListClientC() {
		return listClientC;
	}
	public void setListClientC(List<ClientCourriel> listClientC) {
		this.listClientC = listClientC;
	}
	
}
