import classes.Date;

public class ClientPlanning {
  public static void main(String[] args) {

    Date dateTest = new Date(30,4,2022);
    Date dateTest1 = new Date(25,4,2022);
    Date dateTest4 = new Date(6,2,2024);
    Date dateTest2 = new Date(5,7 , 2024);

    Horaire horairedebut = new Horaire(18,0);
    Horaire horairefin = new Horaire(20,0);
    PlageHoraire plagehoraireTest = new PlageHoraire(horairedebut , horairefin);


    Planning planning1 = new Planning(5);

    Reservation reservation1 = new Reservation(dateTest, plagehoraireTest, "Foot");
    Reservation reservation2 = new Reservation(dateTest2, plagehoraireTest, "Musuclation");
    Reservation reservation4 = new Reservation(dateTest4, plagehoraireTest, "Développé couché");
    planning1.ajout(reservation1);
    planning1.ajout(reservation2);
    planning1.ajout(reservation4);

    System.out.println(planning1.toString());

  }

}
