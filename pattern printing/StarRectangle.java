import java.util.*;
public class StarRectangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int m = sc.nextInt();
        System.out.println("enter the no. of column");
        int n = sc.nextInt();

        for(int i=1;i<=m;i++){  //rows
            for(int j=1;j<=n;j++){  //column
            System.out.print("* ");
        }
        System.out.println();
    }
}
}