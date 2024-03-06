package com.jetbrain;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Integer guessnum,correctnum;
	Scanner Guess_number = new Scanner(System.in);

	System.out.println ("Welcome To 'Guess The Number'");
	System.out.println ("Please choose a number between 1 and 10.");
	System.out.print ("Guessed Number:");
	guessnum= Guess_number.nextInt();
	correctnum = 7;
	if (guessnum != correctnum)
	    System.out.println ("You guessed the wrong number.");
	else
		System.out.println ("You guessed the correct number.");
    }
}