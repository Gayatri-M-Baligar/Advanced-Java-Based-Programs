/*Develop a Swing program in Java to create a Tabbed Pan of RED, BLUE and GREEN and
display the concerned color whenever the specific tab is selected in the Pan.*/

package lab_5;
import javax.swing.*;
import java.awt.*;

public class ColorTabbedPane {

	    public static void main(String[] args) {
	        // Create the main frame
	        JFrame frame = new JFrame("Color Tabbed Pane");
	        frame.setSize(400, 300);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        // Create a TabbedPane
	        JTabbedPane tabbedPane = new JTabbedPane();

	        // Create Panels with different background colors
	        JPanel redPanel = new JPanel();
	        redPanel.setBackground(Color.RED);

	        JPanel greenPanel = new JPanel();
	        greenPanel.setBackground(Color.GREEN);

	        JPanel bluePanel = new JPanel();
	        bluePanel.setBackground(Color.BLUE);

	        // Add panels to the tabbed pane
	        tabbedPane.addTab("RED", redPanel);
	        tabbedPane.addTab("GREEN", greenPanel);
	        tabbedPane.addTab("BLUE", bluePanel);

	        // Add the tabbed pane to the frame
	        frame.add(tabbedPane);

	        // Make frame visible
	        frame.setVisible(true);
	    }
	}

