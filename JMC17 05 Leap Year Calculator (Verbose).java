public class LeapYear {

    public static boolean isLeapYear(int year) {
    
        boolean isValidYear = year > 0 && year < 10000;
        boolean isDivisibleBy4 = year % 4 == 0;
        boolean isDivisibleBy100 = year % 100 == 0;
        boolean isDivisibleBy400 = year % 400 == 0;
        
        return isValidYear && isDivisibleBy4 && (isDivisibleBy100 ? isDivisibleBy400 : true);
    }
}
