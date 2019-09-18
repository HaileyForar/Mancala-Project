
public class GameBoard
	{

		public static void main(String[] args)
			{
				boardDisplay();
				gameBoardDatabase();
			}
		
		static String[][] gameBoard = new String [2] [8];
		
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
			
		}

	}
