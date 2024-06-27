public class LeapYear {

    public static boolean isLeapYear(int year) {
		
        return (year>0 && year<10000) && (year%4 == 0) && ((year%100 == 0) ? (year%400 == 0) : true);
    }
}
