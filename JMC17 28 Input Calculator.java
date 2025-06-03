import java.util.Scanner;
import java.util.InputMismatchException;

public class InputCalculator {
    
    public static void inputThenPrintSumAndAverage() {
        
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        
        while (true) {
            try {
                sum += scanner.nextInt();
                count ++;
            } catch (InputMismatchException imex) {
                break;
            }
        }
        
        System.out.println("SUM = " + sum + " AVG = " + Math.round((double)(sum)/(count>0 ? count : 1)));
    }
}
