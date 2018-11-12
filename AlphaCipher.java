import java.util.Scanner;

public class AlphaCipher {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] numbers = new String[5];
        int[] sumOfNumber = new int[5];
        String text = "";
        int sum = 1;
        for (int counter = 0; counter < 5; counter++) {
            numbers[counter] = console.nextLine();
        }
        for (int i = 0; i < 5; i++) {
            String ch = numbers[i];
            for (int j = 0; j < ch.length(); j++) {
                char cha = ch.charAt(j);
                sum *= (cha - '0');
            }
            sumOfNumber[i] = sum;
            sum = 1;
        }
        for (int element = 0; element < 5; element++) {
            int n = sumOfNumber[element];
            int divider = n % 10;
            text = text + divider;
            divider = 0;
        }
        System.out.println(text);

    }
}