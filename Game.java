import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        String number = console.nextLine();
        int firstNumber = number.charAt(0) - '0';
        int secondNumber = number.charAt(1) - '0';
        int thirdumber = number.charAt(2) - '0';
        int result = -1;
        result = Math.max (result,firstNumber + secondNumber + thirdumber);
        result = Math.max (result,firstNumber * secondNumber + thirdumber);
        result = Math.max (result,firstNumber + secondNumber * thirdumber);
        result = Math.max (result,firstNumber * secondNumber * thirdumber);
        System.out.println(result);
    }
}
