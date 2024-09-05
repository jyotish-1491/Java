package BASICS;

import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        System.out.print("enter the no-");
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("square of no is-");
        System.out.println(n*n);

    }
    
}
