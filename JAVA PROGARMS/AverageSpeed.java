class AverageSpeed {
    public static void main(String[] args) {

        double distanceKm = 14;
        double distanceMiles = distanceKm / 1.6;

        double timeHours = (45.0 / 60) + (30.0 / 3600);

        double averageSpeed = distanceMiles / timeHours;

        System.out.println("Average speed in miles per hour: " + averageSpeed);
    }
}