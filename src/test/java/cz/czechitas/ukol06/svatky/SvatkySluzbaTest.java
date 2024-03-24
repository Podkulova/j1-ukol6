package cz.czechitas.ukol06.svatky;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.Month;
import java.time.MonthDay;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SvatkySluzbaTest {

    @Test
    void vyhledatSvatkyKeDni() throws IOException {
        // Vytvoření instance třídy SvatkySluzba
        SvatkySluzba sluzba = new SvatkySluzba();

        // Testovací den (např. 1. ledna)
        MonthDay testovaciDen = MonthDay.of(Month.JANUARY, 3);

        // Očekávaný výstup
        List<String> ocekavanyVystup = List.of("Radmila", "Jenovefa", "Radomil");
        List<String> ocekavanyVystup2 = List.of("Radmila", "Jenovefa");

        // Zavolání metody vyhledatSvatkyKeDni() pro testovací den
        List<String> vysledek = sluzba.vyhledatSvatkyKeDni(testovaciDen);

        // Porovnání očekávaného výstupu s výstupem metody
        assertEquals(ocekavanyVystup, vysledek);
        assertNotEquals(ocekavanyVystup2,vysledek);

    }
}
