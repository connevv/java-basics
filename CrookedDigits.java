import java.util.Scanner;

public class CrookedDigits {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        String number = console.nextLine();
        int num = 0;
        int sum = 0;
        for (int counter = 0; counter < number.length(); counter++) {
            char ch = number.charAt(counter);
            if (Character.isDigit(ch)) {
                num += ch - '0';
            }
            int temp = num;
        }

        while (num > 9) {
            int temp = 0;
            while (num > 0) {
               temp  += num % 10;
                num /= 10;
            }
            num = temp;
        }
        System.out.println(num);
    }
}
