public class LastDigitChecker {
    
    public static boolean hasSameLastDigit(int x, int y, int z) {
        
        // if (Math.min(x, Math.min(y, z)) < 10) return false;
        // if (Math.max(x, Math.max(y, z)) > 1000) return false;
        
        if (!isValid(x) || !isValid(y) || !isValid(z)) return false;
        
        int xl = x % 10;
        int yl = y % 10;
        int zl = z % 10;
        
        return (xl == yl) || (xl == zl) || (yl == zl);
    }
    
    public static boolean isValid(int number) {
        return (number >= 10) && (number <= 1000);
    }
}
