package src;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String path = "pitstops-data.json"; // podaj prawidłową ścieżkę do pliku

        List<PitStopEntry> pitStops = JsonReader.readJsonListFromFile(
                path,
                new TypeReference<List<PitStopEntry>>() {}
        );

//        if (pitStops != null) {
//            for (PitStopEntry entry : pitStops) {
//                System.out.println("Driver #" + entry.getDriverNumber() +
//                        ", Lap " + entry.getLapNumber() +
//                        ", Duration: " + entry.getPitDuration() + "s");
//            }
//        } else {
//            System.out.println("Nie udało się wczytać danych.");
//        }

        LongestPitstop longestPitstop = new LongestPitstop();
        longestPitstop.printLongest(pitStops);
    }
}