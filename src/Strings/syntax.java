package Strings;

import java.util.Scanner;

public class syntax {
    public static void main(String[] args){
        char[] arr = {'a','b','c','d'};
        String str = "abcd";
        String str2 = "xyz";
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.next();
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.charAt(3));
    }
}