/*Develop a java program for performing various string operations with different string
handling functions directed as follows:
String Creation and Basic Operations, Length and Character Access, String Comparison, String
Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation,
String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and
startsWith() and endsWith()*/


package lab_3;
public class StringOperationsDemo {
	    public static void main(String[] args) {
	        // 1. String Creation and Basic Operations
	        String str1 = "Hello";
	        String str2 = "World";
	        System.out.println("String 1: " + str1);
	        System.out.println("String 2: " + str2);

	        // 2. Length and Character Access
	        System.out.println("Length of str1: " + str1.length());
	        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

	        // 3. String Comparison
	        String str3 = "hello";
	        System.out.println("str1 equals str3 (case-sensitive): " + str1.equals(str3));
	        System.out.println("str1 equals str3 (ignore case): " + str1.equalsIgnoreCase(str3));

	        // 4. String Searching
	        String str4 = "Welcome to Java Programming";
	        System.out.println("Index of 'Java': " + str4.indexOf("Java"));
	        System.out.println("Contains 'Programming': " + str4.contains("Programming"));

	        // 5. Substring Operations
	        System.out.println("Substring from index 11: " + str4.substring(11));
	        System.out.println("Substring from index 11 to 15: " + str4.substring(11, 15));

	        // 6. String Modification
	        String modified = str4.replace("Java", "Python");
	        System.out.println("Modified string: " + modified);

	        // 7. Whitespace Handling
	        String strWithSpaces = "   Trim this string   ";
	        System.out.println("Before trim: '" + strWithSpaces + "'");
	        System.out.println("After trim: '" + strWithSpaces.trim() + "'");

	        // 8. String Concatenation
	        String greeting = str1 + " " + str2;
	        System.out.println("Concatenated String: " + greeting);

	        // 9. String Splitting
	        String csv = "Apple,Banana,Orange";
	        String[] fruits = csv.split(",");
	        System.out.println("Fruits:");
	        for (String fruit : fruits) {
	            System.out.println("- " + fruit);
	        }

	        // 10. StringBuilder Demo
	        StringBuilder sb = new StringBuilder("Java");
	        sb.append(" Programming");
	        sb.insert(0, "Welcome to ");
	        sb.replace(11, 15, "Python");  // Replace 'Java' with 'Python'
	        System.out.println("StringBuilder Output: " + sb.toString());

	        // 11. String Formatting
	        String name = "Alice";
	        int age = 22;
	        String formatted = String.format("Name: %s, Age: %d", name, age);
	        System.out.println("Formatted String: " + formatted);

	        // 12. Email Validation using contains(), startsWith(), endsWith()
	        String email = "student@aiet.edu";
	        boolean isValid = email.contains("@") && email.startsWith("student") && email.endsWith(".edu");
	        System.out.println("Email '" + email + "' is " + (isValid ? "valid" : "invalid"));
	    }
	}

