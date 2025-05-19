package lab_1;
import java.util.LinkedList;
import java.util.Iterator;
public class LinkedListReverseIteration {

	    public static void main(String[] args) {
	        // Step 1: Create a LinkedList and add elements
	        LinkedList<String> colors = new LinkedList<>();
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Orange");

	        // Display the original list
	        System.out.println("Original Color List: " + colors);

	        // Step 2: Get descending iterator
	        Iterator<String> reverseIterator = colors.descendingIterator();

	        // Step 3: Iterate in reverse order
	        System.out.println("\nColors in reverse order:");
	        while (reverseIterator.hasNext()) {
	            System.out.println(reverseIterator.next());
	        }
	    }
	}

