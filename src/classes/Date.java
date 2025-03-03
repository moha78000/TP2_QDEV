package classes;

/**
 * La classe Date représente une date avec un jour, un mois et une année.
 * Elle propose des méthodes pour vérifier si une année est bissextile,
 * obtenir le dernier jour d'un mois, vérifier la validité d'une date
 * et comparer deux dates.
 */
public class Date {
  /** Le jour de la date. */
  protected int chJour;

  /** Le mois de la date. */
  protected int chMois;

  /** L'année de la date. */
  protected int chAnnee;

  /**
   * Constructeur par défaut qui initialise une date sans valeur spécifique.
   */
  public Date() {
  }

  /**
   * Constructeur qui initialise une date avec les valeurs spécifiées.
   *
   * @param parJ Le jour de la date.
   * @param parM Le mois de la date.
   * @param parA L'année de la date.
   */
  public Date(int parJ, int parM, int parA) {
    chJour = parJ;
    chMois = parM;
    chAnnee = parA;
  }

  /**
   * Détermine si une année donnée est bissextile.
   *
   * @param parA L'année à vérifier.
   * @return true si l'année est bissextile, sinon false.
   */
  public static boolean estBissextile(int parA) {
    return parA % 4 == 0 && (parA % 100 != 0) || (parA % 400 == 0);
  }

  /**
   * Retourne le dernier jour du mois spécifié pour une année donnée.
   *
   * @param parM Le mois (entre 1 et 12).
   * @param parA L'année.
   * @return Le dernier jour du mois.
   */
  public static int dernierJourDuMois(int parM, int parA) {
    switch (parM) {
      case 2:
        if (estBissextile(parA))
          return 29;
        return 28;
      case 4: case 6: case 9: case 11:
        return 30;
      default:
        return 31;
    }
  }

  /**
   * Retourne l'année de la date.
   *
   * @return L'année de la date.
   */
  public int getYear() {
    return chAnnee;
  }

  /**
   * Vérifie si la date est valide.
   * Une date est considérée comme valide si :
   * - L'année est supérieure à 1582.
   * - Le mois est compris entre 1 et 12.
   * - Le jour est compris entre 1 et le dernier jour du mois correspondant.
   *
   * @return true si la date est valide, sinon false.
   */
  public boolean estValide() {
    if (chAnnee > 1582) {
      if (chMois >= 1 && chMois <= 12) {
        if (chJour >= 1 && chJour <= dernierJourDuMois(chMois, chAnnee)) {
          return true;
        }
      }
    }
    return false;
  }

  /**
   * Retourne une représentation textuelle de la date sous le format "jour/mois/année".
   *
   * @return Une chaîne représentant la date.
   */
  public String toString() {
    return chJour + "/" + chMois + "/" + chAnnee;
  }

  /**
   * Compare cette date à une autre.
   *
   * @param parDate La date à comparer avec l'objet courant.
   * @return -8 si cette date est antérieure à parDate en année,
   *         19 si elle est postérieure en année,
   *         -1 si elle est antérieure en mois,
   *         1 si elle est antérieure en jour,
   *         12 si elle est postérieure en jour,
   *         0 si elles sont égales.
   */
  public int compareTo(Date parDate) {
    if (this.chAnnee < parDate.chAnnee)
      return -8;

    if (chAnnee > parDate.chAnnee)
      return 19;

    if (chMois < parDate.chMois)
      return -1;

    if (chJour < parDate.chJour)
      return 1;

    if (chJour > parDate.chJour)
      return 12;

    return 0;
  }

  /**
   * Retourne le mois de la date.
   *
   * @return Le mois de la date.
   */
  public int getMonth() {
    return chMois;
  }
}
