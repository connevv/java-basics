import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        String fruit = console.nextLine();
        String day = console.nextLine();
        double quantity = Double.parseDouble(console.nextLine());
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                if (fruit.equals("banana")) {
                quantity *= 2.50;
                    System.out.printf("%.2f",quantity);
                }   else if (fruit.equals("apple")) {
                quantity *= 1.20;
                    System.out.printf("%.2f",quantity);
                }   else if (fruit.equals("orange")) {
                quantity *= 0.85;
                    System.out.printf("%.2f",quantity);
                }   else if (fruit.equals("grapefruit")) {
                quantity *= 1.45;
                    System.out.printf("%.2f",quantity);
                }   else if (fruit.equals("kiwi")) {
                quantity *= 2.70;
                    System.out.printf("%.2f",quantity);
                }   else if (fruit.equals("pineapple")) {
                quantity *= 5.50;
                    System.out.printf("%.2f",quantity);
                }   else if (fruit.equals("grapes")) {
                quantity *= 3.85;
                    System.out.printf("%.2f",quantity);
                }   else {
                    System.out.println("error");
                }
                break;
            case "Saturday":
            case "Sunday":
                switch (fruit) {
                    case "banana":
                        quantity *= 2.70;
                        System.out.printf("%.2f", quantity);
                        break;
                    case "apple":
                        quantity *= 1.25;
                        System.out.printf("%.2f", quantity);
                        break;
                    case "orange":
                        quantity *= 0.90;
                        System.out.printf("%.2f", quantity);
                        break;
                    case "grapefruit":
                        quantity *= 1.60;
                        System.out.printf("%.2f", quantity);
                        break;
                    case "kiwi":
                        quantity *= 3.00;
                        System.out.printf("%.2f", quantity);
                        break;
                    case "pineapple":
                        quantity *= 5.60;
                        System.out.printf("%.2f", quantity);
                        break;
                    case "grapes":
                        quantity *= 4.20;
                        System.out.printf("%.2f", quantity);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            default:
                System.out.println("error");
                break;
        }

    }
}
