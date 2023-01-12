package Phase1_basic;

import java.util.Scanner;

public class StringDemo{

    public static void main(String[] args){
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = s1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Str");
        String s4 = sc.next();

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);

        System.out.println();
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s2));

    }
}