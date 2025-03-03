package classes;

/**
 * La classe Planning représente un ensemble de réservations limité en taille.
 * Elle permet d'ajouter des réservations, de les récupérer selon une date et d'afficher l'ensemble des réservations.
 */
public class Planning {
  /** Tableau contenant les réservations. */
  private Reservation[] chTabReservations;

  /** Taille maximale du planning. */
  private final int TAILLE;

  /**
   * Constructeur qui initialise un planning avec une capacité donnée.
   *
   * @param parTaille La taille maximale du planning.
   */
  public Planning(int parTaille) {
    TAILLE = parTaille;
    chTabReservations = new Reservation[TAILLE];
  }

  /**
   * Ajoute une réservation au planning si l'espace est disponible et si elle est valide.
   *
   * @param parReservation La réservation à ajouter.
   * @return true si l'ajout est réussi, false sinon.
   */
  public boolean ajout(Reservation parReservation) {
    if (chTabReservations[TAILLE - 1] != null) {
      System.out.println("Tableau plein");
      return false;
    }

    if (!parReservation.estValide()) {
      System.out.println("Réservation non valide");
      return false;
    }

    for (int i = 0; i < chTabReservations.length; i++) {
      if (chTabReservations[i] == null) {
        chTabReservations[i] = parReservation;
        return true;
      }

      if (chTabReservations[i].compareTo(parReservation) == 0) {
        System.out.println("Réservations non compatibles");
        return false;
      }
    }
    return false;
  }

  /**
   * Retourne une représentation textuelle du planning et de ses réservations.
   *
   * @return Une chaîne de caractères contenant les informations des réservations.
   */
  public String toString() {
    String result = "Réservation de taille " + TAILLE + "\n";

    for (int i = 0; i < chTabReservations.length; i++) {
      if (chTabReservations[i] != null) {
        result += chTabReservations[i].toString() + "\n";
      }
    }
    return result;
  }

  /**
   * Recherche une réservation correspondant à une date donnée.
   *
   * @param parDate La date à rechercher.
   * @return La réservation trouvée ou null si aucune correspondance.
   */
  public Reservation getReservation(Date parDate) {
    for (int i = 0; i < chTabReservations.length; i++) {
      if (chTabReservations[i] != null && chTabReservations[i].getDate().compareTo(parDate) == 0) {
        return chTabReservations[i];
      }
    }
    return null;
  }

  /**
   * Récupère toutes les réservations correspondant à une date donnée.
   *
   * @param parDate La date des réservations recherchées.
   * @return Un tableau contenant les réservations correspondantes.
   */
  public Reservation[] getReservations(Date parDate) {
    Reservation[] tabReservations = new Reservation[TAILLE];
    int nbReservations = 0;

    for (int i = 0; i < chTabReservations.length; i++) {
      if (chTabReservations[i] != null && chTabReservations[i].getDate().compareTo(parDate) == 0) {
        tabReservations[nbReservations] = chTabReservations[i];
        nbReservations++;
      }
    }
    return tabReservations;
  }
}
