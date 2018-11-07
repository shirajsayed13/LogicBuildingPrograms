package com.upgradme;

class Patterns {

    /**
     *
     * *
     * * *
     * * * *
     * * * * *
     **/

    static void pattern1() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     1
     12
     123
     1234
     12345*/

    static void pattern2() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /**
     54321
     5432
     543
     54
     5*/

    static void pattern3() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /**
    12345
    1234
    123
    12
    1*/

    static void pattern4() {
        for (int i = 1, r = 5; i <= 5; r--, i++) {
            for (int j = 1; j <= r; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
