package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class FiveNumTotal {
    public static void main(String[] args) {
        five();
    }

    public static void five() {
        int[] userNums = {0,0,0,0,0};
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a new value");
            userNums[i] = input.nextInt();
        }

    }
}