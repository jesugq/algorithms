public class DecimalComparator {
	
    public static boolean areEqualByThreeDecimalPlaces(double x, double y) {
	    
        int roundedX = (int) (Double.max(x, y) * 1000);
        int roundedY = (int) (Double.min(x, y) * 1000);
	    
        return roundedX == roundedY;
    }
}
