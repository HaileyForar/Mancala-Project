import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class MancalaGame
	{

		public static void main(String[] args)
			{
				rulesOfTheGame();
				beginningOfGame1();
				beginningOfGame2();
//		        gameVariables();
		        disclaimer();
		        playingTheGame();
			    mancalaBoard();
			}
		
		//Global Methods
		static String player1;
		static String player2;
		public static int[][] gameBoard = new int [2] [8];
		static boolean player1IsGoing;
		static boolean player2IsGoing;
        static boolean gameIsPlaying;
		
		//Simple explanation of the rules of the game and what the actual game board would look like
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
		
		//Initializing Player 1 and Player 2
		public static void beginningOfGame1()
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
		
		//Very beginning of the game - initializing the variables and inserting 4 stones in each pocket
		public static void beginningOfGame2()
		{
			//In the beginning of the game - the end pockets start with 0 stones, and all the subsequent pockets contain 4

			System.out.println("Alright, So each of the six pockets on either side contain 4 stones, but the two stores on the ends don't contain any.");
			
			gameBoard[0][1] = 4;
			gameBoard[0][2] = 4;
		    gameBoard[0][3] = 4;
			gameBoard[0][4] = 4;
			gameBoard[0][5] = 4;
			gameBoard[0][6] = 4;
			gameBoard[1][1] = 4;
		    gameBoard[1][2] = 4;
			gameBoard[1][3] = 4;
			gameBoard[1][4] = 4;
			gameBoard[1][5] = 4;
			gameBoard[1][6] = 4;
			
			System.out.println("-----------------------------------------");
			System.out.println("|    |    |    |    |    |    |    |    |"); 
			System.out.println("| " + gameBoard[0] [0] + "  | " + gameBoard[0] [1] + "  | " + gameBoard[0] [2] + "  | " + gameBoard[0] [3] + "  | " + gameBoard[0] [4] + "  | " + gameBoard[0] [5] + "  | " + gameBoard[0] [6] + "  | " + gameBoard[0] [7] + "  | ");
			System.out.println("|    |    |    |    |    |    |    |    |");
			System.out.println("|----------------------------------------");
			System.out.println("|    |    |    |    |    |    |    |    |");
			System.out.println("| " + gameBoard[1] [0] + "  | " + gameBoard[1] [1] + "  | " + gameBoard[1] [2] + "  | " + gameBoard[1] [3] + "  | " + gameBoard[1] [4] + "  | " + gameBoard[1] [5] + "  | " + gameBoard[1] [6] + "  | " + gameBoard[1] [7] + "  | ");
			System.out.println("|    |    |    |    |    |    |    |    |");
			System.out.println("-----------------------------------------");
			
		}
		
		//Main body and code for the middle of the game
		public static void disclaimer()
		{
			System.out.println("Please just ignore the bottom left and right corners - your store will be in the top left and right corner squares.");
		}
		
		//While loop for when player 1 is taking their turn
		public static void playingTheGame()
		{
			int score = 0;
			int stonesInHand = gameBoard[0][0];
			gameBoard[0][0] = 0;
			
			gameIsPlaying = true;
			
			while(gameIsPlaying)
			{
			player1IsGoing = true;
			
			while(player1IsGoing)
				{
					player2IsGoing = false;
				}
			
		    player2IsGoing = true;
			
			while(player2IsGoing)
				{
					player1IsGoing = false;
				}
			}
		}
		
		//Visual of the Mancala Board
		public static void mancalaBoard()
		{
			System.out.println("-----------------------------------------");
			System.out.println("|    |    |    |    |    |    |    |    |"); 
			System.out.println("| " + gameBoard[0] [0] + "  | " + gameBoard[0] [1] + "  | " + gameBoard[0] [2] + "  | " + gameBoard[0] [3] + "  | " + gameBoard[0] [4] + "  | " + gameBoard[0] [5] + "  | " + gameBoard[0] [6] + "  | " + gameBoard[0] [7] + "  | ");
			System.out.println("|    |    |    |    |    |    |    |    |");
			System.out.println("|----------------------------------------");
			System.out.println("|    |    |    |    |    |    |    |    |");
			System.out.println("| " + gameBoard[1] [0] + "  | " + gameBoard[1] [1] + "  | " + gameBoard[1] [2] + "  | " + gameBoard[1] [3] + "  | " + gameBoard[1] [4] + "  | " + gameBoard[1] [5] + "  | " + gameBoard[1] [6] + "  | " + gameBoard[1] [7] + "  | ");
			System.out.println("|    |    |    |    |    |    |    |    |");
			System.out.println("-----------------------------------------");
			
		}

//public class HelloWorldTestProject {
//
//	public static void main(String[] args) 
//	{
//		System.out.println("Hello World");
//		
//		int[] a = {4,4,4,4,4,4,4,5,4,3,2,1};
//		
//		System.out.println(arrToString(a));
//
//		int score = 0;
//		
//		// make a move with a[0]
//		int stonesInHand = a[0];
//		a[0] = 0;
//		
//		for (int currentIdx = 1; stonesInHand > 0; currentIdx++) {
//			a[currentIdx]++;
//			stonesInHand--;
//		}
//
//
//		System.out.println(arrToString(a));
//	}
//	
//
//	public static String arrToString(int[] a) {
//		String result = "[";
//		for (int i = 0; i < a.length; i++) {
//			result += a[i];
//
//			if (i != a.length-1) {
//				result += ", ";
//			}
//			if (i == a.length / 2 - 1) {
//				result += "\n";
//			}
//		}
//		
//		return result + "]";
//	}
//}


	}
