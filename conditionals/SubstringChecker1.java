import java.util.Scanner;

public class SubstringChecker1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

       
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

       
        if (firstString.contains(secondString)) {
            System.out.println("The second string is a substring of the first string.");
        } else {
            System.out.println("The second string is NOT a substring of the first string.");
        }

        
        scanner.close();
    }
    }
