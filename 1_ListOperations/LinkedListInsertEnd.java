package lab_1;
import java.util.LinkedList;
public class LinkedListInsertEnd {

	
	    public static void main(String[] args) {
	        // Step 1: Create a LinkedList and add some elements
	        LinkedList<String> colors = new LinkedList<>();
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");

	        // Display the original list
	        System.out.println("Original LinkedList: " + colors);

	        // Step 2: Insert "Pink" at the end using offerLast()
	        colors.offerLast("Pink");

	        // Display the updated list
	        System.out.println("LinkedList after inserting 'Pink' at the end: " + colors);
	    }
	}
