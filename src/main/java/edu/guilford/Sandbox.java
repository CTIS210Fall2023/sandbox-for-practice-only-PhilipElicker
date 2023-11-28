package edu.guilford;

import java.util.Scanner;
import java.util.Timer;

import javax.swing.plaf.synth.SynthStyle;

public class Sandbox {
    public static void main(String[] args) {
    // Recursion
    int n = 10;
    // Ask for 10!
    System.out.println("The value of " + n + "! is " + factorial(n));
}

public static int factorial(int nextN) {
    // Recursive method for calculating the factorial of nextN
    // Base Case
    if (nextN == 0) {
        return 1;
    } else {
        // Calculate factorial of smaller value
        int smallerFact = nextN * factorial(nextN - 1);
        return smallerFact;
    }
}

}