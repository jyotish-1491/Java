import java.util.Random;
public class PlateNumberGenerator {
    public static void main(String[] args) {
        
        Random random = new Random();

        
        char letter1 = (char) ('A' + random.nextInt(26));
        char letter2 = (char) ('A' + random.nextInt(26));
        char letter3 = (char) ('A' + random.nextInt(26));

      
        int digit1 = random.nextInt(10);
        int digit2 = random.nextInt(10);
        int digit3 = random.nextInt(10);
        int digit4 = random.nextInt(10);

       
        String plateNumber = "" + letter1 + letter2 + letter3 + digit1 + digit2 + digit3 + digit4;

        
        System.out.println("Generated plate number: " + plateNumber);
    }
}