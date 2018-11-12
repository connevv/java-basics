import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        int f0 = 1, f1 = 1;
        for (int i = 1; i < number; i++) {
            int fNext = f0 + f1;
            f0 = f1;
            f1 = fNext;
        }
        System.out.println(f1);
    }
}
