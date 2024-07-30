public class FlourPacker {
    
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        
        while (goal >= 5 && bigCount > 0) {  
		    goal -= 5;  
		    bigCount --;  
		}  
		  
		return (bigCount >= 0) && (smallCount >= goal);
    }
}
