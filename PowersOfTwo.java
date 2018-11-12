import java.util.Scanner;

public class PowersOfTwo {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int N = Integer.parseInt(console.nextLine());
        int sum = 1;
        System.out.println(sum);
        for (int i = 0; i < N; i++) {
            sum = sum * 2;
            System.out.println(sum);
        }
    }
}
