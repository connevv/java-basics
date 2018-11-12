import java.util.Scanner;

public class PrimePairs {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int pairOne = Integer.parseInt(console.nextLine());
        int pairTwo = Integer.parseInt(console.nextLine());
        int substractionOne = Integer.parseInt(console.nextLine());
        int substractionTwo = Integer.parseInt(console.nextLine());
        int endOne = pairOne + substractionOne;
        int endTwo = pairTwo + substractionTwo;
        boolean isPrime = true;


        for (int counter = pairOne; counter <= endOne; counter++) {
            isPrime = true;
            for (int num = 2; num <= Math.sqrt(counter); num++) {
                if (counter % num == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                for (int count = pairTwo; count <= endTwo; count++) {
                    boolean isIsPrime = true;
                    for (int i = 2; i <= Math.sqrt(count); i++) {
                        if (count % i == 0) {
                            isIsPrime = false;
                            break;
                        }
                    }
                    if (isIsPrime) {
                        String text = counter + "" + count;
                        System.out.println(text);
                    }
                }
            }
        }


    }
}
