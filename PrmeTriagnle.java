public class PrmeTriagnle {
    public static void main(String[] args) {
        int n = 10;
        String text = "";
        for (int i = 1; i <= n; i++) {
                boolean isPrime = true;
                for (int counter = 2; counter <= (int) Math.sqrt(i); counter++) {
                    if (i % counter == 0) {
                        isPrime = false;
                    }
            }
            if (isPrime) {
                text += "1";
                System.out.println(text);
            } else {
                text += "0";
            }
        }
    }
}
