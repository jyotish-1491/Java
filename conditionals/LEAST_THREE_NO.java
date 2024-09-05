import java.util.*;
public class LEAST_THREE_NO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value c:");
        int a = sc.nextInt();
        System.out.println("enter the value b:");
        int b = sc.nextInt();
        System.out.println("enter the value of c:");
        int c = sc.nextInt();
        if(a > b){
            if(a > c)System.out.println(a+" is the greatest no. ");
            else // c> a>b
              System.out.println(c+ "it is the largest");

        }
      else{
        if(b > c)System.out.println(b+"is the greatest");
        else // c > b > c
        System.out.println(c+"it is the greatest");
      }
    }
}
