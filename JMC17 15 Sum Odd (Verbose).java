public class SumOddRange {
    
    public static boolean isOdd(int number) {
        
        return (number > 0) && (number % 2 != 0);
    }
    
    public static int sumOdd(int start, int end) {
        
        if (start > end) return -1;
        if (start <= 0)  return -1;
        
        int sum = 0;
        
        for (int i = isOdd(start) ? start : start+1; i <= end; i+=2) {
            
            sum += i;
        }
        
        return sum;
    }
}