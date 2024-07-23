import java.util.Scanner;


public class part2 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter your first name: ");
		String first = kb.nextLine();
		System.out.print("Enter your middle name: ");
		String middle = kb.nextLine();
		System.out.print("Enter your last name: ");
		String last = kb.nextLine();

		String fullname1 = String.format("%s, %s %s",last, first, middle);
		System.out.print("Your fullname is ");
		System.out.println(fullname1);
		//StringBuilder fullname = new StringBuilder();
		//fullname.append(last);
		//fullname.append(", ");
		//fullname.append(first);
		//fullname.append(" ");
		//fullname.append(middle);
		
		System.out.print("Enter your full name: ");
		String fullname2 = kb.nextLine();

		if(fullname1.equalsIgnoreCase(fullname2)) {
			System.out.println("Same");
		}
		else {
			System.out.println("different");
		}
	}
}
