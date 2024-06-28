public class DecimalComparator {
    
    public static boolean areEqualByThreeDecimalPlaces(double x, double y) {

        return (int)(Double.max(x,y)*1000) == (int)(Double.min(x,y)*1000);
    }
}
