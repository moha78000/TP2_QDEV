package test;

import classes.Horaire;
import classes.PlageHoraire;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlageHoraireTest {

    @Test
    void testToString() {
        Horaire start = new Horaire(10, 0); // Assuming Horaire constructor is (int hour, int minute)
        Horaire end = new Horaire(12, 0);
        PlageHoraire plage = new PlageHoraire(start, end);

        assertEquals("10h0 - 12h0, duree 2h0mn", plage.toString());

    }

    @Test
    void estValide() {
        Horaire debut = new Horaire(10, 0);
        Horaire fin = new Horaire(12, 0);
        PlageHoraire plage = new PlageHoraire(debut, fin);

        assertTrue(plage.estValide());
    }

    @Test
    void duree() {
        Horaire h1 = new Horaire(10, 0);
        Horaire h2 = new Horaire(12, 0);
        PlageHoraire p1 = new PlageHoraire(h1, h2);

        assertEquals(120, p1.duree());
    }

    @Test
    void horaireConvert() {
        Horaire start = new Horaire(10, 0);
        Horaire end = new Horaire(11, 10);
        PlageHoraire plage = new PlageHoraire(start, end);

        assertEquals("1h10mn", plage.horaireConvert());
    }

    @Test
    void compareTo() {
        Horaire start1 = new Horaire(10, 0);
        Horaire end1 = new Horaire(12, 0);
        PlageHoraire plage2 = new PlageHoraire(start1, end1);

        Horaire start2 = new Horaire(14, 0);
        Horaire end2 = new Horaire(16, 0);
        PlageHoraire plage3 = new PlageHoraire(start2, end2);

        assertTrue(plage2.compareTo(plage3) < 0);

    }
}