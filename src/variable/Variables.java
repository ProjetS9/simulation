package variable;

import java.util.ArrayList;
import java.util.List;

public class Variables {
	public static int N = 0, Nt = 0, Ntmax = 0;
	
	public static int NT = 0;	//nombre d'appel (telephone) dans la file d'attente de telephone
	public static int NC = 0;	//nombre de courriel dans la file d'attente de courriel
	public static int NTT = 0;	//nombre de teleconseiller qui sont en train de repondre les telephones
	
	public static double DS = 0;	//Date de simulation
	public static double DDS = 0;	//Derniere date de simulation
	
	public static int counterArrClientT = 0;	//le nombre total d'appels arriv¨¦
	public static int counterArrClientC = 0;	//le nombre total de courriels arriv¨¦
	public static int counterTraitClientC = 0;	////le nombre total de courriels trait¨¦
	public static int counterTraitClientT = 0;
	
	public static List<Teleconseilleur> listTeleconseilleur = new ArrayList<Teleconseilleur>();
	public static List<ClientTelephone> listClientT = new ArrayList<ClientTelephone>();	//la file d'attente de telephone
	public static List<ClientCourriel> listClientC = new ArrayList<ClientCourriel>();	//la file d'attent de courriel
	
	public static boolean stop = false;
	
	public static void init(){
		N = 0; Nt = 0; Ntmax = 0;
		NT = 0; NC = 0; NTT = 0;
		DS = 0; DDS = 0;
		counterArrClientT = 0;
		counterArrClientC = 0;
		counterTraitClientC = 0;
		counterTraitClientT = 0;
		listTeleconseilleur = new ArrayList<Teleconseilleur>();
		listClientT = new ArrayList<ClientTelephone>();
		listClientC = new ArrayList<ClientCourriel>();
	}
	/*
	public Variables() {
		N = 0;
		Nt = 0;
		Ntmax = 0;
		NT = 0;
		NC = 0;
		NTT = 0;
		DS = 8;
		DDS = 8;
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
	public double getDS() {
		return DS;
	}
	public void setDS(double dS) {
		DS = dS;
	}
	public double getDDS() {
		return DDS;
	}
	public void setDDS(double dDS) {
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
	*/
	
}
