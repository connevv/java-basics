import java.util.Scanner;

public class BingoGenerator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String number = console.nextLine();
        int numberInt = Integer.parseInt(number);
        while (numberInt < 1000 || numberInt > 9999) {
            number = console.nextLine();
            numberInt = Integer.parseInt(number);
        }
        char ch = number.charAt(0);
        char ch1 = number.charAt(1);
        char ch2 = number.charAt(2);
        char ch3 = number.charAt(3);
        String fistNumber = "";
        fistNumber += (ch - '0') + "" + (ch2 - '0');
        String secondNumber = "";
        secondNumber += (ch1 - '0') + "" + (ch3 - '0');
        String sum1 = fistNumber + "" + secondNumber;
        int sum = Integer.parseInt(sum1);

        int FirstNumber = Integer.parseInt(fistNumber);
        int SecondNumber = Integer.parseInt(secondNumber);
        int atique = FirstNumber + SecondNumber;
        String sumStr = String.valueOf(atique);
        sumStr += sumStr;
        int sumInt = Integer.parseInt(sumStr);
        int[] Array12 = new int[1000];
        int[] Array15 = new int[1000];
        int cn1 = 0;
        int cn2 = 0;
        for (int i = FirstNumber; i <= atique; i++) {
            String result = String.valueOf(i);
            result += "" + String.valueOf(SecondNumber);
            int resultOne = Integer.parseInt(result);
            String res ="";
            res += "" + String.valueOf(i) + String.valueOf(atique);
            int res1 = Integer.parseInt(res);
            for (int j = resultOne; j <= res1; j++) {
                if (j % 12 == 0 && j % 15 == 0) {
                    Array12[cn1] = j;
                    Array15[cn2] = j;
                    cn1++;
                    cn2++;
                } else {
                    if (j % 12 == 0) {
                        Array12[cn1] = j;
                        cn1++;
                    } else if (j % 15 == 0) {
                        Array15[cn2] = j;
                        cn2++;
                    }
                }
            }
        }
        System.out.print("Dividing on 12: ");
        for (int br = 0; br < cn1; br++) {
            System.out.printf("%d ", Array12[br]);
        }
        System.out.println();
        System.out.print("Dividing on 15: ");
        for (int kr = 0; kr < cn2; kr++) {
            System.out.printf("%d ", Array15[kr]);
        }
        System.out.println();
        if (cn1 == cn2) {
            System.out.println("!!!BINGO!!!");
        } else {
            System.out.println("NO BINGO!");
        }
    }
}

