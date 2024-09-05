import java.util.*;
public class GREATEST_THREE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st side:");
        int a = sc.nextInt();
        System.out.println("enter the 2nd side:");
        int b = sc.nextInt();
        System.out.println("enter the 3rd side:");
        int c = sc.nextInt();

        if(a>b && a>c)System.out.println(a + " is greatest");
        if (b>a && b>c)System.out.println(b +" is the greatest");
        if (c>a && c>b)System.out.println(c+ " is the greatest"); 
            
        
            
        

  }

}