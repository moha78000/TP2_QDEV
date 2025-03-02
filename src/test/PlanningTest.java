package test;

import classes.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanningTest {

    @Test
    void ajout() {
        Planning p1 = new Planning(2);
        Reservation res1 = new Reservation(new Date(10, 3, 2025), new PlageHoraire(new Horaire(10, 0), new Horaire(11, 0)), "Foot");
        Reservation res2 = new Reservation(new Date(11, 3, 2025), new PlageHoraire(new Horaire(12, 0), new Horaire(13, 0)), "Judo");
        Reservation res3 = new Reservation(new Date(12, 3, 2025), new PlageHoraire(new Horaire(9, 0), new Horaire(10, 0)), "Karaté");
        assertTrue(p1.ajout(res1));
        assertTrue(p1.ajout(res2));
        assertFalse(p1.ajout(res3));

    }

    @Test
    void getReservation() {
    }

    @Test
    void getReservations() {
    }
}