/*	
 * Name: Guessing Game
 * Author: Kaitlyn Cao	
 * Date: 9/26/17
 */

package game;

import java.util.Scanner;
import java.util.InputMismatchException;
public class GuessingGame
{
	//next line is unnecessary, so is the close statement
//	private static Scanner input;
	public static void main(String[] args)
	{
  		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String s = input.next();
		System.out.println("Nice to meet you, " + s);
		int answer = (int) (Math.random() * 10 + 1);
		int guess = 0;
		//use input.reset() in the inner loop
		while(guess != answer)
		{
			boolean isNumber = false;
			while(!isNumber)
			{
				try
				{
					System.out.println("Pick a number from 1 - 10");
					input.reset();	
					guess = input.nextInt();
					isNumber = true;
				}
				catch(InputMismatchException e)
				{
					System.out.println("That was error type: " + e);
					
				}				
			}
			if(guess > answer)
			{
				System.out.println("That's too high. Try again.");	
				
			}
			if(guess < answer)
			{
				System.out.println("That's too low. Try again.");
			}
			if(guess == answer)
			{
				System.out.println("Good job! You guessed it!");
			}			
		}
		input.close();
	}
}