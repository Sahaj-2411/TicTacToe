//                                      Sahaj Srivastava / X-D / 38
import java.util.Scanner;
public class Tic_Tac_Toe
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        char a = 'X';
        char b = 'O';
        System.out.println("Welcome to tic, tac, toe!");
        System.out.println("Do you wish to play? 1 for yes, 2 for no ");
        Scanner input = new Scanner(System.in);
        int play = input.nextInt();
        System.out.println("The Values Should be Betweeen 0 and 2");
        char board[][]={{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};

        if(play != 1) 
        {
            System.out.print("Invalid input! Thanks For Opening");
            System.exit(0);                                                 
        }
        obj.displayBoard(board);
        while(!(obj.isBoardFull(board) || obj.hasWon(board,a) || obj.hasWon(board,b)))
        {
            obj.makeAMove(board);
            
        }
        obj.checkBoard(board);
    }
    
    
}
