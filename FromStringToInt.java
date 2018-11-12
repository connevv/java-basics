import java.util.Scanner;

public class FromStringToInt {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        String text = console.nextLine();

        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isDigit(ch)) {
                sum += (ch - '0');
            }
        }
        System.out.println(sum);
    }
}
