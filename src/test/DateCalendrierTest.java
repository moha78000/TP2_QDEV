package test;
import classes.DateCalendrier;

import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;
public class DateCalendrierTest {
    @Test
    public void testConstructeurSansParametre() {
        // Création d'un objet DateCalendrier avec le constructeur sans paramètres
        DateCalendrier date = new DateCalendrier();

        // Récupération de la date actuelle
        Calendar today = Calendar.getInstance();
        int expectedJour = today.get(Calendar.DAY_OF_MONTH);
        int expectedMois = today.get(Calendar.MONTH) + 1;
        int expectedAnnee = today.get(Calendar.YEAR);

        // Vérification que la date correspond bien à aujourd'hui
        assertEquals(expectedJour, date.chJour);
        assertEquals(expectedMois, date.chMois);
        assertEquals(expectedAnnee, date.chAnnee);
    }

    @Test
    public void testConstructeurAvecParametres() {
        // Création d'une date spécifique
        DateCalendrier date = new DateCalendrier(2024, 3, 3);

        // Vérification que la date est bien initialisée
        assertEquals(3, date.chJour);
        assertEquals(3, date.chMois);
        assertEquals(2024, date.chAnnee);
    }

    @Test
    public void testEstValide() {
        // Test avec une date valide
        DateCalendrier dateValide = new DateCalendrier(2024, 2, 29); // Année bissextile
        assertTrue(dateValide.estValide());

        // Test avec une date invalide
        DateCalendrier dateInvalide = new DateCalendrier(2023, 2, 29); // Pas bissextile
        assertFalse(dateInvalide.estValide());
    }

    @Test
    public void testToString() {
        // Création d'une date et test de la conversion en chaîne de caractères
        DateCalendrier date = new DateCalendrier(2025, 12, 25);
        assertEquals("25/12/2025", date.toString());
    }

}
