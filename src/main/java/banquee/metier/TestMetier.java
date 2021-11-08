package banquee.metier;

public class TestMetier {

	public static void main(String[] args) {
		CreditMetier credit = new CreditMetier();
		double capital = 200000;
		int durre = 240;
		double taux = 4.5;
		
		double m = credit.calculMensualiter(capital, taux, durre);
		
		System.out.println(m);
	}
}
