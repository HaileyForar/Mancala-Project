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
				beginningOfTheGame();
			}
		
		//Global Methods
		
		static String player1;
		static String player2;
		public static int[][] gameBoard = new int [2] [8];
		
		static int AB;
		static int BA;
		static int B6;
		static int B5;
		static int B4;
		static int B3;
		static int B2;
		static int B1;
		static int A6;
		static int A5;
		static int A4;
		static int A3;
		static int A2;
		static int A1;
		
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
			System.out.println("-----------------------------------------");
			System.out.println("|    |    |    |    |    |    |    |    |");
			System.out.println("|    |    |    |    |    |    |    |    |");
			System.out.println("|    |-----------------------------|    |");
			System.out.println("|    |    |    |    |    |    |    |    |");
			System.out.println("|    |    |    |    |    |    |    |    |");
			System.out.println("-----------------------------------------");
			
			System.out.println("Good luck and have fun!");
		}
		
		public static void beginningOfGame()
		{
			Scanner stringInput1 = new Scanner (System.in);
			System.out.println();
		    System.out.println("What is your name Player 1?");
		    player1 = stringInput1.next();
		    
		    Scanner stringInput2 = new Scanner (System.in);
		    System.out.println();
		    System.out.println("What is your name Player 2?");
		    player2 = stringInput2.next();
		    
		    System.out.println();
		    System.out.println("Hello, " + player1 + " and " + player2 + ". Let's play Mancala!");
		}
		
		public static void mancalaBoard()
		{
			System.out.println("-----------------------------------------");
			System.out.println("|    |    |    |    |    |    |    |    |");
			System.out.println("|" + gameBoard[0] [0] + "|" + gameBoard[0] [1] + "|" + gameBoard[0] [2] + "|" + gameBoard[0] [3] + "|" + gameBoard[0] [4] + "|" + gameBoard[0] [5] + "|" + gameBoard[0] [6] + "|" + gameBoard[0] [7] + "|");
			System.out.println("|    |    |    |    |    |    |    |    |");
			System.out.println("|---------------------------------------|");
			System.out.println("|    |    |    |    |    |    |    |    |");
			System.out.println("|" + gameBoard[1] [0] + "|" + gameBoard[1] [1] + "|" + gameBoard[1] [2] + "|" + gameBoard[1] [3] + "|" + gameBoard[1] [4] + "|" + gameBoard[1] [5] + "|" + gameBoard[1] [6] + "|" + gameBoard[1] [7] + "|");
			System.out.println("|    |    |    |    |    |    |    |    |");
			System.out.println("-----------------------------------------");
			
			AB = gameBoard[0] [0] + gameBoard[1] [0];
			BA = gameBoard[0] [7] + gameBoard[1] [7];
			
			B6 = gameBoard[0] [1];
			B5 = gameBoard[0] [2];
			B4 = gameBoard[0] [3];
			B3 = gameBoard[0] [4];
			B2 = gameBoard[0] [5]; 
			B1 = gameBoard[0] [6];
			
			A6 = gameBoard[1] [1];
			A5 = gameBoard[1] [2];
			A4 = gameBoard[1] [3];
			A3 = gameBoard[1] [4];
			A2 = gameBoard[1] [5];
			A1 = gameBoard[1] [6];
			
		}
		
		public static void beginningOfTheGame()
		{
			//In the beginning of the game - the end pockets start with 0 stones, and all the subsequent pockets contain 4
			
			AB = 0;
			BA = 0;
			
			B6 = 4;
			B5 = 4;
			B4 = 4;
			B3 = 4;
			B2 = 4;
			B1 = 4;
			
			A6 = 4;
			A5 = 4;
			A4 = 4;
			A3 = 4;
			A2 = 4;
			A1 = 4;
			
			System.out.println("Alright, So each of the six pockets on either side contain 4 stones, but the two stores on the ends don't contain any.");
			System.out.println(player1 + "- type in the coordinates of your first move. Ex. B6 would be the first pocket in the top left corner.");
			Scanner userInput = new Scanner (System.in);
			
		}

	}
