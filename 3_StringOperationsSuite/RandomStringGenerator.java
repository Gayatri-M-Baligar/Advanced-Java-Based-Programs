/*Write a Java Program for Creating a random string of a specified length using user defined
function generateRandomString()*/

package lab_3;
import java.util.Random;
import java.util.Scanner;
public class RandomStringGenerator {

	    // User-defined function to generate a random string
	    public static String generateRandomString(int length) {
	        if (length <= 0) return "";

	        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	        StringBuilder result = new StringBuilder();
	        Random rand = new Random();

	        for (int i = 0; i < length; i++) {
	            int index = rand.nextInt(characters.length());
	            result.append(characters.charAt(index));
	        }

	        return result.toString();
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input from user
	        System.out.print("Enter desired length for random string: ");
	        int length = scanner.nextInt();

	        // Generate and display random string
	        String randomStr = generateRandomString(length);
	        System.out.println("Generated Random String: " + randomStr);

	        scanner.close();
	    }
	}

