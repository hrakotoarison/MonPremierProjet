package sn.objis.monprojet;

import junit.framework.TestCase;

public class CalculTest extends TestCase {

	private Calcul calcul;
	
	protected void setUp() throws Exception {
		
		super.setUp();
		
		calcul = new Calcul();
		
	}

	public void testsomme(){
		
		assertTrue(calcul.somme(3, 5)==8);
		
	}
	
	public void testproduit(){
		
		assertTrue(calcul.produit(3, 5)==15);
		
	}
	
}
