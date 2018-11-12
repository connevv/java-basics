import java.util.Scanner;

public class EvenPowerOfTwo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int N = Integer.parseInt(console.nextLine());
        int sum = 1;
        System.out.println(sum);
        for (int i = 1; i < N; i += 2) {
            sum = sum * 2 * 2 ;
            System.out.println(sum);
        }
    }
}
