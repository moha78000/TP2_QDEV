package classes;

/**
 * La classe Horaire représente une heure sous forme d'heures et de quarts d'heure.
 * Un quart d'heure correspond à 15 minutes.
 */
public class Horaire {
  /** L'heure de l'horaire (de 0 à 23). */
  private int chHeure;

  /** Le nombre de quarts d'heure (0, 15, 30 ou 45 minutes). */
  private int chQuartHeure;

  /**
   * Constructeur qui initialise un horaire avec une heure et un quart d'heure.
   *
   * @param parHeure L'heure (0 à 23).
   * @param parQuartHeure Le quart d'heure (0, 15, 30, 45).
   */
  public Horaire(int parHeure, int parQuartHeure) {
    chHeure = parHeure;
    chQuartHeure = parQuartHeure;
  }

  /**
   * Convertit l'horaire en minutes depuis le début de la journée.
   *
   * @return Le nombre total de minutes écoulées depuis minuit.
   */
  public int toMinutes() {
    return chHeure * 60 + chQuartHeure;
  }

  /**
   * Retourne l'heure de l'horaire.
   *
   * @return L'heure.
   */
  public int getHeure() {
    return chHeure;
  }

  /**
   * Retourne le nombre de minutes correspondant aux quarts d'heure.
   *
   * @return Le nombre de minutes (0, 15, 30 ou 45).
   */
  public int getQuartHeure() {
    return chQuartHeure;
  }

  /**
   * Définit une nouvelle heure.
   *
   * @param parHeure La nouvelle heure (0 à 23).
   */
  public void setHeure(int parHeure) {
    chHeure = parHeure;
  }

  /**
   * Définit un nouveau quart d'heure.
   *
   * @param parQuartHeure Le nouveau quart d'heure (0, 15, 30, 45).
   */
  public void setQuartHeure(int parQuartHeure) {
    chQuartHeure = parQuartHeure;
  }

  /**
   * Retourne une représentation textuelle de l'horaire au format "hhh:mm".
   *
   * @return Une chaîne représentant l'horaire.
   */
  public String toString() {
    return chHeure + "h" + chQuartHeure;
  }
}
