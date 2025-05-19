package lab_1;
import java.util.ArrayList;
import java.util.Collections;
public class ColorSort {
	

	    public static void main(String[] args) {
	        // Step 1: Create an ArrayList of colors
	        ArrayList<String> colors = new ArrayList<>();

	        // Add colors to the list
	        colors.add("Blue");
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Orange");

	        // Display the original list
	        System.out.println("Original Color List: " + colors);

	        // Step 2: Sort the colors using Collections.sort()
	        Collections.sort(colors);

	        // Display the sorted list
	        System.out.println("Sorted Color List: " + colors);
	    }
	}


