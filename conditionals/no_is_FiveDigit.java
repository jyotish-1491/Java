import java.util.*;
public class no_is_FiveDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.");
        int n = sc.nextInt();

        if (9999<n && n<100000) // and && are operator that work if both the condition are true
            System.out.println("the no is five digit");
        
        else System.out.println("the no. is not five digit ");
    }
}
