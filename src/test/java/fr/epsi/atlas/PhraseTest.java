package fr.epsi.atlas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PhraseTest {
	
	private Phrase phrase = new Phrase();
//	private String motATester;
//	private String[] plusieursMotsATester;
	
//	@Before
//	public void creerPhrase() {
//		this.phrase = new Phrase();
//		this.motATester = "Bonjour";
//		this.plusieursMotsATester = new String[2];
//		this.plusieursMotsATester[0] = "Bonjour";
//		this.plusieursMotsATester[1] = "Alex";
//	}

	@Test
	public void getNbrDeLettresLesNombresDeLettresSontCorrects() throws Exception {
		
		phrase.ajouter("bonjour");
		
		int resultat = phrase.getNbLettres();
		
		assertEquals(7, resultat);
	}
	
//	@Test
//	public void getNbrDeLettresAvecCharacteresNonAlfabethique() throws Exception {
//		
//		phrase.ajouter("42", "est la response");
//		
//		int resultat = phrase.getNbLettres();
//		
//		assertEquals(13, resultat);
//	}

	@Test
	public void getNbrDeLettresLesNombresDeLettresSontPasCorrects() throws Exception {
		
		phrase.ajouter("bonjour");
		
		int resultat = phrase.getNbLettres();
		
		assertNotEquals(5, resultat);
	}
	
	@Test
	public void ajouterAvecUneSeuleParametreAjouteLeBonMot() throws Exception {
		
		phrase.ajouter("bonjour");
		
		assertEquals("bonjour" + ".", phrase.toString());
	}
	
	@Test
	public void ajouterAvecPlusieursParametresAjouteLesBonsMots() throws Exception {
		
		phrase.ajouter("Bonjour", "Alex");
		phrase.ajouter("Metsemakers");
		
		assertEquals("Bonjour Alex Metsemakers.", phrase.toString());
	}
	
	@Test
	public void setSeperateurCharModifieLeSeparateurParDefaut() throws Exception {
		
		String separateurATester = "*";
		
		phrase.setSeparateur(separateurATester);
		phrase.ajouter("Bonjour", "Alex");
		
		assertEquals("Bonjour*Alex.", phrase.toString());
	}

	@Test
	public void setSeperateurStringModifieLeSeparateurParDefaut() throws Exception {
		
		String separateurATester = "Seperateur";
		
		phrase.setSeparateur(separateurATester);
		phrase.ajouter("Bonjour", "Alex");
		
		assertEquals("BonjourSeperateurAlex.", phrase.toString());
	}
}
