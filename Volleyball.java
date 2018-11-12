import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String TypeOfYear = console.nextLine();
        double holidays = Double.parseDouble(console.nextLine());
        double weekends = Double.parseDouble(console.nextLine());
        double leap;
        double all = 0;
        double result;
        if (TypeOfYear.equals("normal")) {
            holidays *= 2.0 / 3;
            all = (48 - weekends) * 3.0 / 4;
            all += holidays + weekends;
            result = Math.floor(all);
            System.out.printf("%.0f",result);
        } else if (TypeOfYear.equals("leap")) {
            holidays = holidays * 2.0 / 3;
            all = (48 - weekends) * 3.0 / 4;
            all = all + holidays + weekends;
            leap = all * 0.15;
            all = all + leap;
            result = Math.floor(all);
            System.out.printf("%.0f",result);
        }

    }
}
