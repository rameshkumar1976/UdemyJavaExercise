package com.rameshbasic;

public class Main {

    public static void main(String[] args) {

        // Int has a width of 32
        int myMinValue=-2_147_483_648;
        int myMaxValue = 2_147_483_647;

        //Byte has a width of 8
        byte myMinByteValue=-128;
        byte myMaxByteValue=127;
        //type Casting
        byte myNewByteValue = (byte) (myMinByteValue/2);

        //Short has a width of 16
        short myMinShortValue = -32768;
        short myMaxShortValue = 32767;
        //type casting
        short myNewShortValue = (short)(myMinShortValue/2);

        //Long has a width of 64
        long myLongValue = 100L;
        long myMinLongValue = -9_223_372_036_854_775_808L;
        long myMaxLongValue = 9_223_372_036_854_775_807L;
        long myNewLongValue = (myMinLongValue / 2);

        //Exercise in the Udemy tutorial

        byte myByte = 10;
        short myShort = 20;
        int myInt = 50;
        long myLong = 50000L + 10L * ( myByte + myShort + myInt);
        System.out.println(myLong);
        short myShortTotal = (short)(1000 + 10 * (myByte+myShort+myInt));
        System.out.println(myShortTotal);
    }
}
