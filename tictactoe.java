import java.util.*;
import java.util.Scanner;

public class tictactoe 
{
	
	public static main void (String [] args)
	{
		char[][] grid= new char[3][3];
		
		for (int k = 0; k < 3; k++)
		{
			for(int i = 0; i < 3; i++)
			{
				grid[k][i] = "-";
			}
		}
		Scanner nm = new Scanner (System.nm);
		System.out.println ("Player 1. Please enter your name");
		System.out.println ("Player 2. Please enter you name");
		String p1 = nm.nextLine();
		String p2 = nm.nextLine();
		
		boolean player1 = true;
		boolean player2 = false;

		
		boolean gameEnded = false;
		while(!gameEnded) 
		{
			draw(grid);

			
			if(player1) 
			{
				System.out.println(p1 + "'s Turn (x):");
			} else 
			{
				System.out.println(p2 + "'s Turn (o):");
			}

			
			char c = '-';
			if(player1) 
			{
				c = 'x';
			} else 
			{
				c = 'o';
			}

			
			int row = 0;
			int col = 0;

			
			while(player1) 
			{
				
				//ask where to place symbol
				System.out.print("Enter a row number (0, 1, or 2): ");
				row = in.nextInt();
				System.out.print("Enter a column number (0, 1, or 2): ");
				col = in.nextInt();

				//out of bounds
				if(row < 0 || col < 0 || row > 2 || col > 2) {
					System.out.println("you cannot play this position");
				
				//Check if the position on the grid the user entered is empty (has a -) or not
				} 
				else if(grid[row][col] != '-') 
				
				{
					System.out.println("someone already played this position.");
				
				
				} 
				else 
				{
					break;
				}
			
			}

			
			grid[row][col] = c;

			//winner
			if(playerHasWon(grid) == 'x') 
			{
				System.out.println(p1 + " wins!!!");
				gameEnded = true;
			} else if(playerHasWon(grid) == 'o') 
			{
				System.out.println(p2 + " wins!!!");
				gameEnded = true;
			} else 
			{

				//tie
				if(boardIsFull(grid)) 
				{
					System.out.println("Tie.");
					gameEnded = true;
				} else 
				{
					//turn change
					player1 = !player1;
				}

			}
		}
		draw(grid);

  }
	public static void draw(char[][] grid) 
	{
		System.out.println("grid:");
		for(int i = 0; i < 3; i++) 
		{
			for(int j = 0; j < 3; j++) 
			{
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}
	}

	//check winner
	public static char playerHasWon(char[][] grid) 
	{
		
		//Check rows
		for(int i = 0; i < 3; i++) {
			if(grid[i][0] == grid[i][1] && grid[i][1] == grid[i][2] && grid[i][0] != '-') 
			{
				return grid[i][0];
			}
		}

		//Check columns
		for(int j = 0; j < 3; j++) 
		{
			if(grid[0][j] == grid[1][j] && grid[1][j] == grid[2][j] && grid[0][j] != '-') 
			{
				return grid[0][j];
			}
		}

		//Check diagonals
		if(grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2] && grid[0][0] != '-') 
		{
			return grid[0][0];
		}
		if(grid[2][0] == grid[1][1] && grid[1][1] ==  grid[0][2] && grid[2][0] != '-') 
		{
			return grid[2][0];
		}

		//Otherwise nobody has not won yet
		return ' ';

	}

	//check if grid is full
	public static boolean gridfull(char[][] grid) 
	{
		for(int i = 0; i < 3; i++) 
		{
			for(int j = 0; j < 3; j++) 
			{
				if(grid[i][j] == '-') 
				{
					return false;
				}
			}
		}
		return true;
	}
}
		
		
	