import classes.Date;

public class Planning {
  private Reservation[] chTabReservations; // tableau = liste de taille fixe
  private final int TAILLE;

  public Planning(int parTaille) {
    TAILLE = parTaille;
    chTabReservations = new Reservation[TAILLE];
  }

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
      if (chTabReservations[i].compareTo(parReservation) == 0) {    // empecher l'ajout d'une reservation deja presente au meme jour , meme heure
        System.out.println("reservations non compatibles");
        return false;
      }
    }
    return false;
  }

  public String toString() {
    String result = "Réservation de taille " + TAILLE + "\n";

    for (int i = 0; i < chTabReservations.length; i++) {
      if (chTabReservations[i] != null) {
        result += chTabReservations[i].toString();
      }
    }
    return result;
  }


  public Reservation getReservation(Date parDate) {
    for (int i = 0; i < chTabReservations.length; i++) {
      if (chTabReservations[i] != null && chTabReservations[i].getDate().compareTo(parDate) == 0)
        return chTabReservations[i];
    }
    return null;
  }

  public Reservation [] getReservations(Date parDate) {

    Reservation[] tabReservations = new Reservation[TAILLE];
    int nbReservations = 0;
    for (int i = 0; i < chTabReservations.length; i++) {
      if (chTabReservations[i].getDate().compareTo(parDate) == 0) {
        tabReservations[nbReservations] = chTabReservations[i];
        nbReservations++;
      }


    }
    return tabReservations;

  }


}
