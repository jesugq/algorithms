public class FlourPacker {

	public static boolean canPack(int bigCount, int smallCount, int goal){
		
		return (bigCount*5 + smallCount >= goal) && (goal >= 0) && (bigCount >= 0) && (smallCount >= goal%5);
	}
}