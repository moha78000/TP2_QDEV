package classes;

import java.util.Calendar;
/**
 * La classe DateCalendrier représente une date en utilisant la classe Calendar de Java.
 * Elle hérite de la classe {@code Date} et permet d'initialiser une date avec le jour actuel
 * ou une date spécifique.
 */

public class DateCalendrier extends Date {
  /** Le jour de la semaine correspondant à la date. */
  private int chJourSemaine;

  /**
   * Constructeur par défaut qui initialise la date avec la date actuelle du système.
   */
  public DateCalendrier() {


    Calendar today = Calendar.getInstance();
    chAnnee = today.get(Calendar.YEAR);
    chMois = today.get(Calendar.MONTH) + 1;
    chJour = today.get(Calendar.DAY_OF_MONTH);
  }
  /**
   * Constructeur qui initialise une date spécifique.
   *
   * @param annee L'année de la date.
   * @param mois Le mois de la date (1 à 12).
   * @param jour Le jour du mois.
   */

  public DateCalendrier(int annee, int mois, int jour) {
    Calendar today = Calendar.getInstance();

    today.set(annee, mois, jour);


  }


}
