import java.util.Scanner;

public class AllocateArray {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int number = Integer.parseInt(console.nextLine());
        int[] array = new int[number];
        while (number < 1 || number > 20) {
            number = Integer.parseInt(console.nextLine());
        }
        int sum = 0;
        for (int i = 0; i < number; i++) {
            array [i] = sum;
            System.out.println(array[i]);
            sum += 5;
        }
    }
}
