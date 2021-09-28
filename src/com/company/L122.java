package com.company;

import java.util.Scanner;

public class L122 {
//    public static void main(String[] args) {
//
//    }

    public static void test() {
        final int c = 24;
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("enter two numbers a / b followed by a mod b");
        a = input.nextInt();
        b = input.nextInt();
        System.out.println(a/b);
        System.out.println(a % b);
    }

}
