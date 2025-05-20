package lab_3;
import java.util.Scanner;
public class NumericValidator {
	    // User-defined function to check if a string is numeric
	    public static boolean isNumeric(String str) {
	        if (str == null || str.isEmpty()) return false;

	        // Check each character to ensure it's a digit
	        for (char ch : str.toCharArray()) {
	            if (!Character.isDigit(ch)) {
	                return false;
	            }
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input from user
	        System.out.print("Enter a string to check if it is numeric: ");
	        String input = scanner.nextLine();

	        // Call user-defined function
	        if (isNumeric(input)) {
	            System.out.println("The string contains only numeric characters.");
	        } else {
	            System.out.println("The string does NOT contain only numeric characters.");
	        }

	        scanner.close();
	    }
	}

