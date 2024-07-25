import java.util.Scanner;

public class part6 {
    public static void main(String args[]) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String first = kb.nextLine();
        System.out.print("Enter your middle name: ");
        String middle = kb.nextLine();
        System.out.print("Enter your last name: ");
        String last = kb.nextLine();

        String fullname = String.format("%s, %s %s", last, first, middle);
        System.out.print("Your full name: ");
        System.out.println(fullname);
        int vowel = 0;
        
        for(char c : fullname.toCharArray()) {
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowel++;
            }
        }

        System.out.print("Number of vowels in your fullname: ");
        System.out.println(vowel);
    }
}