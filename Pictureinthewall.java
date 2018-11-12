import java.util.Scanner;

public class Pictureinthewall {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double holeWidth = Double.parseDouble(console.nextLine());
        double holeLength = Double.parseDouble(console.nextLine());
        double pictureSide = Double.parseDouble(console.nextLine());
        double pictureNumber = Double.parseDouble(console.nextLine());
        double holeArea = holeLength * holeWidth;
        double pictureArea = Math.pow(pictureSide, 2) * pictureNumber;
        double canFit = holeArea - pictureArea;
        if (canFit > 0) {
            System.out.printf("The pictures fit in the hole. Hole area is %.0f" +
                    " bigger than pictures area.", canFit);
        } else {
            System.out.printf("The pictures don't fit in the hole. " +
                    "Picture area is %.0f bigger than hole area.", Math.abs(canFit));
        }
    }
}
