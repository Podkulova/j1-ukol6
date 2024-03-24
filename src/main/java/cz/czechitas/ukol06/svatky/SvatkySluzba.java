package cz.czechitas.ukol06.svatky;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.IOException;
import java.nio.file.Path;
import java.time.MonthDay;
import java.util.List;

public class SvatkySluzba {

    private final ObjectMapper objectMapper = JsonMapper.builder()
            .addModule(new JavaTimeModule())
            .build();
    private final Path cestaKDatum = Path.of("data/svatky.json");
    private final SeznamSvatku seznamSvatku;

    public SvatkySluzba() throws IOException {
        //  načíst seznam svátků ze souboru svatky.json

        // Následující řádek po vlastní implementaci smažete.
        seznamSvatku = objectMapper.readValue(cestaKDatum.toFile(),SeznamSvatku.class);
    }

    public List<String> vyhledatSvatkyDnes() {
        return vyhledatSvatkyKeDni(MonthDay.now());
    }

    public List<String> vyhledatSvatkyKeDni(MonthDay day) {
        // TODO
        // získat seznam svátků
       List<Svatek> vsechnySvatky = seznamSvatku.getSvatky();

        // převést na Stream

        List<String> svatkyProDanyDen = vsechnySvatky.stream()
                .filter( jedensvatek -> day.equals(jedensvatek.getDen()))
                .filter(jedenSvatek -> jedenSvatek.getJmeno().length() > 3)
                .map(Svatek::getJmeno)
                .filter(jmeno -> jmeno.length() > 3)
                .toList();

        return svatkyProDanyDen;
    }
}
