public class SharedDigit {
    
    public static boolean hasSharedDigit(int x, int y) {
        
        if (Math.min(x, y) < 10) return false;
        if (Math.max(x, y) > 99) return false;
        
        int xa = x % 10;
        int xb = (x / 10) % 10;
        int ya = y % 10;
        int yb = (y / 10) % 10;
        
        return (xa == ya) || (xa == yb) || (xb == ya) || (xb == yb);
    }
}
