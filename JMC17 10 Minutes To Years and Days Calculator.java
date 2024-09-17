public class MinutesToYearsDaysCalculator {
    
    public static void printYearsAndDays(long minutes) {
        
        System.out.println( minutes>=0
            ? String.format( "%d min = %d y and %d d", minutes, (minutes/24L/60L)/365L, (minutes/24L/60L)%365L )
            : "Invalid Value" );
    }
}