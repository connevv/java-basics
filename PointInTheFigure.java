import java.util.Scanner;

public class PointInTheFigure {
        public static void main(String[] args) {
            Scanner console = new Scanner (System.in);
            int height = Integer.parseInt(console.nextLine());
            int x = Integer.parseInt(console.nextLine());
            int y = Integer.parseInt(console.nextLine());
            if (x > 3*height || x < 0) {
                System.out.println("outside");
            }   else if (x > height && x < 2*height) {
                if (y > 0 && y < 4*height) {
                    System.out.println("inside");
                }   else
                {
                    System.out.println("outside");
                }
            }
            if ((x >= 0 && x < 3*height) && (x < height || x > 2*height)) {
                if (y < 0 || y > height) {
                    System.out.println("outside");
                } else {
                    System.out.println("inside");
                }
            }

            if (y == 0 && (x >= 0 && x <= 3*height)) {
                System.out.println("border");
            }   else if (x == 0 && (y >= 0 && y <= height )) {
                System.out.println("border");
            }   else if (y == height && ((x >= 0 && x <= height) || (x >= 2*height && x <= 3*height))) {
                System.out.println("border");
            }   else if (x == height && (y >= height && y <= 4*height)) {
                System.out.println("border");
            }   else if (y == 4*height && (x >= height && x <= 2*height)) {
                System.out.println("border");
            }   else if (x == 2*height && (y >= height && y <= 4*height)) {
                System.out.println("border");
            }   else if (x == 3*height && (y >= 0 && y <= height)) {
                System.out.println("border");
            }
        }
    }
