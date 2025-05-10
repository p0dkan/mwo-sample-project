package src;


import java.util.List;

public class LongestPitstop {

    public static void printLongest(List<PitStopEntry> entries) {
        if (entries == null || entries.isEmpty()) {
            System.out.println("Brak danych.");
            return;
        }

        double maxDuration = -1;
        int driverWithMax = -1;

        for (PitStopEntry entry : entries) {
            double duration = entry.getPitDuration();

            if (duration > maxDuration) {
                maxDuration = duration;
                driverWithMax = entry.getDriverNumber();
            }
        }

        System.out.printf("Najdłuższy pit stop: %.2f s (kierowca nr %d)%n", maxDuration, driverWithMax);
    }
}