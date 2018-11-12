import java.util.Scanner;

public class EasterEgg {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        int counter = number * 2;
        int number1 = number + 2;
        int number2 = number;
        String star = "*";
        while (number < 2 || number > 28 || number % 2 != 0) {
            number = Integer.parseInt(console.nextLine());
        }
        String temp = repeatStr(".", counter) + repeatStr("*", number) +
                repeatStr(".", counter);
        System.out.println(temp);
        for (int i = 0; i < number / 2; i++) {
            String line = repeatStr(".", counter - 2) + star + repeatStr("+", number1)
                    + star + repeatStr(".", counter - 2);
            System.out.println(line);
            counter -= 2;
            number1 += 2;
            star += "*";
        }
        number1 -= 2;
        number1 += ((number - 2) / 2) * 2;
        for (int j = 0; j < number / 2; j++) {
            String lin = repeatStr(".", number2 - 1) + "**" + repeatStr("=", number1) +
                    "**" + repeatStr(".", number2 - 1);
            System.out.println(lin);
            number2 -= 1;
            number1 += 2;
        }
        String text = "HAPPY EASTER";
        String middleLine = repeatStr(".", number / 2) + "**" +
                repeatStr("~", (5 * number - (number + 16)) / 2) + text +
                repeatStr("~", (5 * number - (number + 16)) / 2) + "**" +
                repeatStr(".", number / 2);
        System.out.println(middleLine);
        int helpNumber = number / 2;
        number1 -= 2;
        for (int cnt = 0; cnt < number / 2; cnt++) {
            String secondPart = repeatStr(".", helpNumber) + "**" +
                    repeatStr("=", number1) + "**" +
                    repeatStr(".", helpNumber);
            System.out.println(secondPart);
            helpNumber++;
            number1 -= 2;
        }
        helpNumber = number;
        int helpStar = number / 2;
        int helpTemp = number * 2;
        for (int counterHelp = 0; counterHelp < number / 2; counterHelp++) {
            String beforeLast = repeatStr(".", helpNumber) +
                    repeatStr("*", helpStar) +
                    repeatStr("+", helpTemp) +
                    repeatStr("*", helpStar) +
                    repeatStr(".", helpNumber);
            System.out.println(beforeLast);
            helpStar--;
            helpTemp -= 2;
            helpNumber += 2;
        }
        helpNumber -= 2;
        String lastRow = repeatStr(".", helpNumber + 2) +
                repeatStr("*", number) + repeatStr(".", helpNumber + 2);
        System.out.println(lastRow);
    }

    static String repeatStr(String StrToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += StrToRepeat;
        }
        return text;
    }
}
