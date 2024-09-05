import java.util.*;
public class Ntableofn {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.");
        int n = sc.nextInt();
        for(int i=n;i<=n*10;i+=n)
        {
            System.out.println(i);
        }
    }

}
