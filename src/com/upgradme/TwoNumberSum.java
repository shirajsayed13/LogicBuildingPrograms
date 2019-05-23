package com.upgradme;

public class TwoNumberSum {

    public static int[] twoNumberSum(int[] array, int targetSum) {
        for (int i = 0; i < array.length; i++) {
            int firstNumber = array[i];
            for (int j = i + 1; j < array.length; j++) {
                int secondNumber = array[j];
                if (firstNumber + secondNumber == targetSum) {
                    return firstNumber > secondNumber ? new int[]{secondNumber, firstNumber}
                            : new int[]{firstNumber, secondNumber};
                }
            }
        }
        return new int[0];
    }
}
