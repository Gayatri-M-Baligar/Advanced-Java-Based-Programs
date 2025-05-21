/*Basic hello program of Swing displaying the message Hello! VI C , Welcome to Swing
Programming in Blue color plain font with font size of 32 using Jframe and Jlabel*/

package lab_4;
import javax.swing.*;
import java.awt.*;
public class HelloSwing {

	    public static void main(String[] args) {
	        // Create a new frame
	        JFrame frame = new JFrame("Swing Hello Program");

	        // Create a label with the message
	        JLabel label = new JLabel("Hello! VI A, Welcome to Swing Programming", SwingConstants.CENTER);

	        // Set font: plain style, size 32
	        label.setFont(new Font("SansSerif", Font.PLAIN, 32));

	        // Set text color to blue
	        label.setForeground(Color.BLUE);

	        // Add the label to the frame
	        frame.add(label);

	        // Set frame size
	        frame.setSize(700, 200);

	        // Close operation
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        // Set frame visibility
	        frame.setVisible(true);
	    }
	}

