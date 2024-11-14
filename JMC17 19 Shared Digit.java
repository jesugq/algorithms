public class SharedDigit {
    
    public static boolean hasSharedDigit(int x, int y) {
        
        if (Math.min(x, y) < 10 || Math.max(x, y) > 99) return false;
        
        return x%10 == y%10 || x%10 == y/10 || x/10 == y%10 || x/10 == y/10;
    }
}
