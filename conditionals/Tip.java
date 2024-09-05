import java.util.*;

public class Tip {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the subtotal:");
        double subtotal = input.nextDouble();

        System.out.println("enter the gratuate rate in %");
        double gratutiyrate = input.nextDouble();

        double gratutity = (gratutiyrate / 100) * subtotal;
        double total = gratutity + subtotal;

        System.out.printf("Gratutity: $%.2f%n" , gratutity);
        System.out.printf("Total :" ,total);
    }
    }


