import java.util.Scanner;

public class part3 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter your first name: ");
		String first = kb.nextLine();
		System.out.print("Enter your middle name: ");
		String middle = kb.nextLine();
		System.out.print("Enter your last name: ");
		String last = kb.nextLine();

		String fullname = String.format("%s, %s %s", last, first, middle);

		/*for(char c : fullname.toCharArray()) {
			if(c == 'a') {
				c = '@'; 
			}
			if(c == 'e') {
				c = '3';
			}
		}*/
		

		fullname = fullname.replace("a", "@");
		fullname = fullname.replace("e", "3");
		fullname = fullname.toUpperCase();

		System.out.println(fullname);
	}
}
