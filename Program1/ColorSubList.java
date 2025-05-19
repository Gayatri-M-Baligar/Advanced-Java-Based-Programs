package lab_1;
import java.util.ArrayList;
import java.util.List;
public class ColorSubList {
	
	

		public static void main(String[] args) {
	        // Create an ArrayList of colors
	        ArrayList<String> colors = new ArrayList<>();

	        // Add different colors
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Orange");

	        // Print original list
	        System.out.println("Original colors list: " + colors);

	        // Extract 1st and 2nd elements using subList (index 0 and 1)
	        List<String> subList = colors.subList(0, 2); // end index is exclusive

	        // Print extracted sublist
	        System.out.println("Extracted sublist (1st and 2nd elements): " + subList);
	    }

	}

