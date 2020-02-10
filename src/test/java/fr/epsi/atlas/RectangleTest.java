package fr.epsi.atlas;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTest {
	
	Rectangle rectangle;

	@Test
	public void constructeurCreeLongueur() throws Exception {
		rectangle = new Rectangle(10, 2.6);
		
		assertEquals(10, rectangle.getLongueur(), .00001);
	}
	
	@Test
	public void constructeurCreeLargeur() throws Exception {
		rectangle = new Rectangle(10, 2.6);
		
		assertEquals(2.6, rectangle.getLargeur(), .00001);
	}
	
	@Test
	public void constructeurLanceLongueurLargeurInvalideExceptionAvecLongueurNegatif() throws Exception {
		try {
			rectangle = new Rectangle(-10,2.6);
			fail("LongueurLargeurException expected.");
		} catch (LongueurLargeurInvalideException e) {
			assertEquals("La longueur doit être un nom positif !", e.getMessage());
		}
	}
	
	@Test
	public void constructeurLanceLongueurLargeurInvalideExceptionAvecLargeurNegatif() throws Exception {
		try {
			rectangle = new Rectangle(10, -2.6);
			fail("LongueurLargeurException expected.");
		} catch (LongueurLargeurInvalideException e) {
			assertEquals("La largeur doit être un nom positif !", e.getMessage());
		}
	}
	
	@Test
	public void getPerimetre() throws Exception {
		rectangle = new Rectangle(4, 2);
		
		double resultat = (4 + 2) * 2;
		
		assertEquals(resultat, rectangle.getPerimetre(), .00001);
	}
	
	@Test
	public void getAire() throws Exception {
		rectangle = new Rectangle(4, 2);
		
		double resultat = 4 * 2;
		
		assertEquals(resultat, rectangle.getAire(), .00001);
	}
	
	@Test
	public void toStringRetourneString() throws Exception {
		rectangle = new Rectangle(4, 2);
		
		assertEquals("Rectangle de longueur 4.0 et de largeur 2.0", rectangle.toString());
	}
}
