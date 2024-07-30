public class GreatestCommonDivisor {
    
    public static int getGreatestCommonDivisor(int first, int second) {
        
        if (Math.min(first, second) < 10) return -1;

        for (int i = Math.min(first, second); i > 1; i--) {
            
            if (first%i == 0 && second%i == 0)
                return i;
        }
        return -1;
    }
}
