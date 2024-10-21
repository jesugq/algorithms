public class PlayingCat {
    
    public static boolean isCatPlaying(boolean summer, int temperature) {
    
        int lowerLimit = 25;
        int upperLimit = summer ? 45 : 35;
        
        return (lowerLimit <= temperature) && (temperature <= upperLimit);
    }
}
