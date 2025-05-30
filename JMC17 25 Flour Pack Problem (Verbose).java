public class FlourPacker {
    
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        
        if ( Math.min(bigCount, smallCount) < 0 || goal < 0 ) return false;
        if ( ((bigCount*5) + smallCount) < goal ) return false;
        
        int bigRemaining = bigCount;
        int smallRemaining = smallCount;
        
        for (int i = 0; i < goal / 5; i ++) bigRemaining --;
        for (int i = 0; i < goal % 5; i ++) smallRemaining --;
        for (int i = bigRemaining; i < 0; i ++) {
            smallRemaining -= 5;
            bigRemaining ++;
        }
        
        return Math.min(bigRemaining, smallRemaining) >= 0;
    }
}
