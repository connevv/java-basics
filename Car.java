import java.util.Scanner;

public class Car {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        int[] Array = new int[50];
        for (int i = 0; i < number; i++) {
            Array[i] = console.nextInt();
        }
        int startingSpeed = console.nextInt();
        int maxSpeed = console.nextInt();
        int result = startingSpeed;
        boolean isTrue = true;
        for (int j = 0; j < number; j++) {
            result -= Array[j];
            if (result < 0 || result > maxSpeed) {
                result += 2 * Array[j];
            }
            if (result < 0 || result > maxSpeed) {
                isTrue = false;
                break;
            }
        }
        if (isTrue) {
            System.out.println(result);
        } else {
            System.out.println("-1");
        }
    }
}
