package com.upgradme;

import java.util.Arrays;
import java.util.Scanner;

import static com.upgradme.Patterns.*;

public class Main {

    private static int[] arr = {34, 67, 5, 1111, -7, 9, 11, -1, 222};

    public static void main(String[] args) {
        Main main = new Main();

        main.addNumbers();
        main.arrayAverage();

        pattern1();
        pattern2();
        pattern3();
        pattern4();

        //Two Number Sum Problem
        int[] result = TwoNumberSum.twoNumberSum(arr, 10);
        System.out.println(Arrays.toString(result));

        //Three Largest Numbers
        int[] res = ThreeLargestNumbers.findThreeLargestNumbers(arr);
        System.out.println(Arrays.toString(res));
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

    //ArraysAverage
    private void arrayAverage() {
        int[] arr = new int[]{10, 20, 12, 34, 22, 32};

        int sum = 0;

        for (int num : arr) {
            sum = sum + num;
        }

        double average = sum / arr.length;

        System.out.println("Sum of array elements is: " + sum);

        System.out.println("Average value of array elements is: " + average);
    }
}
