import java.util.Scanner;
public class SquareofStars {
        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            int N = Integer.parseInt(console.nextLine());
            for (int i = 0; i < N; i++) {
                System.out.print("* ");
                for (int j = 1; j < N; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }