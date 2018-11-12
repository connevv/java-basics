import java.util.Scanner;

public class MostFrequent {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int number = Integer.parseInt(console.nextLine());
        while (number < 1 || number > 1024) {
            number = Integer.parseInt(console.nextLine());

        }
        int[] array = new int[number];
        int max = 0;
        int maxFrequent = -1;
        int temp = 0;

        for (int counter = 0; counter < number; counter++) {
            array[counter] = console.nextInt();
            while (array[counter] < 0 || array[counter] > 10000) {
                array[counter] = console.nextInt();
            }
        }
        for (int i = 0; i < number; i++) {
            for (int count = i; count < number; count++) {
                if (array[count] == array[i]) {
                    temp++;
                }
            }
            if (temp > maxFrequent) {
                maxFrequent = temp;
                max = array[i];
            }
            temp = 0;
        }
        System.out.println(max + " (" + maxFrequent + " times" + ")");
    }
}
