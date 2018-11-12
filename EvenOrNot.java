import java.util.Scanner;

public class EvenOrNot {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        while (number % 2 != 0) {
            System.out.println("Invalid number!");
            System.out.println("Enter even number:");
            number = Integer.parseInt(console.nextLine());
        }
        System.out.println("Even number entered: " + number);
    }
}
