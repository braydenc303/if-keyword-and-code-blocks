package academy.learnprogramming;

public class Main {
    public static void main(String[] args) throws Exception {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        //Though the curly brackets are not needed if there is only one statement within the code block, it does make it easier to read. I prefer to use them even in the case of only needing one statement. In addidtion you should not add a semicolon at the end of an if statement, because it can cause unwanted behavior.

        // if(score < 5000 && score > 1000) {
        //     System.out.println("Your score was less that 5000 but greater than 1000");
        // } else if (score < 1000) {
        //     System.out.println("Your score was less than 1000");
        // } else {
        //     System.out.println("Got here");

        // }

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        //Java is block scoped as opposed to function scoped. So any variable created inside of a block of code will not be accessible outside of it. ie finalScore above is not available outside of the if statement.

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

    }
}