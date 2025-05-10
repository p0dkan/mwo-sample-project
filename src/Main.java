package src;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PitstopCounter counter = new PitstopCounter();
        try {
            // Pobierz listę pitstopów
            List<Pitstop> pitstops = counter.getPitstops("pitstopy.json");
            int liczbaPitstopow = pitstops.size();

            // Pobierz datę pierwszego pitstopa i sformatuj ją
            String date = pitstops.get(0).getDate();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String formattedDate = OffsetDateTime.parse(date).format(formatter);

            // Wyświetl wynik
            System.out.println("Liczba pitstopów w wyścigu z dnia: " + formattedDate + " wyniosła " + liczbaPitstopow);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
