package metier;

public class CreditMetier {
  public double calculMensualite(double c,int duree, double taux) {
	 double t=taux/100;
	  double t1= c*t/12; // cout mentiel
	  double t2= 1-Math.pow((1+t/12),-duree);
	 // double t3= 
	  return t1/t2;
  };
	
}
