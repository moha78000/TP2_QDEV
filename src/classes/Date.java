package classes;

public class Date {
  protected int chJour;
  protected int chMois;
  protected int chAnnee;

  public Date(){
  }


  public Date (int parJ ,int parM , int parA ){
    chJour = parJ;
    chMois = parM;
    chAnnee = parA;


  }


  public static boolean estBissextile(int parA) {
    return parA%4==0 && (parA%100!=0) || (parA%400==0);
  }


  public static int dernierJourDuMois ( int parM , int parA){
    switch (parM) {  // prend le parM est vérifier sa valeur
      case 2: if (estBissextile(parA))
        return 29;
      return 28;
      case 4: case 6: case 9: case 11: return 30;
      default: return 31;
    }

  }

  public int getYear(){
    return chAnnee;
  }

  public boolean estValide() {
    if (chAnnee > 1582){
      if (chMois >= 1 && chMois<= 12  ) {
        if (chJour >= 1 && chJour <= dernierJourDuMois(chMois, chAnnee))

          return true;
      }
    }return false;
  }





  public String toString() {
      return chJour + "/" + chMois + "/" + chAnnee;
  }


  public  int compareTo(Date parDate){
    if (this.chAnnee < parDate.chAnnee)
      return -8;

    if (chAnnee>parDate.chAnnee)
      return 19;

    if (chMois < parDate.chMois)
      return -1;

    if (chJour < parDate.chJour)
      return 1;


    if (chJour > parDate.chJour)
      return 12;

    return 0;


  }
  public int getMonth(){
    return chMois;
  }

}
