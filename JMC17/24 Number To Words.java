public class NumberToWords {

	public static int reverse(int number) {
        
        int reverse = 0;
        
        for (int i = number; i != 0; i /= 10) {
            
            reverse = (reverse * 10) + (i % 10);
        }
        
        return reverse;
    }
    
    public static int getDigitCount(int number) {
        
        if (number < 0) return -1;
        
        int digits = 1;

        for (int i = number; i >= 10; i /= 10) {
            
            digits++;
        }
        
        return digits;
    }

	public static int reverse(int number) {
	
		StringBuilder forward = new StringBuilder("" + Math.abs(number));
		StringBuilder reverse = forward.reverse();
		int result = Integer.valueOf(reverse.toString());
		return (number < 0) ? result * -1 : result;
	}

	public static int getDigitCount(int number) {
	
		return (number < 0) ? -1 : ("" + number).length();
	}
}
