import java.util.*;
public class GEATEST_THREEladder {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st side:");
        int a = sc.nextInt();
        System.out.println("enter the 2nd side:");
        int b = sc.nextInt();
        System.out.println("enter the 3rd side:");
        int c = sc.nextInt();
        
        if(a>=b && a>=c)
                System.out.println(a+ "greatest no.");
        else if(b>=a && b>=c) 
              System.out.println(b+" is the greatest no.");
        else System.out.println(c + " is the greatest no.");   
   }  
}