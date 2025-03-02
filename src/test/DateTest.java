package test;

import java.util.Calendar;

import classes.Date;
import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @org.junit.jupiter.api.Test
    void estBissextile() {
        Date date = new Date(10,12,2024);
        int annee_date = date.getYear();
        assertTrue(date.estBissextile(annee_date));
    }

    @org.junit.jupiter.api.Test
    void dernierJourDuMois() {
        Date date = new Date(14,2,2025);
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
        assertEquals(28,Date.dernierJourDuMois(date.getMonth(),date.getYear()));
    }

    @org.junit.jupiter.api.Test
    void estValide() {
        Date date1 = new Date(20, 12,2024);
        Date date2 = new Date(20,2,2034);
        assertTrue(date1.estValide());
        assertTrue(date2.estValide());
    }

    @org.junit.jupiter.api.Test
    void compareTo() {
        Date date1 = new Date(20, 12,2024);
        Date date2 = new Date(20,2,2014);
        assertFalse(date1.compareTo(date2) == 0);

        Date date3 = new Date(20, 12,2024);
        assertTrue(date1.compareTo(date3) == 0);
    }
}