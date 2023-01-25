import java.util.Random;
import java.util.Scanner;
public class esp {
    public static void main(String[] args) {
        //create array of words and assign to numbers?
        //create variable to select a value in array ^^
        //method created to select a number randomly that is assigned to a color

        //create scanner variable
        Scanner keyboard = new Scanner(System.in);

        //begin game
        System.out.println("Do you want to play a game? >:)");
        //MWAHAHAHAHAHA
        String gameOn = keyboard.nextLine();
        if (gameOn.equals("yes")) {
            System.out.println("You have 10 guesses to choose a color.");
            System.out.println("If you do not select the correct color enough times, I WILL DESTROY YOUR COMPUTER MWUAHAHAHA!");
            System.out.println("Okay...not really, but I'll make fun of you relentlessly.");
            //>:)

            //game time!
            game();
        }
        else {
            System.out.println("Well I guess you don't want to play...");
        }

    }
    public static void game() {
        Scanner keyboard = new Scanner(System.in);
        int score = 0;
        System.out.println("Okay. Time to choose your color!");
        int count = 0;
        while (count <=10) {
            System.out.println("Chose a color from the following: Red, Green, Blue, Orange, Yellow");
            selectColor();
            String playerColor = keyboard.nextLine();

            //increase score for each correct guess
            if (playerColor.equals(selectColor())) {
                score++;
            }
            count++;
            System.out.println("Count times: " + count);
            System.out.println("The Score is " + score);
        }
        switch (score)
        {
            case 10:
                System.out.println("Wow. I'm genuinely impressed. You got it right every time.");

            case 5, 6, 7, 8, 9:
                System.out.println("Okay, I'll admit..." + score + " out of 10 isn't bad...Good job.");

            case 1, 2, 3, 4:
                System.out.println("Wow...I expected better..." + score + " out of 10...tsk tsk tsk");

            case 0:
                System.out.println("HAHAHAHA YOU MUST BE SO EMBARRASSED!!!! " + score + " OUT OF 10 HA!");
        }
        System.out.println("Anyways...Thanks for playing my game. BYE");
    }
    public static String selectColor() {
        String[] colorSelection = {"Red", "Green", "Blue", "Orange", "Yellow"};
        //System.out.println("Array Created");

        //create randomNumber generator
        Random rand = new Random();

        //pick a random number
        int selectNumber = rand.nextInt(0,4);
        //System.out.println("DEBUG: the number selected " + selectNumber);

        //picks color for player to guess
        //System.out.println("DEBUG: the color selected is " + colorSelection[selectNumber]);

        return colorSelection[selectNumber];
    }
}

/*
Write a program that tests your ESP (extrasensory perception). The
program should randomly select the name of a color from the following
list of words:

Red, Green, Blue, Orange, Yellow

To select a word, the program can generate a random number. For
example, if the number is 0, the selected word is Red; if the number is 1,
the selected word is Green; and so forth.

Next, the program should ask the user to enter the color that the
computer has selected. After the user has entered his or her guess, the
program should display the name of the randomly selected color. The
program should repeat this 10 times and then display the number of
times the user correctly guessed the selected color. Be sure to modularize
the program into methods that perform each major task.
 */