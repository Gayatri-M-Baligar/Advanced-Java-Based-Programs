package lab_1;
import java.util.LinkedList;
import java.util.ListIterator;


public class LinkedListIteratorFromSecond {

	    public static void main(String[] args) {
	        // Step 1: Create a LinkedList and add elements
	        LinkedList<String> colors = new LinkedList<>();
	        colors.add("Red");     // index 0
	        colors.add("Green");   // index 1
	        colors.add("Blue");    // index 2
	        colors.add("Yellow");  // index 3
	        colors.add("Orange");  // index 4

	        // Display the original list
	        System.out.println("Color List: " + colors);

	        // Step 2: Create ListIterator starting from index 1 (2nd element)
	        ListIterator<String> iterator = colors.listIterator(1);

	        // Step 3: Iterate from the 2nd element
	        System.out.println("\nIterating from 2nd element:");
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
	}


