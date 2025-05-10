package src;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PitStopEntry {
    @JsonProperty("session_key")
    private int sessionKey;

    @JsonProperty("meeting_key")
    private int meetingKey;

    private String date;

    @JsonProperty("driver_number")
    private int driverNumber;

    @JsonProperty("pit_duration")
    private double pitDuration;

    @JsonProperty("lap_number")
    private int lapNumber;

    // Gettery i settery
    public int getSessionKey() { return sessionKey; }
    public void setSessionKey(int sessionKey) { this.sessionKey = sessionKey; }

    public int getMeetingKey() { return meetingKey; }
    public void setMeetingKey(int meetingKey) { this.meetingKey = meetingKey; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public int getDriverNumber() { return driverNumber; }
    public void setDriverNumber(int driverNumber) { this.driverNumber = driverNumber; }

    public double getPitDuration() { return pitDuration; }
    public void setPitDuration(double pitDuration) { this.pitDuration = pitDuration; }

    public int getLapNumber() { return lapNumber; }
    public void setLapNumber(int lapNumber) { this.lapNumber = lapNumber; }
}
