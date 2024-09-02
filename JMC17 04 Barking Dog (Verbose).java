public class BarkingDog {
	
     public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
	     
        boolean hasToWakeUp = false;
        
        if (!barking) {
            return hasToWakeUp;
        }
        
        if (hourOfDay == 23) {
            hasToWakeUp = true;
        }
        else if (hourOfDay >= 0 && hourOfDay < 8) {
            hasToWakeUp = true;
        }
        
        return hasToWakeUp;
     }
}
