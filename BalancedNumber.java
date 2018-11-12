import java.util.Scanner;

public class BalancedNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        while (true) {
            String number = console.nextLine();
            int a = number.charAt(0) - '0';
            int b = number.charAt(1) - '0';
            int c = number.charAt(2) - '0';
            if (a + c != b) {
                break;
            }
            sum += Integer.parseInt(number);
        }
        System.out.println(sum);
    }
}
