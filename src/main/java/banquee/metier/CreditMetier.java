package banquee.metier;

public class CreditMetier implements ICreditMetier {

	@Override
	public double calculMensualiter(double capital, double taux, int durre) {
		// TODO Auto-generated method stub
		
		double t=taux/100;
		double t1=capital*t/12;
		double t2=Math.pow(1+t/12, -durre);
		return t1/t2;
	}
	
}
