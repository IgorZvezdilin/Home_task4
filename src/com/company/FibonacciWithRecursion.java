package com.company;

public class FibonacciWithRecursion {

    public static int calculateFibonacciWithRecursion(int NumberFibonacci) {
        if (NumberFibonacci == 1 | NumberFibonacci == 2) return 1;
        return calculateFibonacciWithRecursion(NumberFibonacci - 1) + calculateFibonacciWithRecursion(NumberFibonacci - 2);
    }


}
