public class LastDigitChecker {
    
    public static boolean hasSameLastDigit(int x, int y, int z) {
        
        return isValid(x) && isValid(y) && isValid(z) && (x%10==y%10 || x%10==z%10 || y%10==z%10);
    }
    
    public static boolean isValid(int number) {
        return (number >= 10) && (number <= 1000);
    }
}
