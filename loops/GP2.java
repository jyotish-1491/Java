import java.util.*;
public class GP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the digit");
        int n = sc.nextInt();
        // 1 2 4 8
        int a=1;
        for(int i=1;i<=n;i++)
        {
            System.out.println(a);
            a*=9;
    }
}
}