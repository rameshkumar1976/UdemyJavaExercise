package com.rameshbasic;

public class Main {

    public static void main(String[] args) {
        int result = 1 +2;
        System.out.println("1 + 2 = "+result);
        int previousResults = result;
        result=result-1;
        System.out.println(previousResults+" - 1 = "+result);
        result = result * 10;
        System.out.println(previousResults+" * 2 = "+result);
        result = result / 5;
        System.out.println(previousResults+" / 5 = "+result);
        previousResults = result;
        result = result % 3;
        System.out.println(previousResults+" % 3 = "+result);
        previousResults = result;
        result = result + 1;
        System.out.println("Result is now : "+result);
        result++;
        System.out.println("Result is now : "+result);
        result--;
        System.out.println("Result is now : "+result);
        result += 2;
        System.out.println("Result is now : "+result);
        result *= 10;
        System.out.println("Result is now : "+result);
        result -= 10;
        System.out.println("Result is now : "+result);
        result /= 10;
        System.out.println("Result is now : "+result);

        boolean isAlien = true;
        if (isAlien==false)
            System.out.println("It is not a Alien");
        int topScore = 100;
        if (topScore > 100)
            System.out.println("Result of > : You got the high score");
        topScore = 80;
        if(topScore<100)
            System.out.println("Result of < : you got the high score");

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100)
            System.out.println("Greater than second top score and less than 100");

        // this is a exercise
        double doubleValue1 = 20d;
        double doubleValue2 = 80d;
        double result1;
        result1 = (doubleValue1 + doubleValue2) * 25;
        double reminder = result1 % 40;
        if (reminder <= 20)
            System.out.println("Total was over the limit");






    }
}
