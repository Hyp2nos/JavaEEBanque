package banquee.metier;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CreditMetierTest {

	private ICreditMetier metier;
	
	@Before
	public void setUp() throws Exception {
		metier = new CreditMetier();
	}

	@Test
	public void testCalculMensualiter() {

		double capital = 200000;
		int durre = 240;
		double taux = 4.5;
		
		double resultAttendu = 1841.5997706894505;
		
        double m = metier.calculMensualiter(capital, taux, durre);
		
        assertEquals(resultAttendu, m, 0.0000001);
        
	
	}

}
