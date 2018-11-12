import java.util.Scanner;

public class SumDigits {
    public static void main (String [] args) {
        Scanner console = new Scanner (System.in);
        int number = Integer.parseInt(console.nextLine());
        int sum = 0;
        for (; number != 0; number /= 10 ) {
            sum = sum + (number % 10);
        }
        System.out.println(sum);
    }
}
