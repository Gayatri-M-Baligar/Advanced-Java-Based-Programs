package lab_5;
import javax.swing.*;
import java.awt.*;


public class CountryList {

	    public static void main(String[] args) {
	        // Create main frame
	        JFrame frame = new JFrame("Country List Demo");
	        frame.setSize(300, 300);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLayout(new FlowLayout());

	        // Country list data
	        String[] countries = {
	            "USA", "India", "Vietnam", "Canada",
	            "Denmark", "France", "Great Britain",
	            "Japan", "Africa", "Greenland", "Singapore"
	        };

	        // Create JList with country names
	        JList<String> countryList = new JList<>(countries);
	        countryList.setVisibleRowCount(8);
	        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	        JScrollPane scrollPane = new JScrollPane(countryList);

	        // Add list selection listener
	        countryList.addListSelectionListener(e -> {
	            if (!e.getValueIsAdjusting()) {
	                java.util.List<String> selected = countryList.getSelectedValuesList();
	                System.out.println("Selected countries: " + selected);
	            }
	        });

	        // Add to frame
	        frame.add(new JLabel("Select countries:"));
	        frame.add(scrollPane);

	        // Make frame visible
	        frame.setVisible(true);
	    }
	}

