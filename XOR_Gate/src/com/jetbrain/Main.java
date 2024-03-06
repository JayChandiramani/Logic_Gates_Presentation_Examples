package com.jetbrain;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int guessnum1,guessnum2,correctnum1,correctnum2;
	Scanner Guess_Number = new Scanner (System.in);

	System.out.println ("Welcome To 'Guess The Number'");
	System.out.println ("Please choose 2 numbers between 1 and 10.");
	System.out.print ("1st Guessed Number:");
	guessnum1= Guess_Number.nextInt();
	correctnum1 = 5;
	System.out.print ("2nd Guessed Number:");
	guessnum2= Guess_Number.nextInt();
	correctnum2 = 7;
	if ((guessnum1==correctnum1)^(guessnum2==correctnum2)^(guessnum1==correctnum2)^(guessnum2==correctnum1))
		System.out.println ("Yayyy");
	else
		System.out.println("Booo");
    }
}