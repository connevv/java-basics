import java.util.Scanner;

public class Num1toNWithSteps3 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int N = Integer.parseInt(console.nextLine());
        for ( int i = 1; i <= N; i+=3) {
            System.out.println(i);
        }
    }
}
