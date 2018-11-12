import java.util.Scanner;

public class GreatestCommonDevisor {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = Integer.parseInt(console.nextLine());
        int b = Integer.parseInt(console.nextLine());
        System.out.println(GreatestCommonDevisor1(a, b));
    }
        static int GreatestCommonDevisor1 (int a, int b) {
        if(b == 0)
            return a;
        else
        return GreatestCommonDevisor1( b,  a % b);
    }
}
