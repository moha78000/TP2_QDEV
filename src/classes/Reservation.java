package classes;

/**
 * La classe Reservation représente une réservation avec une date, une plage horaire et un titre.
 */
public class Reservation {
  /** La date de la réservation. */
  private Date chDate;

  /** La plage horaire de la réservation. */
  private PlageHoraire chPlageHoraire;

  /** Le titre de la réservation. */
  private String chTitre;

  /**
   * Constructeur permettant de créer une réservation avec une date, une plage horaire et un titre.
   *
   * @param parDate        La date de la réservation.
   * @param parPlageHoraire La plage horaire associée à la réservation.
   * @param parTitre       Le titre de la réservation.
   */
  public Reservation(Date parDate, PlageHoraire parPlageHoraire, String parTitre) {
    chDate = parDate;
    chPlageHoraire = parPlageHoraire;
    chTitre = parTitre;
  }

  /**
   * Retourne une représentation textuelle de la réservation.
   *
   * @return Une chaîne contenant le titre, la date et la plage horaire de la réservation.
   */
  public String toString() {
    return chTitre + " , " + chDate.toString() + ", " + chPlageHoraire;
  }

  /**
   * Compare cette réservation avec une autre réservation.
   *
   * @param parReservation La réservation à comparer.
   * @return Un entier :
   *         - **Négatif** si cette réservation est antérieure à l'autre.
   *         - **Positif** si cette réservation est postérieure à l'autre.
   *         - **0** si elles sont identiques en date et en plage horaire.
   */
  public int compareTo(Reservation parReservation) {
    if (this.chDate.compareTo(parReservation.chDate) == 0) {
      return this.chPlageHoraire.compareTo(parReservation.chPlageHoraire);
    }
    return this.chDate.compareTo(parReservation.chDate);
  }

  /**
   * Vérifie si la réservation est valide.
   * Une réservation est valide si la date et la plage horaire sont valides.
   *
   * @return true si la réservation est valide, false sinon.
   */
  public boolean estValide() {
    return chDate.estValide() && chPlageHoraire.estValide();
  }

  /**
   * Retourne la date de la réservation.
   *
   * @return La date de la réservation.
   */
  public Date getDate() {
    return chDate;
  }
}
