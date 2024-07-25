import java.util.Scanner;

public class part5{
    public static void main(String args[]) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = kb.nextLine();
        text = text.trim();
        System.out.println(text);
    }
}