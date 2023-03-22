package GuesserGame;

import java.util.*;

// ................Class Guesser.........................

class Guesser {
    int guessNum;

    int guessingNumber() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Guess The Number ");
        guessNum = scan.nextInt();
        return guessNum;
    }
}

// <...............Class Player...........................>

class Player {
    int guessNum;

    int guessingNumber() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Players Guess The NUmber ");
        guessNum = scan.nextInt();
        return guessNum;
    }
}

// <...............................Class Umpire..................>

class Umpire {
    int numGuesser;
    int numUser1;
    int numUser2;
    int numUser3;

    void collectNumGuesser() {

        Guesser obj = new Guesser();
        numGuesser = obj.guessingNumber();

    }

    void collectNumUsers() {

        Player U1 = new Player();
        Player U2 = new Player();
        Player U3 = new Player();

        numUser1 = U1.guessingNumber();
        numUser2 = U2.guessingNumber();
        numUser3 = U3.guessingNumber();

    }

    void compare() {
        if (numGuesser == numUser1) {
            System.out.println("User:1 won the game ");
        } else if (numGuesser == numUser2) {
            System.out.println("User:2 won the game");
        } else if (numGuesser == numUser3) {
            System.out.println("User:3 won the game ");

        } else {
            System.out.println("Lal Ji your Users Lost the Game");
        }

    }

}

// <....................Main Class....................................>

public class Launch1
 {
    public static void main(String[] args)
     {

        System.out.println("Game Start... ");
        Umpire u = new Umpire();
        u.collectNumGuesser();
        u.collectNumUsers();
        u.compare();

    }

}
