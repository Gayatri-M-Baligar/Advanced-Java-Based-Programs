/*Write a Java program to display elements and their positions in a linked list ( using
l_listobj.get(p) )*/

package lab_1;
import java.util.LinkedList;
public class LinkedListDisplayWithPosition {

	    public static void main(String[] args) {
	        // Step 1: Create a LinkedList and add elements
	        LinkedList<String> colors = new LinkedList<>();
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Pink");

	        // Step 2: Display elements with their positions using get(index)
	        System.out.println("Elements and their positions:");
	        for (int i = 0; i < colors.size(); i++) {
	            System.out.println("Position " + i + ": " + colors.get(i));
	        }
	    }
	}

