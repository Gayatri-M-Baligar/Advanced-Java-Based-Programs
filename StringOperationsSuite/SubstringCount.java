package lab_3;
import java.util.Scanner;
public class SubstringCount {
	
	    // User-defined function to count substring occurrences
	    public static int countOccurrences(String mainStr, String subStr) {
	        if (mainStr == null || subStr == null || subStr.isEmpty()) {
	            return 0;
	        }

	        int count = 0;
	        int index = 0;

	        // Search for occurrences of subStr in mainStr
	        while ((index = mainStr.indexOf(subStr, index)) != -1) {
	            count++;
	            index += subStr.length(); // move past the found substring
	        }

	        return count;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input from user
	        System.out.print("Enter the main string: ");
	        String mainString = scanner.nextLine();

	        System.out.print("Enter the substring to count: ");
	        String subString = scanner.nextLine();

	        // Call user-defined function
	        int occurrences = countOccurrences(mainString, subString);

	        // Output result
	        System.out.println("The substring '" + subString + "' appears " + occurrences + " time(s).");

	        scanner.close();
	    }
	
}
