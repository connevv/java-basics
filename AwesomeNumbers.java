import java.util.Scanner;

public class AwesomeNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        int favoriteNumber = Integer.parseInt(console.nextLine());
        if (number % 2 != 0 && number < 0 && number % favoriteNumber == 0) {
            System.out.println("super special awesome");
        } else if (number % 2 != 0 && (number < 0 || number % favoriteNumber == 0)) {
            System.out.println("super awesome");
        } else if (number < 0 && (number % 2 != 0 || number % favoriteNumber == 0)) {
            System.out.println("super awesome");
        } else if (number % favoriteNumber == 0 && (number < 0 || number % 2 != 0)) {
            System.out.println("super awesome");
        } else if (number % 2 == 0 && number % favoriteNumber != 0 && number >= 0) {
            System.out.println("boring");
        } else if (number % 2 != 0 || number < 0 || number % favoriteNumber == 0) {
            System.out.println("awesome");
        }
    }
}
