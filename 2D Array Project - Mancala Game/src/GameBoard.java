
public class GameBoard
	{

		public static void main(String[] args)
			{
				boardDisplay();
			}
		
		static String[][] GameBoard = new String [2] [8];
		
		public static void boardDisplay()
		{
			//Visual game board
			
			System.out.println("-----------------------------------------");
			System.out.println("|    |    |    |    |    |    |    |    |");
			System.out.println("|    |    |    |    |    |    |    |    |");
			System.out.println("-----------------------------------------");
			System.out.println("|    |    |    |    |    |    |    |    |");
			System.out.println("|    |    |    |    |    |    |    |    |");
			System.out.println("-----------------------------------------");
		}

	}
