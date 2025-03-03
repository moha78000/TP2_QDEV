package classes;

/**
 * La classe PlageHoraire représente une plage horaire définie par une heure de début et une heure de fin.
 * Elle permet de vérifier la validité de la plage horaire et de calculer sa durée.
 */
public class PlageHoraire {
  /** Durée minimale en minutes pour qu'une plage horaire soit considérée comme valide. */
  private final int DUREE_MIN = 60;

  /** L'heure de début de la plage horaire. */
  private Horaire chHoraireDebut;

  /** L'heure de fin de la plage horaire. */
  private Horaire chHoraireFin;

  /**
   * Constructeur qui initialise une plage horaire avec une heure de début et une heure de fin.
   *
   * @param parHoraireDebut L'horaire de début.
   * @param parHoraireFin L'horaire de fin.
   */
  public PlageHoraire(Horaire parHoraireDebut, Horaire parHoraireFin) {
    chHoraireDebut = parHoraireDebut;
    chHoraireFin = parHoraireFin;
  }

  /**
   * Retourne une représentation textuelle de la plage horaire.
   *
   * @return Une chaîne de caractères sous la forme "hh:mm - hh:mm, durée XhYm".
   */
  public String toString() {
    return chHoraireDebut.toString() + " - " + chHoraireFin.toString() + ", durée " + horaireConvert();
  }

  /**
   * Vérifie si la plage horaire est valide.
   * Une plage horaire est valide si la durée est supérieure à {@code DUREE_MIN} minutes.
   *
   * @return true si la plage est valide, false sinon.
   */
  public boolean estValide() {
    return chHoraireFin.toMinutes() - chHoraireDebut.toMinutes() > DUREE_MIN;
  }

  /**
   * Calcule la durée totale de la plage horaire en minutes.
   *
   * @return La durée en minutes.
   */
  public int duree() {
    return chHoraireFin.toMinutes() - chHoraireDebut.toMinutes();
  }

  /**
   * Convertit la durée de la plage horaire en format heures et minutes.
   *
   * @return Une chaîne représentant la durée sous la forme "XhYm".
   */
  public String horaireConvert() {
    int temps = duree();
    int heure = temps / 60;
    int quartHeure = temps % 60;
    return heure + "h" + quartHeure + "mn";
  }

  /**
   * Compare cette plage horaire avec une autre plage horaire donnée.
   *
   * @param parPlageHoraire La plage horaire à comparer.
   * @return Un entier :
   *         - **Négatif (-18)** si cette plage est avant la plage donnée.
   *         - **Positif (+14)** si cette plage est après la plage donnée.
   *         - **0** si les plages sont égales, incluses l'une dans l'autre ou se chevauchent.
   */
  public int compareTo(PlageHoraire parPlageHoraire) {
    if (this.chHoraireFin.toMinutes() <= parPlageHoraire.chHoraireDebut.toMinutes()) {
      return -18;
    }

    if (parPlageHoraire.chHoraireFin.toMinutes() <= this.chHoraireDebut.toMinutes()) {
      return +14;
    }

    return 0;
  }
}
