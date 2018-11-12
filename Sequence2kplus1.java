import java.util.Scanner;

public class Sequence2kplus1 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int number = Integer.parseInt(console.nextLine());
        int num = 1;
        for (int i = 1; i <= number; i = i * 2 + 1) {
            System.out.println(num);
            num = num * 2 + 1;
        }
    }
}
