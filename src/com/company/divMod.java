package com.company;

import java.util.Scanner;

public class divMod {
    public static void divModMeth() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 1 play, 0 to exit");
        int choiceNum = input.nextInt();
        while (choiceNum == 1) {
            System.out.println("enter a num to check if even or odd");
            int userNum = input.nextInt();
            if (userNum % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("odd");
            }
            System.out.println("play again 1 to play");
            choiceNum = input.nextInt();
        }
        System.out.println("no more playing eh? okey dokey, ciao");
    }
}