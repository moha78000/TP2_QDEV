package test;

import classes.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanningTest {

    @Test
    void ajout() {
        Planning p1 = new Planning(2);
        Reservation res1 = new Reservation(new Date(10, 3, 2025), new PlageHoraire(new Horaire(10, 0), new Horaire(12, 0)), "Foot");
        Reservation res2 = new Reservation(new Date(11, 3, 2025), new PlageHoraire(new Horaire(12, 0), new Horaire(14, 0)), "Judo");
        Reservation res3 = new Reservation(new Date(12, 3, 2025), new PlageHoraire(new Horaire(9, 0), new Horaire(11, 0)), "Karaté");
        assertTrue(p1.ajout(res1));
        assertTrue(p1.ajout(res2));
        assertFalse(p1.ajout(res3));

    }

    @Test
    void getReservation() {
        Planning planning = new Planning(3);
        Reservation res = new Reservation(new Date(15, 3, 2025), new PlageHoraire(new Horaire(10, 0), new Horaire(12, 0)), "Réunion");
        planning.ajout(res);

        assertEquals(res, planning.getReservation(new Date(15, 3, 2025)));
        assertNull(planning.getReservation(new Date(16, 3, 2025)));
    }
}