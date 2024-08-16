public class SpeedConverter {

    public static void main(String[] args) {

    }

    public static double toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            return Math.round(kilometersPerHour / 1.609);
        }
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            double mph = kilometersPerHour / 1.609;
            long milesPerHour = Math.round(mph);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
