import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        String product = console.nextLine();
        String city = console.nextLine();
        double quantity = Double.parseDouble(console.nextLine());
        switch (city) {
            case "Sofia":
                if (product.equals("coffee")) {
                    quantity *= 0.50;
                }    else if (product.equals("water")) {
                    quantity *= 0.80;
                }    else if (product.equals("beer")) {
                    quantity *= 1.20;
                }    else if (product.equals("sweets")) {
                    quantity *= 1.45;
                }    else if (product.equals("peanuts")) {
                    quantity *= 1.60;
                }
                break;
            case "Plovdiv":
                if (product.equals("coffee")) {
                    quantity *= 0.40;
                }   else if (product.equals("water")) {
                    quantity *= 0.70;
                }   else if (product.equals("beer")) {
                    quantity *= 1.15;
                }   else if (product.equals("sweets")) {
                    quantity *= 1.30;
                }   else if (product.equals("peanuts")) {
                    quantity *= 1.50;
                }
                break;
            case "Varna":
                if (product.equals("coffee")) {
                    quantity *= 0.45;
                }   else if (product.equals("water")) {
                    quantity *= 0.70;
                }   else if (product.equals("beer")) {
                    quantity *= 1.10;
                }   else if (product.equals("sweets")) {
                    quantity *= 1.35;
                }   else if (product.equals("peanuts")) {
                    quantity *= 1.55;
                }
                break;
            default:
                System.out.println("Wrong city");
                break;
        }
        System.out.println(quantity);
    }
}
