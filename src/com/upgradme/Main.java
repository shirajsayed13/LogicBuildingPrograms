package com.upgradme;

import java.util.Arrays;
import java.util.Scanner;

import static com.upgradme.Patterns.*;

public class Main {

    private static int[] arr = {3, 5, -7, 9, 1, 2};

    public static void main(String[] args) {
        Main main = new Main();
        main.addNumbers();

        pattern1();
        pattern2();
        pattern3();
        pattern4();

        //Two Number Sum Problem
        int[] result = TwoNumberSum.twoNumberSum(arr, 10);
        System.out.println(Arrays.toString(result));
    }

    //Add Numbers
    private void addNumbers() {
        int x, y, z;
        System.out.println("Enter two Integers to calculate their Sum ");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value of X ");
        x = in.nextInt();
        System.out.println("Enter value for Y ");
        y = in.nextInt();

        z = x + y;
        System.out.println("Sum of Entered Integers = " + z);
    }
}
