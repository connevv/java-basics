import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        String type = console.nextLine();
        int row = Integer.parseInt(console.nextLine());
        int column = Integer.parseInt(console.nextLine());
        switch (type) {
            case "Premiere":
                System.out.printf("%.2f leva", row * column * 12.00);
                break;
            case "Normal":
                System.out.printf("%.2f leva", row * column * 7.50);
                break;
            case "Discount":
                System.out.printf("%.2f leva", row * column * 5.00);
                break;
            default: break;}
        }
}
