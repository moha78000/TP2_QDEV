package test;

import classes.Date;
import classes.Horaire;
import classes.PlageHoraire;
import classes.Reservation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {

    @Test
    void compareTo() {

    }

    @Test
    void estValide() {
        PlageHoraire plage1 = new PlageHoraire(new Horaire(10,0) , new Horaire(12,0));
        Reservation res1 = new Reservation(new Date(15, 3, 2025), plage1 , "Foot");

        PlageHoraire plage2 = new PlageHoraire(new Horaire(12,0) , new Horaire(14,0));

        Reservation res2 = new Reservation(new Date(16, 3, 2025), plage2, "Badminton");

        PlageHoraire plage3 = new PlageHoraire(new Horaire(14,0) , new Horaire(16,0));
        Reservation res3 = new Reservation(new Date(15, 3, 2025), plage3,"Yoga");


        assertFalse(res1.compareTo(res2)==0);
        assertTrue(res2.compareTo(res1) > 0);
        assertEquals(-18, res1.compareTo(res3));
    }

    @Test
    void getDate() {
    }
}