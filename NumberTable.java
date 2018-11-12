import java.util.Scanner;

public class NumberTable {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int number = Integer.parseInt(console.nextLine());
        int num;
        for (int row = 0; row < number; row++) {
            for(int col = 0; col < number; col++) {
                num = col + row + 1;
                if (num > number) {
                    num = 2 * number - num;
                }
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
