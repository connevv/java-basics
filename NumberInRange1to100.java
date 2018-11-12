import java.util.Scanner;

public class NumberInRange1to100 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int number = Integer.parseInt(console.nextLine());
        while (number < 1 || number > 100) {
            System.out.println("Еnter a number in the range [1...100]:\n" +
                    "Invalid number!");
            number = Integer.parseInt(console.nextLine());
            }
        System.out.println("Enter a number in the range [1...100]:\n" +
                    "The number is: " + number);
    }
}
