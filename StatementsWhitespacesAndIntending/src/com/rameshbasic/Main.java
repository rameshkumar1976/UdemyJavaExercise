package com.rameshbasic;

public class Main {

    public static void main(String[] args) {
        // The below statement is still valid
        int myVariable
                =
                50;
        myVariable++;
        myVariable--;
        System.out.println("This is a test");
        System.out.println("This is" +
                " another" +
                " still more.");
        // the below statement is still valid, multiple statement on the same line
        int anotherValue = 50;
        myVariable--;
        System.out.println("This is another one");

        //Indenting
        if (myVariable == 50) {
            System.out.println("this is a test");
        }
    }
}
