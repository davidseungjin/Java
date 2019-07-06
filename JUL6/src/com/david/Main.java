package com.david;

public class Main {
    public static void main(String[] args) {
	    // write your code here
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        System.out.print(calculateScore(true, 800, 5, 100));
        calculateScore(true, 10000, 8, 200);
        }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
            return finalScore + 1;
        }

        return -1;
    }
}
