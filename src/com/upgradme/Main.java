package com.upgradme;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.pattern();
    }

    private void pattern() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
