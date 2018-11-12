import java.util.Scanner;

public class TitleSearch {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String text = console.nextLine();
        int numberOfSequences = Integer.parseInt(console.nextLine());
        String result ="";
        String temp = "";
        int i = 0;
        int j = 0;
        String[] sequences = new String[numberOfSequences];
        for (int counter = 0; counter < numberOfSequences; counter++) {
                sequences[counter] = console.nextLine();
            }
            for (int counter1 = 0; counter1 < numberOfSequences; counter1++) {
                String example = sequences[counter1];
                while (i < example.length() && j <= text.length()) {
                    if (example.charAt(i) == text.charAt(j)) {
                        temp += example.charAt(i);
                        i++;
                        j++;
                    } else {
                        char ch = text.charAt(j);
                        result += ch;
                        j++;
                    }
                    if (i >= example.length() && j <= text.length()) {
                        result += text.charAt(j);
                    }
                }
                if (temp.equals(example)) {
                    System.out.println(result);
                } else if(result.equals("")) {
                    break;
                }   else {
                    System.out.println("No such title found!");
                }
                temp = "";
                text = result;
                result = "";
                i = 0;
                j = 0;
            }

        }
    }

