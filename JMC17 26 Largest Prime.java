public class LargestPrime {
    
    public static int getLargestPrime(int number) {
        
        if (number < 2) {
            return -1;
        }
        
        for (int i = number; i >= 2; i--) {
            if (number % i == 0) { 
                number = i;
            }
        }
        
        return number;
    }
}
