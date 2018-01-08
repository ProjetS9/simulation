package loi;

import java.util.Random;

public class Lois {
	Random ran = new Random();
	
	public double exponentielle(double lambda){
		double minutes = 0;
		if(lambda >= 0){
			double p = ran.nextFloat();
			minutes = - Math.log(1-p) / (double) lambda;
		}
		else
			minutes = -1;
		return minutes;
	}
	
	
	public double uniforme(double debut, double fin){
		double minutes = 0;
		if(debut > fin)
			return minutes = -1;
		else{
			minutes = debut + ran.nextFloat() * (fin - debut);
		}
		return minutes;
	}
}