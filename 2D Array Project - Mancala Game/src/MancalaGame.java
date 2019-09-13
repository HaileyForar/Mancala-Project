import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class MancalaGame
	{
		
		//Things that I need to get a basic game 
			//game board
			//random mover or computer to play against user
			//ways to add and move objects around the board
			//figure out how to end the game
			//how to add up how many "stones/pebbles" each player has at the end
			//public objects so that I can use them in all methods
		//website with help - https://github.com/Fitzy97/final-project/blob/master/Mancala.java

		public static void main(String[] args)
			{
				rulesOfTheGame();
				beginningOfGame();
				mancalaBoard();
			}
		
		public static void rulesOfTheGame()
		{
			System.out.println("In this game you will be playing an African marble game called Mancala. Have fun!");
			
			System.out.println("Before we get started however, here are some of the basic rules...");
			
			System.out.println("Basically it is a game where you rotate your pieces through the pockets and collect your opponents pieces.");
			System.out.println("You always go counter clock-wise.");
			System.out.println("The mancala board is made up of two rows of six pockets each,");
			System.out.print("and all the pockets contain four pieces. Each player has a ");
			System.out.println("\"store\"" + " on their right side of the board.");
			System.out.println("The object of the game is to collect the most pieces by the end.");
			System.out.println("The game ends when all six pockets on one side of the board are empty");
			System.out.println("The player who still has pieces on their side when the game ends gets to collect all those pieces.");
			System.out.println("The winner is the one who has the most pieces.");
			
			System.out.println("Here is what the board would look like...");
			
			System.out.println("Good luck and have fun!");
		}
		
		public static void beginningOfGame()
		{
			Scanner stringInput = new Scanner (System.in);
			System.out.println();
		    System.out.println("What is your name?");
		}
		
		public static void mancalaBoard()
		{
			
		}

	}
