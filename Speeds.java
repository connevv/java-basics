import java.util.Scanner;

public class Speeds {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int number = Integer.parseInt(console.nextLine());
        int groupSpeed = Integer.parseInt(console.nextLine());
        int groupLength = 1;
        int bestLength = 1;
        int bestSum = groupSpeed;
        int groupSum = groupSpeed;

        for (int counter = 0; counter < number - 1; counter++) {
            int currentSpeed = Integer.parseInt(console.nextLine());
            if (currentSpeed > groupSpeed) {
                groupLength++;
                groupSum += currentSpeed;
            }   else {
                groupLength = 1;
                groupSpeed = currentSpeed;
                groupSum = currentSpeed;
            }
            if (groupLength > bestLength) {
                bestLength = groupLength;
                bestSum = groupSum;
            }   else if (groupLength == bestLength) {
                bestSum = Math.max (bestSum, groupSum);
            }
        }
        System.out.println(bestSum);
    }
}
