import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		String firstName;
		System.out.print("Enter your first name: ");
		firstName = userInput.next();
		String lastName;
		System.out.print("Enter your last name: ");
		lastName = userInput.next();
		String fullName;
		fullName = firstName + " " + lastName;
		System.out.println(fullName + " has come 'cause he was paid $50");
	}
}
