import java.util.Scanner;

public class part1 {
	public static void main(String[] args) {
		String first;
		String middle;
		String last;
		
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter your first name: ");
		first = kb.nextLine();
		System.out.print("Enter your middle name: ");
		middle = kb.nextLine();
		System.out.print("Enter your last name: ");
		last = kb.nextLine();

		StringBuilder fullname = new StringBuilder();
		fullname.append(last);
		fullname.append(", ");
		fullname.append(first);
		fullname.append(" ");
		fullname.append(middle);
		System.out.print("Full name: ");
		System.out.println(fullname);
	}	
}
