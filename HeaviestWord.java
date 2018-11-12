import java.util.Scanner;

public class HeaviestWord {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        while (number < 5 || number > 500) {
            number = Integer.parseInt(console.nextLine());
        }
        String[] words = new String[number];
        int sum = 0;
        int maxSum = -1;
        String maxString = "";
        for (int counter = 0; counter < number; counter++) {
            words[counter] = console.nextLine();
            while (words[counter].length() < 3 || words[counter].length() > 20) {
                words[counter] = console.nextLine();
            }
        }
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                char ch = words[i].charAt(j);
                if (Character.isUpperCase(ch)) {
                    sum += ch - '@';
                } else {
                    sum += ch - '`';
                }
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxString = words[i];
            }
            sum = 0;
        }
        System.out.printf("%d %s", maxSum, maxString);
    }
}
