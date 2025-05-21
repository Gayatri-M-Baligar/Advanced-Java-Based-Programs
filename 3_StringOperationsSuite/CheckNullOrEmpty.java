package lab_3;
import java.util.Scanner;


public class CheckNullOrEmpty {



	    // User-defined function to check if string is null or only whitespace
	    public static boolean isNullOrEmpty(String str) {
	        return str == null || str.trim().isEmpty();
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input from user
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        // Check using user-defined method
	        if (isNullOrEmpty(input)) {
	            System.out.println("The string is null or contains only whitespace.");
	        } else {
	            System.out.println("The string is valid and non-empty.");
	        }

	        scanner.close();
	    }
	}

