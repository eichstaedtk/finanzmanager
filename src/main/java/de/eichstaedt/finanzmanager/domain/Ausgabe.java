package de.eichstaedt.finanzmanager.domain;

import java.time.LocalDateTime;

/**
 * Created by konrad.eichstaedt@gmx.de on 24.01.23.
 */
public class Ausgabe {

  private LocalDateTime datum;
  private double betrag;
  private Kategorie kategorie;
  private String bemerkung;

  public Ausgabe(LocalDateTime datum, double betrag, Kategorie kategorie, String bemerkung) {
    this.datum = datum;
    this.betrag = betrag;
    this.kategorie = kategorie;
    this.bemerkung = bemerkung;
  }

  public LocalDateTime getDatum() {
    return datum;
  }

  public double getBetrag() {
    return betrag;
  }

  public Kategorie getKategorie() {
    return kategorie;
  }

  public String getBemerkung() {
    return bemerkung;
  }
}
