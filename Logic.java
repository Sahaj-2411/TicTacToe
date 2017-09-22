import java.util.Scanner;
class Logic
{
    public static char[][] makeAMove(char board[][])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Row And Column for Player 1");
        int row = s.nextInt();
        int column = s.nextInt();
        // What if the Spot given is same
        while(!(isSpotEmpty(board,row,column)))
        {
            System.out.println("The Spot is already filled.\nRe-Enter The Row And Column for Player 1");
            row = s.nextInt();
            column = s.nextInt();
        }
        board[row][column] = 'X';
        displayBoard(board);
        checkBoard(board);
        
        // Player 2
       
       System.out.println("Enter The Row And Column for Player 2");
       int row1 = s.nextInt();
       int column1 = s.nextInt();
        // What if the Spot given is same
        while(!(isSpotEmpty(board,row1,column1)))
        {
            System.out.println("The Spot is already filled.\nRe-Enter The Row And Column for Player 2");
            row1 = s.nextInt();
            column1 = s.nextInt();
        }
        board[row1][column1] = 'O';
        displayBoard(board);
        checkBoard(board);
        return board;
    }
    
    public static boolean isBoardFull(char board[][])
    {
        for(int i = 0;i<=2;i++)
        {
            for(int j = 0;j<=2;j++)
            {
                if(!((board[i][j]== 'X')||(board[i][j]== 'O')))
                {
                    return false;
                }
            }
        }
        return true;
    }
    
     public static void displayBoard(char[][] board)
     {
        // loop for each row
       
        System.out.println(board[0][0] + " | " + board[0][1] + " | " + board[0][2] + "\n---------");
        System.out.println(board[1][0] + " | " + board[1][1] + " | " + board[1][2] + "\n---------");
        System.out.println(board[2][0] + " | " + board[2][1] + " | " + board[2][2] + "\n");

    } // end display board method
    
    public static boolean hasWon(char[][] board, char player) {

        // Check if the player has won by checking winning conditions.
        if (board[0][0] == player && board[0][1] == player && board[0][2] == player || // 1st row
        board[1][0] == player && board[1][1] == player && board[1][2] == player || // 2nd row
        board[2][0] == player && board[2][1] == player && board[2][2] == player || // 3rd row
        board[0][0] == player && board[1][0] == player && board[2][0] == player || // 1st col.
        board[0][1] == player && board[1][1] == player && board[2][1] == player || // 2nd col.
        board[0][2] == player && board[1][2] == player && board[2][2] == player || // 3rd col.
        board[0][0] == player && board[1][1] == player && board[2][2] == player || // Diagonal           
        board[2][0] == player && board[1][1] == player && board[0][2] == player) //   Diagonal      

            return true;

        else {

            return false;
        }

    } // end hasWon method

    public static void checkBoard(char[][] board)
    {
        //This method checks the board for continuation of game.
        char a = 'X';
        char b = '0';
        if(hasWon(board,a))
        {
        System.out.println("Player 1 Has Won");
        System.exit(0);
        }
        
        if(hasWon(board,b))
        {
        System.out.println("Player 2 Has Won");
        System.exit(0);
        }
        
        if(isBoardFull(board))
        {
        System.out.println("The Game is Tied");
        System.exit(0);
        }   
        
    }
    public static boolean isSpotEmpty(char[][] board,int a,int b)
    {
        if(board[a][b]==' ')
        
            return true;
        
        else
            return false;
    }
}