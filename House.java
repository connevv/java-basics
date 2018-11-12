import java.util.Scanner;

public class House {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        int stars;
        if (number % 2 == 0) {
            stars = 2;
        } else {
            stars = 1;
        }
        for (int row = 0; row < (number + 1) / 2; row++) {
            String roof = repeatStr("-", (number - stars) / 2) +
                    repeatStr("*", stars) + repeatStr("-", (number - stars) / 2);
            System.out.println(roof);
            stars += 2;
        }
        for (int row = 0; row < number / 2; row++) {
            String base = "|" + repeatStr("*", number-2) + "|";
            System.out.println(base);
        }

    }

    static String repeatStr(String StrToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += StrToRepeat;
        }
        return text;
    }
}

