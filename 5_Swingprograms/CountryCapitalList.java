package lab_5;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class CountryCapitalList {

	    public static void main(String[] args) {
	        // Create the frame
	        JFrame frame = new JFrame("Country and Capital Demo");
	        frame.setSize(350, 300);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLayout(new FlowLayout());

	        // List of countries
	        String[] countries = {
	            "USA", "India", "Vietnam", "Canada",
	            "Denmark", "France", "Great Britain",
	            "Japan", "Africa", "Greenland", "Singapore"
	        };

	        // Map of countries to their capitals
	        Map<String, String> countryCapitalMap = new HashMap<>();
	        countryCapitalMap.put("USA", "Washington, D.C.");
	        countryCapitalMap.put("India", "New Delhi");
	        countryCapitalMap.put("Vietnam", "Hanoi");
	        countryCapitalMap.put("Canada", "Ottawa");
	        countryCapitalMap.put("Denmark", "Copenhagen");
	        countryCapitalMap.put("France", "Paris");
	        countryCapitalMap.put("Great Britain", "London");
	        countryCapitalMap.put("Japan", "Tokyo");
	        countryCapitalMap.put("Africa", "Addis Ababa"); // Assumed AU HQ
	        countryCapitalMap.put("Greenland", "Nuuk");
	        countryCapitalMap.put("Singapore", "Singapore");

	        // Create JList
	        JList<String> countryList = new JList<>(countries);
	        countryList.setVisibleRowCount(8);
	        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	        JScrollPane scrollPane = new JScrollPane(countryList);

	        // Add selection listener
	        countryList.addListSelectionListener(e -> {
	            if (!e.getValueIsAdjusting()) {
	                List<String> selectedCountries = countryList.getSelectedValuesList();
	                System.out.println("Selected countries and capitals:");
	                for (String country : selectedCountries) {
	                    String capital = countryCapitalMap.getOrDefault(country, "Unknown");
	                    System.out.println(country + " - " + capital);
	                }
	                System.out.println("-----------------------------");
	            }
	        });

	        // Add components to frame
	        frame.add(new JLabel("Select countries:"));
	        frame.add(scrollPane);

	        // Display frame
	        frame.setVisible(true);
	    }
	}
