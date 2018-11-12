import java.util.Scanner;

public class ASCIIcombinations {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int numbers = Integer.parseInt(console.nextLine());
        int sumOfNumbers = 0;
        String digits = "";
        int sumOfUpper = 0;
        String upperCase = "";
        int sumOfLower = 0;
        String lowerCase = "";
        int sumOfOthers = 0;
        String others = "";
        for (int i = 0; i < numbers; i++) {
            String symbol = console.nextLine();
            char ch = symbol.charAt(0);
            if (Character.isDigit(ch)) {
                sumOfNumbers += ch;
                digits += ch;
            } else if (Character.isUpperCase(ch)) {
                sumOfUpper += ch;
                upperCase += ch;
            } else if (Character.isLowerCase(ch)) {
                sumOfLower += ch;
                lowerCase += ch;
            } else {
                sumOfOthers += ch;
                others += ch;
            }
        }
        int biggest = Math.max(sumOfNumbers, sumOfUpper);
        biggest = Math.max(biggest, sumOfLower);
        biggest = Math.max(biggest, sumOfOthers);
        if (biggest == sumOfNumbers) {
            System.out.println("Biggest ASCII sum is:" + biggest);
            System.out.println("Combination of characters is:" + digits);
        } else if (biggest == sumOfUpper) {
            System.out.println("Biggest ASCII sum is:" + biggest);
            System.out.println("Combination of characters is:" + upperCase);
        } else if (biggest == sumOfLower) {
            System.out.println("Biggest ASCII sum is:" + biggest);
            System.out.println("Combination of characters is:" + lowerCase);
        } else {
            System.out.println("Biggest ASCII sum is:" + biggest);
            System.out.println("Combination of characters is:" + others);
        }

    }
}
