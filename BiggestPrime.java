import java.util.Scanner;

public class BiggestPrime {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        int maxPrime = 1;
        for (int n = number; n >= 0; n--) {
            boolean isPrime = true;
            int maxDivider = (int) Math.sqrt(n);
            for (int counter = 2; counter <= maxDivider; counter++) {
                if (n % counter == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println(n);
                break;
            }
        }

    }
}

