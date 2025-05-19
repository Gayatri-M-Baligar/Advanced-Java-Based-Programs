package lab_1;
import java.util.ArrayList;
public class ColorManager {
	    public static void main(String[] args) {
	        // Step 1: Create an ArrayList and add colors
	        ArrayList<String> colors = new ArrayList<>();
	        colors.add("Red");
	        colors.add("Green");   // Index 1 (2nd element)
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Orange");

	        // Display original list
	        System.out.println("Original Color List: " + colors);

	        // Step 2: Remove the 2nd element (index 1)
	        if (colors.size() > 1) {
	            String removedColor = colors.remove(1);
	            System.out.println("Removed 2nd element (index 1): " + removedColor);
	        }

	        // Step 3: Remove the color "Blue" by value
	        boolean isBlueRemoved = colors.remove("Blue");
	        if (isBlueRemoved) {
	            System.out.println("Color 'Blue' was removed.");
	        } else {
	            System.out.println("Color 'Blue' was not found in the list.");
	        }

	        // Display final list
	        System.out.println("Final Color List: " + colors);
	    }
	}

