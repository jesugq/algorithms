public class SumOddRange {
    
    public static boolean isOdd(int number) {
        
        return (number > 0) && (number % 2 != 0);
    }
    
    public static int sumOdd(int start, int end) {
        
        return (start>end || start<=0) ? -1 :
            (int)(Math.pow( (isOdd(end)   ? end+1 : end    ) / 2 , 2)) -
            (int)(Math.pow( (isOdd(start) ? start : start+1) / 2 , 2));
    }
}
