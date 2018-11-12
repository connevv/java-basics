import java.util.Scanner;

public class PrimeOrNot {
    //Dali e Prost broj
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        boolean prime = true;
        if ((number == 0 || number == 1) || number < 0) {
            prime = false; }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if ((number % i) == 0) {
                    prime = false;
                    break;
                }
            }
            if (!prime) {
                System.out.println("Not Prime");
            } else {
                System.out.println("Prime");
            }
        }
    }
