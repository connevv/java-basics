import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int number = Integer.parseInt(console.nextLine());
        if (number == 0 || number >= 100 && number <= 200) {
        } else  {System.out.println("invalid"); }
    }
}
