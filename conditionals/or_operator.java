import java.util.*;
public class or_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.");
        int n = sc.nextInt();
       
        if (n%5==0||n%3==0) {
            System.out.println("no.is divisible by 3 or 5");
        }// or operator is that in which one of them is true, then true
        else  System.out.println("NO. IS NOT DIVISIBLE");
          }
}
