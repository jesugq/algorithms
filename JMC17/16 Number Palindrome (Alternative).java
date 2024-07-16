public class NumberPalindrome {
    
    public static boolean isPalindrome(int number) {
        
        int forward = number;
        int reverse = 0;
        
        while (forward != 0) {
            
            reverse = (reverse * 10) + (forward % 10);
            forward /= 10;
        }
        
        return number == reverse;
    }
}
