import java.util.*;
public class SSNValidator {
       public static void main(String[] args) {
        
       
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a Social Security Number
        String ssn = scanner.nextLine();
          
        // Regular expression to match the SSN format
        if (ssn.matches("\\d{3}-\\d{2}-\\d{4}")) {
            System.out.println("Valid SSN");
        } else {
            System.out.println("Invalid SSN");
        }

        // Close the scanner
        scanner.close();
    }

