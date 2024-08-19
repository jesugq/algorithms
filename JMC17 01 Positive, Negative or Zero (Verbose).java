public class PositiveNegativeZero {
    
    public static void checkNumber(int number) {
        String numberType = "zero";
        
        if (number > 0) {
            numberType = "positive";
        } else if (number < 0) {
            numberType = "negative";
        }
        
        System.out.println(numberType);
    }
}
