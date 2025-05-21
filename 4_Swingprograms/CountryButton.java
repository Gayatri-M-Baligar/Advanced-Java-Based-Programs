/*Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is
pressed” depending upon the Jbutton either Srilanka or India is pressed by implementing the
event handling mechanism with addActionListener( ).*/


package lab_4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CountryButton {

	    public static void main(String[] args) {
	        // Create the main frame
	        JFrame frame = new JFrame("Country Button Demo");
	        frame.setSize(400, 200);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLayout(new FlowLayout());

	        // Create buttons
	        JButton indiaButton = new JButton("India");
	        JButton srilankaButton = new JButton("Srilanka");

	        // Create label to display message
	        JLabel messageLabel = new JLabel("Press a button");

	        // Set font for label
	        messageLabel.setFont(new Font("SansSerif", Font.PLAIN, 20));

	        // Add action listeners
	        indiaButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                messageLabel.setText("India is pressed");
	            }
	        });

	        srilankaButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                messageLabel.setText("Srilanka is pressed");
	            }
	        });

	        // Add components to frame
	        frame.add(indiaButton);
	        frame.add(srilankaButton);
	        frame.add(messageLabel);

	        // Make frame visible
	        frame.setVisible(true);
	    }
	}
