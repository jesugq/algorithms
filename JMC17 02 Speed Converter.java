public class SpeedConverter {
    
    public static long toMilesPerHour(double kilometersPerHour) {
        double milesPerHour = -1D;
        
        if (kilometersPerHour >= 0) {
            milesPerHour = kilometersPerHour / 1.609D;
        }
        
        return Math.round(milesPerHour);
    }
    
    public static void printConversion(double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        String formattedConversion = "Invalid Value";
        
        if (milesPerHour >= 0) {
            formattedConversion = kilometersPerHour + " km/h = " + milesPerHour + " mi/h";
        }
        
        System.out.println(formattedConversion);
    }
}
