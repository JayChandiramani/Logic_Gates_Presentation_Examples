package com.jetbrain;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		int num1, num2, cnum1, cnum2;
		Scanner Guess_Num = new Scanner(System.in);

		System.out.println("Welcome To 'Guess The Number'");
		System.out.println("Please choose 2 numbers between 1 and 10.");
		System.out.print("1st Guessed Number:");
		num1 = Guess_Num.nextInt();
		cnum1 = 5;
		System.out.print("2nd Guessed Number:");
		num2 = Guess_Num.nextInt();
		cnum2 = 7;

		if (!((num1 == cnum1) || (num2 == cnum2) || (num1 == cnum2) || (num2 == cnum1)))
			System.out.println("Yayyyy");
		else
			System.out.println("Boooo");
	}
}