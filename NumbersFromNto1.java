import java.util.Scanner;

public class NumbersFromNto1 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int N = Integer.parseInt(console.nextLine());
        for (int i = N; i >=1; i--) {
            System.out.println(i);
        }
    }
}
