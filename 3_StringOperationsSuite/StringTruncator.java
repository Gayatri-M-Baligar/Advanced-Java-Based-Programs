/*Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
defined function truncate()*/

package lab_3;
import java.util.Scanner;
public class StringTruncator {
	    // User-defined function to truncate a string and add ellipsis
	    public static String truncate(String str, int maxLength) {
	        if (str == null || maxLength < 0) return "";

	        // If the string is already short enough, return it unchanged
	        if (str.length() <= maxLength) {
	            return str;
	        }

	        // Ensure we have room for ellipsis
	        if (maxLength <= 3) {
	            return "...".substring(0, maxLength);
	        }

	        // Truncate and append ellipsis
	        return str.substring(0, maxLength - 3) + "...";
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input from user
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        System.out.print("Enter maximum length: ");
	        int maxLength = scanner.nextInt();

	        // Call user-defined function
	        String shortened = truncate(input, maxLength);

	        // Output result
	        System.out.println("Truncated string: " + shortened);

	        scanner.close();
	    }
	}

