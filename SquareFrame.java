import java.util.Scanner;

public class SquareFrame {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int number = Integer.parseInt(console.nextLine());
        System.out.print("+ ");
        for (int i = 0; i < number-2; i++ ) {
          System.out.print("- ");
        }
        System.out.print("+ ");
        System.out.println();
        for (int j = 0; j < number-2; j++) {
            System.out.print("| ");
            for (int k = 0; k < number-2; k++){
                System.out.print("- ");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.print("+ ");
        for (int i = 0; i < number-2; i++ ) {
            System.out.print("- ");
        }
        System.out.print("+ ");
    }
}
