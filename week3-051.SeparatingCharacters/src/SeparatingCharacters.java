
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int counter = 0;
        while (counter <= (name.length() - 1)) {
            System.out.println((counter + 1)+". character: "+name.charAt(counter));
            counter++;
        }
    }
}
