package de.eichstaedt.finanzmanager.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;

/**
 * Created by konrad.eichstaedt@gmx.de on 24.01.23.
 */
public class AusgabenTest {

  @Test
  void testErstelleAusgabe() {

    Kategorie lebensmittel = new Kategorie("Lebensmittel", "");
    LocalDateTime jetzt = LocalDateTime.now();
    Ausgabe ausgabe = new Ausgabe(jetzt, 7.05, lebensmittel, "Frühstück am Samstag");

    assertNotNull(ausgabe);
    assertEquals(jetzt,ausgabe.getDatum());
    assertEquals(7.05,ausgabe.getBetrag());
    assertEquals(lebensmittel,ausgabe.getKategorie());
    assertNotNull(ausgabe.getBemerkung());
  }
}