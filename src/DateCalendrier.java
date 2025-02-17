import classes.Date;

import java.util.Calendar;

public class DateCalendrier extends Date {
  private int chJourSemaine;


  public DateCalendrier() {


    Calendar today = Calendar.getInstance();
    chAnnee = today.get(Calendar.YEAR);
    chMois = today.get(Calendar.MONTH) + 1;
    chJour = today.get(Calendar.DAY_OF_MONTH);
  }

  public DateCalendrier(int annee, int mois, int jour) {
    Calendar today = Calendar.getInstance();

    today.set(annee, mois, jour);


  }


}
