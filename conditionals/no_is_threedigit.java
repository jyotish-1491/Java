import java.util.*;

import BASICS.nextl;

public class no_is_threedigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.");
        int n = sc.nextInt();

        if(99<n && n>1000) System.out.println("3 digit no.");
        else System.out.println("not a three digit no.");
    }   
}
