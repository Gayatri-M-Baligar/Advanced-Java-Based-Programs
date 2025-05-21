/*Write a java program for getting different colors through ArrayList interface and delete nth
element from the ArrayList object by using remove by index*/

package lab_1;
import java.util.ArrayList;
import java.util.Scanner;
	public class ColorDeleteByIndex {
		public static void main(String[] args) {
	        // Create an ArrayList of colors
	        ArrayList<String> colors = new ArrayList<>();

	        // Add different colors
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Orange");

	        // Display original list
	        System.out.println("Original colors list: " + colors);

	        // Input n from user
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the index (starting from 0) of the element to remove: ");
	        int n = scanner.nextInt();

	        // Check and remove the n-th element
	        if (n >= 0 && n < colors.size()) {
	            String removedColor = colors.remove(n);
	            System.out.println("Removed color: " + removedColor);
	        } else {
	            System.out.println("Invalid index. No element removed.");
	        }

	        // Display updated list
	        System.out.println("Updated colors list: " + colors);

	        scanner.close();
	    }

	}

