package src;

import java.util.List;

public class AveragePitstop {

    public static void printAverage(List<PitStopEntry> entries) {
        if (entries == null || entries.isEmpty()) {
            System.out.println("Brak danych.");
            return;
        }

        double sum = 0.0;
        int count = 0;

        for (PitStopEntry entry : entries) {
            sum += entry.getPitDuration();
            count++;
        }

        double average = sum / count;

        System.out.printf("Średni czas pit stopów: %.2f s (na podstawie %d pit stopów)%n", average, count);
    }
}