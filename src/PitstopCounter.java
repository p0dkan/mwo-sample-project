package src;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class PitstopCounter {

    // Zwraca liczbę pitstopów
    public int countPitstops(String jsonFilePath) throws IOException {
        return getPitstops(jsonFilePath).size();
    }

    // Zwraca listę pitstopów
    public List<Pitstop> getPitstops(String jsonFilePath) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(jsonFilePath), new TypeReference<List<Pitstop>>() {});
    }
}
