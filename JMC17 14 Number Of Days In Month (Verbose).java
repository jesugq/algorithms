public class NumberOfDaysInMonth {
    
    public static boolean isLeapYear(int year) {
    
        boolean isValidYear = year > 0 && year < 10000;
        boolean isDivisibleBy4 = year % 4 == 0;
        boolean isDivisibleBy100 = year % 100 == 0;
        boolean isDivisibleBy400 = year % 400 == 0;
        
        return isValidYear && isDivisibleBy4 && (isDivisibleBy100 ? isDivisibleBy400 : true);
    }
    
    public static int getDaysInMonth(int month, int year) {
        
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            month = year = -1;
        }
        
        return switch(month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> { yield isLeapYear(year) ? 29 : 28; }
            default -> -1;
        };
    }
}
