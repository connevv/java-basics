import java.util.Scanner;

public class Hearthstone {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int timeForPause = Integer.parseInt(console.nextLine());
        double priceForCards = Double.parseDouble(console.nextLine());
        double priceForGames = Double.parseDouble(console.nextLine());
        double coffeePrice = Double.parseDouble(console.nextLine());
        double totalMoneySpent = 0;
        int timeLeftForPause = 0;
        timeLeftForPause = (timeForPause - 5) - 10;
        double moneyForCards = priceForCards * 3;
        double moneyForGames = priceForGames * 2;
        totalMoneySpent = moneyForCards + moneyForGames + coffeePrice;
        System.out.printf("%.2f \n", totalMoneySpent);
        System.out.println(timeLeftForPause);
    }
}
