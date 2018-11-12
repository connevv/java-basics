import java.util.Scanner;

public class LongestSequenceofEqual {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int numbers = Integer.parseInt(console.nextLine());
        while (numbers < 1 || numbers > 1024){
            numbers = Integer.parseInt(console.nextLine());
        }
        int max = -1, sequence = 1;
        int [] Array = new int [numbers+1];
        for (int counter = 0; counter < numbers; counter++) {
            Array[counter] = Integer.parseInt(console.nextLine());
        }
        for (int counter = 0; counter < numbers; counter++) {
            if (Array[counter+1] == Array[counter]) {
                sequence++;
            }   else {
                max = Math.max(max, sequence);
                sequence = 1;
            }
        }
        System.out.println(max);
    }
}
