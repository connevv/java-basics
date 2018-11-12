import java.util.Scanner;

public class Mask {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int size = Integer.parseInt(console.nextLine());
        int count = size - 2;
        int number = size;
        for (int roof = 0; roof < size - 1; roof++) {
            String roo = repeatStr(" ", count) + "/" + repeatStr(" ", roof) + "|  "
                    + "|" + repeatStr(" ", roof) + "\\";
            System.out.println(roo);
            count--;
        }
        System.out.println(repeatStr("-", (size * 2) + 2)); // middlerow
        String eyeBrown = "|" + repeatStr(" ", (size + 1) / 2 - 2) + "_"
                + repeatStr(" ", size + 1) + "_"
                + repeatStr(" ", (size + 1) / 2 - 2) + "|";
        System.out.println(eyeBrown);
        String eyes = "|" + repeatStr(" ", (size + 1) / 2 - 2) + "@"
                + repeatStr(" ", size + 1) + "@"
                + repeatStr(" ", (size + 1) / 2 - 2) + "|";
        System.out.println(eyes);
        for (int counter = 0; counter < (size + 1) / 2 - 1; counter++) {
            String emptyLine = "|" + repeatStr(" ", size * 2) + "|";
            System.out.println(emptyLine);
        }
        String nose = "|" + repeatStr(" ", size - 1)
                + "OO" + repeatStr(" ", size - 1) + "|";
        System.out.println(nose);
        String nose2 = "|" + repeatStr(" ", (size - 2)) + "/" + "  "
                + "\\" + repeatStr(" ", (size - 2)) + "|";
        System.out.println(nose2);
        String nose3 = "|" + repeatStr(" ", (size - 2)) +
                repeatStr("|", 4)
                + repeatStr(" ", (size - 2)) + "|";
        System.out.println(nose3);
        for (int counter = 1; counter <= size + 1; counter++) {
            String base = repeatStr("\\", counter) + repeatStr("`", number) +
                    repeatStr("`", number) + repeatStr("/", counter);
            System.out.println(base);
            number--;

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
