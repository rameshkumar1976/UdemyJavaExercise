package com.rameshbasic;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver = true;
	    int score = 800;
	    int levelCompleted = 5;
	    int bonus = 100;

//	    if (score < 5000 && score > 1000) {
//			System.out.println("Your score was less than 5000 but greater than 1000");
//		} else if(score < 1000) {
//			System.out.println("Your score is less than 1000");
//		}
//			else{
//				System.out.println("Got here");
//	    }
		// you can also use if(gameOver)
		if(gameOver == true){
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final score was " +finalScore);
		}
		// the below line will throw an error as it is outside of the code block
		// int savedFinalScore = finalScore;

		score = 10000;
		levelCompleted = 8;
		bonus = 200;
		if(gameOver){
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final score was "+finalScore);
		}

    }
}
