import java.util.Scanner;

public class TriangleOfDollars {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int dollars = Integer.parseInt(console.nextLine());
        for (int col = 0; col < dollars; col++){
            System.out.print("$");
            for (int row = 0; row < col; row ++){
                System.out.print("$");
            }
            System.out.println();
        }
    }
}
