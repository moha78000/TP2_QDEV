public class PlageHoraire {
  private  final int DUREE_MIN = 60 ;
  private Horaire chHoraireDebut;
  private Horaire chHoraireFin;
  public PlageHoraire(Horaire parHoraireDebut , Horaire parHoraireFin){
    chHoraireDebut=parHoraireDebut;
    chHoraireFin = parHoraireFin;
  }

  public String toString(){
    return chHoraireDebut.toString()+ " - " + chHoraireFin.toString() +"," +  " duree "+ horaireConvert();
  }
  public boolean estValide() {
    if (chHoraireFin.toMinutes() - chHoraireDebut.toMinutes() > DUREE_MIN)
      return true;
    return false;
  }
  public int duree(){
    return chHoraireFin.toMinutes() - chHoraireDebut.toMinutes();

  }

  public String horaireConvert(){
    int temps = duree();
    int heure = temps / 60;
    int quartheure = temps - heure * 60;
    return heure + "h" + quartheure + "mn";
  }
  public int compareTo(PlageHoraire parPlageHoraire){
    if (this.chHoraireFin.toMinutes()<= parPlageHoraire.chHoraireDebut.toMinutes())
      return -18;

    if (parPlageHoraire.chHoraireFin.toMinutes()<= this.chHoraireDebut.toMinutes())
      return +14;

    return 0;
    /** compare this (l'objet appelant) et une plage horaire  donnée en paramètre
     * @return un entier
     *    négatif si this est  antérieur à la plage horaire donnée en paramètre
     *    positif  si this est postérieur  à la plage horaire donnée en paramètre
     *    0 si les 2 plages sont égales , si l'une inclus dans l'autre ou si il ya chevauchlent
     * @param la plage horaire à comparer
     */

  }



}

