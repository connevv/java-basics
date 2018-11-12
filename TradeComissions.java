import java.util.Scanner;

public class TradeComissions {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        String city = console.nextLine();
        double volume = Double.parseDouble(console.nextLine());
        switch (city) {
            case "Sofia":
                if (volume >=0 && volume <=500) {
                    System.out.printf("%.2f", volume * 0.05);
                }   else if (volume > 500 && volume <= 1000) {
                    System.out.printf("%.2f", volume * 0.07);
                }   else if (volume > 1000 && volume <= 10000) {
                    System.out.printf("%.2f", volume * 0.08);
                }   else if (volume > 10000) {
                    System.out.printf("%.2f", volume * 0.12);
                }   else {
                    System.out.println("error");
                }
                break;
            case "Varna":
                if (volume >=0 && volume <=500) {
                    System.out.printf("%.2f", volume * 0.045);
                }   else if (volume > 500 && volume <= 1000) {
                    System.out.printf("%.2f", volume * 0.075);
                }   else if (volume > 1000 && volume <= 10000) {
                    System.out.printf("%.2f", volume * 0.10);
                }   else if (volume > 10000) {
                    System.out.printf("%.2f", volume * 0.13);
                }   else {
                    System.out.println("error");
                }
                break;
            case "Plovdiv":
                if (volume >=0 && volume <=500) {
                    System.out.printf("%.2f", volume * 0.055);
                }   else if (volume > 500 && volume <= 1000) {
                    System.out.printf("%.2f", volume * 0.08);
                }   else if (volume > 1000 && volume <= 10000) {
                    System.out.printf("%.2f", volume * 0.12);
                }   else if (volume > 10000) {
                    System.out.printf("%.2f", volume * 0.145);
                }   else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}
