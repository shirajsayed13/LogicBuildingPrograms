package com.upgradme;

import java.util.Scanner;

import static com.upgradme.Patterns.*;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.addNumbers();

        pattern1();
        pattern2();
        pattern3();
        pattern4();
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
