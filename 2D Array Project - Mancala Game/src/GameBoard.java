
public class GameBoard
	{

		public static void main(String[] args)
			{
				boardDisplay();
//				gameBoardDatabase();
			}
		
		static String[][] gameBoard = new String [2] [8];
		
//		static int A1;
//		static int A2;
//		static int A3;
//		static int A4;
//		static int A5;
//		static int A6;
//		static int B1;
//		static int B2;
//		static int B3;
//		static int B4;
//		static int B5;
//		static int B6;
		
		public static void boardDisplay()
		{
			//Visual game board
			
			System.out.println("-----------------------------------------");
			System.out.println("|    |    |    |    |    |    |    |    |");
			System.out.println("|" + gameBoard[0] [0] + "|" + gameBoard[0] [1] + "|" + gameBoard[0] [2] + "|" + gameBoard[0] [3] + "|" + gameBoard[0] [4] + "|" + gameBoard[0] [5] + "|" + gameBoard[0] [6] + "|" + gameBoard[0] [7] + "|");
			System.out.println("|    |    |    |    |    |    |    |    |");
			System.out.println("|---------------------------------------|");
			System.out.println("|    |    |    |    |    |    |    |    |");
			System.out.println("|" + gameBoard[1] [0] + "|" + gameBoard[1] [1] + "|" + gameBoard[1] [2] + "|" + gameBoard[1] [3] + "|" + gameBoard[1] [4] + "|" + gameBoard[1] [5] + "|" + gameBoard[1] [6] + "|" + gameBoard[1] [7] + "|");
			System.out.println("|    |    |    |    |    |    |    |    |");
			System.out.println("-----------------------------------------");
		}
		
		public static void gameBoardDatabase()
		{
			
			    player1Store = gameBoard[0][7];
			    player2Store = gameBoard[0][0];
			    
			    A1 = gameBoard[0][1];
			    A2 = gameBoard[0][2];
			    A3 = gameBoard[0][3];
			    A4 = gameBoard[0][4];
			    A5 = gameBoard[0][5];
			    A6 = gameBoard[0][6];
			    
			    B1 = gameBoard[1][1];
			    B2 = gameBoard[1][2];
			    B3 = gameBoard[1][3];
			    B4 = gameBoard[1][4];
			    B5 = gameBoard[1][5];
			    B6 = gameBoard[1][6];
			
		}

	}
