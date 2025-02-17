public class ClientPlageHoraire {
  public static void main (String [] args){
    Horaire horairedebut = new Horaire(10,0);
    Horaire horairefin = new Horaire(11,15);
    PlageHoraire plagehoraireTest = new PlageHoraire(horairedebut , horairefin);




    System.out.println(plagehoraireTest.toString());
    System.out.println(plagehoraireTest.duree());
    System.out.println(plagehoraireTest.estValide());
    System.out.println(plagehoraireTest.horaireConvert());

  }

}
