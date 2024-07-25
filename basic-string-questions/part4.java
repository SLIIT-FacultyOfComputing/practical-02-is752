import java.util.Scanner;

public class part4 {
	public static void main(String[] args) {
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

		String[] parts = fullname.split("[ ,]+");

		for(String a : parts) {
			System.out.println(a);
		}
	}
}
