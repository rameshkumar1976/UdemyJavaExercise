package com.rameshbasic;

public class Main {

    public static void main(String[] args) {

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        //int has a width of 32 (4 Bytes)
        System.out.println("myIntValue "+myIntValue);
        //float has 7 precision and a width of 32 (4 Bytes)
        System.out.println("myFloatValue "+myFloatValue);
        //double has 16 precision and a width of 64 (8 Bytes)
        System.out.println("myDoubleValue "+myDoubleValue);

        // Convert a pound to kilograms
        int noOfPounds = 200;
        double Kilogram = 0.45359237d;
        double convertedValue = noOfPounds * Kilogram;
        System.out.println("Converting "+noOfPounds +"pounds to kilogram is equal to :"+convertedValue);
    }
}
