public class NumberToWords {
    
    public static void numberToWords(int number) {
        
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }
        
        int numrev = reverse(number);
        int digits = getDigitCount(number);

        for (int i = 0; i < digits; i++) {
            
            String name = switch (numrev % 10) {
                case 0 -> "Zero";
                case 1 -> "One";
                case 2 -> "Two";
                case 3 -> "Three";
                case 4 -> "Four";
                case 5 -> "Five";
                case 6 -> "Six";
                case 7 -> "Seven";
                case 8 -> "Eight";
                case 9 -> "Nine";
                default -> "Impossible Value";
            };
            
            System.out.println(name);
            numrev /= 10;
        }
    }
    
    public static int reverse(int number) {
        
        int forward = number;
        int reverse = 0;
        
        while (forward != 0) {
            
            reverse = (reverse * 10) + (forward % 10);
            forward /= 10;
        }
        
        return reverse;
    }
    
    public static int getDigitCount(int number) {
        
        if (number < 0) return -1;
		
        int digits = 0;
        
        do {
            number /= 10;
            digits++;
            
        } while (number > 0);
        
        return digits;
    }
}
