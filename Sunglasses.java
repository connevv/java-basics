import java.util.Scanner;

public class Sunglasses {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int number = Integer.parseInt(console.nextLine());
            for (int firstrow = 0; firstrow < 2* number; firstrow++){
            System.out.print("*"); }
            for (int firstrow = 0; firstrow < number; firstrow++) {
            System.out.print(" ");
        }
        for (int firstrow = 0; firstrow < 2 * number; firstrow++){
            System.out.print("*"); }
        System.out.println();
            for (int row = 0; row < number - 2; row++){
                System.out.print("*");
                for (int col = 0; col < 2 * number - 2; col++) {
                    System.out.print("/");
                }
                System.out.print("*");
                if (row == ((number-1)/2 -1)) {
                    for(int col = 0; col < number; col++){
                    System.out.print("|"); }
                }   else {
                    for (int col = 0; col < number; col++){
                    System.out.print(" ");
                        }
                    }
                System.out.print("*");
                for (int col = 0; col < 2 * number - 2; col++) {
                    System.out.print("/");
                }
                System.out.print("*");
                System.out.println();
            }
        for (int firstrow = 0; firstrow < 2 * number; firstrow++){
            System.out.print("*"); }
        for (int firstrow = 0; firstrow < number; firstrow++) {
            System.out.print(" ");
        }
        for (int firstrow = 0; firstrow < 2 * number; firstrow++){
            System.out.print("*"); }
    }
}
