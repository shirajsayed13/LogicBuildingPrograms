package com.upgradme;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.pattern();
        main.addNumbers();
    }

    /**
     *
     * *
     * * *
     * * * *
     * * * * *
     **/
    private void pattern() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
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
