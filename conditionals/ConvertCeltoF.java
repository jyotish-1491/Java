import java.util.*;
public class ConvertCeltoF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the temp in celcius");
        double a = sc.nextInt();
        double b = ((9.0/5)*a+32);
        System.out.println(b); 
    }
}
