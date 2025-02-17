package test;

import java.util.Calendar;

import classes.Date;
import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @org.junit.jupiter.api.Test
    void estBissextile() {
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
        Date date1 = new Date(2012, 12,24);
        Date date2 = new Date(2014,2,34);
    }

    @org.junit.jupiter.api.Test
    void compareTo() {
    }
}