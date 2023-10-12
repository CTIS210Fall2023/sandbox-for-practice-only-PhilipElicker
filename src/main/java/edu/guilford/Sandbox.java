package edu.guilford;

import java.util.Scanner;
import java.util.Timer;

import javax.swing.plaf.synth.SynthStyle;

public class Sandbox {
    public static void main(String[] args) {
        //Counting Loop
        double initialDeposit = 1000;
        double interestRate = 0.03;
        double year1Deposit = 100;
        double currentValue = initialDeposit;
        //Starting Year
        int year = 0;
        int finalYear = 20;

        while (year < finalYear) {
            currentValue = currentValue * (1+interestRate) + year1Deposit;
            System.out.println("At the end of year " + year + 
            " , value = $" + String.format("%.2f",currentValue));
            year = year + 1;
        }

        //Sentinel Loop
        int sentinel = 0;
        int total = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer (0 to stop):\t");
        int value = scan.nextInt();
        while (value != sentinel) {
            total = total + value;
            value = scan.nextInt();
        }
        System.out.println("The total is " + total);
}
}