package fr.epsi.atlas;

import static org.junit.Assert.*;
import org.junit.Test;

public class StringTest {

  @Test
  public void upperCaseProduitUneChaineEnMajuscules() throws Exception {
    // Bloc arrange
    String s = "Bonjour le monde";

    // Bloc act
    String maj = s.toUpperCase();

    // Bloc assert
    // assertNotNull("ça ne doit pas être null", maj);
    assertEquals("BONJOUR LE MONDE", maj);
  }

}
