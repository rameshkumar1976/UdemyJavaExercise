package com.rameshbasic;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String myString = " This is a String";
        System.out.println("The string value is " +myString);
        myString = myString + " , This is more !..";
        System.out.println("The final string is :"+myString);
        myString = myString + "\u00A9 2019";
        System.out.println("The final string is :"+myString);
        String numString = "250.95";
        numString = numString + "49.55";
        System.out.println("The result is " +numString);
        //Adding a integer to a string
        String lastString = "10";
        int myInt =50;
        lastString=lastString+myInt;
        System.out.println("my LastString value is "+lastString);
        //Adding a double to a string
        double myDouble = 120.47;
        myString = myString+myDouble;
        System.out.println("My string double is "+myString);

    }
}
