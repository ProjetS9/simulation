package variable;

import java.util.ArrayList;
import java.util.List;

public class Variables {
	private int N, Nt, Ntmax;
	
	private int NT;	//nombre d'appel (telephone) dans la file d'attente de telephone
	private int NC;	//nombre de courriel dans la file d'attente de courriel
	private int NTT;	//nombre de teleconseiller qui sont en train de repondre les telephones
	
	private float DS;	//Date de simulation
	private float DDS;	//Derniere date de simulation
	
	private int counterArrClientT;	//le nombre total d'appels arriv¨¦
	private int counterArrClientC;	//le nombre total de courriels arriv¨¦
	private int counterTraitClientC;	////le nombre total de courriels trait¨¦
	
	private List<Teleconseilleur> listTeleconseilleur;
	private List<ClientTelephone> listClientT;	//la file d'attente de telephone
	private List<ClientCourriel> listClientC;	//la file d'attent de courriel
	
	public Variables() {
		N = 0;
		Nt = 0;
		Ntmax = 0;
		NT = 0;
		NC = 0;
		NTT = 0;
		DS = 0;
		DDS = 0;
		counterArrClientT = 0;
		counterArrClientC = 0;
		counterTraitClientC = 0;
		
		listTeleconseilleur = new ArrayList<Teleconseilleur>();
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
	public float getDS() {
		return DS;
	}
	public void setDS(float dS) {
		DS = dS;
	}
	public float getDDS() {
		return DDS;
	}
	public void setDDS(float dDS) {
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
		return listTeleconseilleur;
	}
	public void setListTeleconseilleur(List<Teleconseilleur> listTeleconseilleur) {
		this.listTeleconseilleur = listTeleconseilleur;
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
