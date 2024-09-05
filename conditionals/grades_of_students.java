import java.util.*;
public class grades_of_students {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no:");
        int n = sc.nextInt();

        if(n>= 81)System.out.println("very good ");
       else if (n>=61 && n<=80 ) 
                   System.out.println("good ");
        else if(n>=41 && n<=60) 
                   System.out.println("average");
         else System.out.println("fail");  
        }
    
    }

