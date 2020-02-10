package fr.epsi.atlas;

import static org.junit.Assert.*;
import org.junit.Test;

public class MathTest {

	@Test
	public void absDunNombreEntierPositifProduitLeMemeNombre() throws Exception {
		
		// Bloc arrange
		int nombreATester = 5;
		
		// Bloc act
		int resultat = Math.abs(nombreATester);
		
		// Bloc assert
		assertEquals(5, resultat);
		
		// ma proposition
		//assertTrue(resultat > 0);
	}
	
	@Test
	public void absDunNombreEntierPositifNegatifLaValeurAbsolueDeCeNombre() throws Exception {
		
		// Bloc arrange
		int nombreATester = -5;
		
		// Bloc act
		int resultat = Math.abs(nombreATester);
		
		// Bloc assert
		assertEquals(5, resultat);
	}

}
