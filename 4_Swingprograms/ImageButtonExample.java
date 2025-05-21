package lab_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ImageButtonExample {
	    public static void main(String[] args) {
	        // Create main frame
	        JFrame frame = new JFrame("Image Button Demo");
	        frame.setSize(500, 300);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLayout(new FlowLayout());

	        // Create a label to display messages
	        JLabel messageLabel = new JLabel("Click a button");
	        messageLabel.setFont(new Font("SansSerif", Font.PLAIN, 20));

	        // Load images as icons
	        ImageIcon digitalClockIcon = new ImageIcon("src/lab_4/digital_clock.jpg");
	        ImageIcon hourGlassIcon = new ImageIcon("src/lab_4/hourglass1.jpg");

	        // Create buttons with images
	        JButton digitalClockButton = new JButton(digitalClockIcon);
	        JButton hourGlassButton = new JButton(hourGlassIcon);

	        // Add action listeners
	        digitalClockButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                messageLabel.setText("Digital Clock is pressed");
	            }
	        });

	        hourGlassButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                messageLabel.setText("Hour Glass is pressed");
	            }
	        });

	        // Add buttons and label to frame
	        frame.add(digitalClockButton);
	        frame.add(hourGlassButton);
	        frame.add(messageLabel);

	        // Make frame visible
	        frame.setVisible(true);
	    }
	}

