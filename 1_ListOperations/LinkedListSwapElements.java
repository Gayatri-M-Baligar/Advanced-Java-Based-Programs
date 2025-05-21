/*Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using
Collections.swap(l_list, 0, 2))*/

package lab_1;
import java.util.LinkedList;
import java.util.Collections;
public class LinkedListSwapElements {
	    public static void main(String[] args) {
	        // Step 1: Create a LinkedList and add elements
	        LinkedList<String> colors = new LinkedList<>();
	        colors.add("Red");     // index 0
	        colors.add("Green");   // index 1
	        colors.add("Blue");    // index 2
	        colors.add("Yellow");  // index 3

	        // Display the original list
	        System.out.println("Original LinkedList: " + colors);

	        // Step 2: Swap the first and third elements (index 0 and 2)
	        Collections.swap(colors, 0, 2);

	        // Display the updated list after swap
	        System.out.println("LinkedList after swapping 1st and 3rd elements: " + colors);
	    }
	}

