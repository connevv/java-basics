import java.util.Scanner;

public class AgeAndGender {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double age = Double.parseDouble(console.nextLine());
        String gender = console.nextLine();
        switch (gender) {
            case "m":
                if (age >= 16) {
                    System.out.println("Mr.");
                }   else {
                    System.out.println("Master");
                }
                break;
            case "f":
                if (age >= 16) {
                    System.out.println("Ms.");
                }   else {
                    System.out.println("Miss");
                }
                break;
            default:
                System.out.println("Wrong gender");
                break;
        }
    }
}
