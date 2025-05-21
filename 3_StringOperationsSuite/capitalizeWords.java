package lab_3;
import java.util.Scanner;
public class capitalizeWords {

	    // User-defined function to capitalize the first letter of each word
	    public static String capitalizeWords(String str) {
	        if (str == null || str.isEmpty()) return str;

	        String[] words = str.trim().split("\\s+"); // Split by one or more spaces
	        StringBuilder capitalized = new StringBuilder();

	        for (String word : words) {
	            if (!word.isEmpty()) {
	                // Capitalize the first letter and keep the rest lowercase
	                capitalized.append(Character.toUpperCase(word.charAt(0)))
	                           .append(word.substring(1).toLowerCase())
	                           .append(" ");
	            }
	        }

	        return capitalized.toString().trim(); // Remove trailing space
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // User input
	        System.out.print("Enter a sentence: ");
	        String input = scanner.nextLine();

	        // Call user-defined function
	        String result = capitalizeWords(input);

	        // Output the result
	        System.out.println("Capitalized sentence: " + result);

	        scanner.close();
	    }
	}

