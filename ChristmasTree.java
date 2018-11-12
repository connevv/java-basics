import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int number = Integer.parseInt(console.nextLine());
        for(int row = 0; row <= number; row++){
            System.out.print(" ");}
            System.out.println("|");
        for (int row = 0; row < number; row++) {
            for (int col = 1; col < number - row; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < row + 1; col++ ) {
                System.out.print("*");
            }
            System.out.print(" | ");
            for (int col = 0; col< row+1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
