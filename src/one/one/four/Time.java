package one.one.four;

class Time {
    private int totalSeconds;

    public Time(int totalSeconds) {
        this.totalSeconds = totalSeconds;
    }

    public String getTimeFormatted() {
        int secondsInDay = totalSeconds % 86400;

        int hours = secondsInDay / 3600;
        int minutes = (secondsInDay % 3600) / 60;
        int seconds = secondsInDay % 60;

        return String.format("%d:%02d:%02d", hours, minutes, seconds);
    }
}
