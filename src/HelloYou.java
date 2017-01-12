
// Import library to use Scanner object
import java.util.*;

// Class to get to know the user
public class HelloYou {

	// Create a class variable of a Scanner object to allow user input to
	// console
	static Scanner scanner = new Scanner(System.in);
	// Static class variable to hold string array for user info
	static String[] userVars;
	static String[] details;

	// Method to say farewell to user
	public static void exitApplication() {
		// Message to say farewell to user
		System.out.println("\nThank you for using the SQA Greeting Application!");
		// Exit the system
		System.exit(0);
	}

	// This is a method or function
	public static String[] requestUserInfo(String name, String... details) {
		// Create an array of String type objects to hold values for user, size
		// is variable
		userVars = new String[details.length];
		// Greet the User
		System.out.println("I am excited to learn more about you " + name + "!");
		// Perform a loop for the amount of iterations equal to the length of
		// the supplied items
		for (int i = 0; i < details.length; i++) {
			// For each iteration ask the user for details
			System.out.print("Can I get your " + details[i] + ", please? ");
			// Capture user input in relative variable within array
			userVars[i] = scanner.nextLine();
		}
		// Return the String array of supplied details
		return details;
	}

	public static void main(String[] args) {
		// Declare local variables
		String name;
		// Output a welcome message to user
		System.out.println("Hello, and welcome to SQA Selenium Boot Camp");
		// Request the user's name
		System.out.print("Could I please get your name? ");
		// Set the captured name to a local string variable - name
		name = scanner.nextLine();
		// Call method to get user input and sit it to a variable which holds an
		// array of strings
		details = requestUserInfo(name, "age", "city of residence", "favorite color", "current moood");
		// Output the info to the user
		outputUserDetails(name);
		// Call method which gives a farewell and exits the system.
		exitApplication();

	}

	public static void outputUserDetails(String name) {
		// Begin outputting user details
		System.out.println(
				"\nWell " + name + ", it seems I have learned quite enough about you and I wish to learn no more.");
		// Iterate through user details backwards, each iternation echos a
		// details
		for (int i = userVars.length - 1; i >= 0; i--) {
			System.out.println("Your " + details[i] + " is " + userVars[i] + ".");
		}

	}

}