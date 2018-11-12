import java.util.Scanner;

public class Factoriel {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int number = Integer.parseInt(console.nextLine());
        System.out.println(factoriel(number));
    }
    static int factoriel (int n) {
        if (n <= 1) {
            return 1;
        }   else
        {   return n*factoriel(n-1);
            }
        }
    }

