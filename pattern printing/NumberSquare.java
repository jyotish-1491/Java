import java.util.*;
public class  NumberSquare{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the the no.");
        int x = sc.nextInt();
   
         for(int i=1;i<=x;i++){
           for(int j=1;j<=x;j++){
               System.out.print(j + " ");
           }
           System.out.println();
         }
   
   
       }  
    }
