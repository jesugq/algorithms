public class IntEqualityPrinter {
	
    public static void printEqual(int a, int b, int c) {
        
        String output;
        
        if (a < 0 || b < 0 || c < 0) {
            output = "Invalid Value";
        } else if (a == b && b == c) {
            output = "All numbers are equal";
        } else if (a != b && b != c && a != c) {
            output = "All numbers are different";
        } else {
            output = "Neither all are equal or different";
        }
        
        System.out.println(output);
    }
}
