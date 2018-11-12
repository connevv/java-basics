import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String symbolOne = console.nextLine();
        int numberOne = Integer.parseInt(console.nextLine());
        String symbolTwo = console.nextLine();
        int numberTwo = Integer.parseInt(console.nextLine());
        String symbolThree = console.nextLine();
        int numberThree = Integer.parseInt(console.nextLine());

        int resultOne = symbolOne.charAt(0) + numberOne;
        int resultTwo = symbolTwo.charAt(0) + numberTwo;
        int resultThree = symbolThree.charAt(0) + numberThree;
        char one = (char) resultOne;
        char two = (char) resultTwo;
        char three = (char) resultThree;
        String text = one + "" + two + "" + three;
        if (text.equals("777")) {
            System.out.println(text);
            System.out.println("*** JACKPOT ***");
        } else if (text.equals("@@@")) {
            System.out.println(text);
            System.out.println("!!! YOU LOSE EVERYTHING !!!");
        } else {
            System.out.println(text);
        }
    }
}
