package edu.guilford;

import java.util.Timer;

import javax.swing.plaf.synth.SynthStyle;

public class Sandbox {
    public static void main(String[] args) {
    int Value1 = 140;
    int Value2 = 200;
    
    double Value3 = Value1 + Value2;
    System.out.println("Hello " + Value3);
    if (Value1 > Value2) {
        System.out.println("Value 1 is greator");
    } else {
        System.out.println("Value 2 is greator");
    }
        
    }
}