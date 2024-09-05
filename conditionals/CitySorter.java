import java.util.Arrays;
import java.util.Scanner;

public class CitySorter {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the first city: ");
        String city1 = scanner.nextLine();

        System.out.print("Enter the second city: ");
        String city2 = scanner.nextLine();

        System.out.print("Enter the third city: ");
        String city3 = scanner.nextLine();

        
        String[] cities = {city1, city2, city3};

       
        Arrays.sort(cities);

        
        System.out.println("The cities in ascending order are:");
        for (String city : cities) {
            System.out.println(city);
        }

      
        scanner.close();
    }
}
