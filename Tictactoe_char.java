import java.util.Scanner;

public class Tictactoe_char {
    public static void main(String[] args) {
      char[] board={'1','2','3','4','5','6','7','8','9'};

        int j = 0;
        while (j < 9) {
            System.out.println(board[j] + "\t" + board[j + 1] + "\t" + board[j + 2]);
            j += 3;
        }


        for (int i = 0; i < 9; i++) {
            if ((i + 1) % 2 == 1) {
                System.out.println("Player 'x' turn(player1)");
                Scanner scan = new Scanner(System.in);
                System.out.println("Choose region where you want to put x:");
                char region= scan.next().charAt(0);
                for (int x = 0; x < 9; x++) {
                    if (board[x] == region) {
                        board[x] = 'x';
                        for (int k = 0; k < 9; k += 3) {
                            System.out.println(board[k] + "\t" + board[k + 1] + "\t" + board[k + 2]);

                        }
                        if(((board[0]=='x')&&(board[1]=='x')&&(board[2]=='x'))||((board[3]=='x')&&(board[4]=='x')&&(board[5]=='x'))||((board[6]=='x')&&(board[7]=='x')&&(board[8]=='x')))
                        { System.out.println("Player X won!");
                            i=10; }
                        else if (((board[0]=='x')&&(board[3]=='x')&&(board[6]=='x'))||((board[1]=='x')&&(board[4]=='x')&&(board[7]=='x'))||((board[2]=='x')&&(board[5]=='x')&&(board[8]=='x')))
                        { System.out.println("Player X won!");
                            i=10; }
                        else if (((board[0]=='x')&&(board[4]=='x')&&(board[8]=='x'))||((board[2]=='x')&&(board[4]=='x')&&(board[6]=='x')))
                        { System.out.println("Player X won!");
                            i=10;}
                        else if(((board[0]=='o')&&(board[1]=='o')&&(board[2]=='o'))||((board[3]=='o')&&(board[4]=='o')&&(board[5]=='o'))||((board[6]=='o')&&(board[7]=='o')&&(board[8]=='o')))
                        { System.out.println("Player O won!");
                            i=10; }
                        else if (((board[0]=='o')&&(board[3]=='o')&&(board[6]=='o'))||((board[1]=='o')&&(board[4]=='o')&&(board[7]=='o'))||((board[2]=='o')&&(board[5]=='o')&&(board[8]=='o')))
                        {System.out.println("Player O won!");
                            i=10; }
                        else if (((board[0]=='o')&&(board[4]=='o')&&(board[8]=='o'))||((board[2]=='o')&&(board[4]=='o')&&(board[6]=='o')))
                        {  System.out.println("Player O won!");
                            i=10;}


                    }
                }


            } else {
                if ((i + 1) % 2 == 0) {
                    System.out.println("Player 'o' turn(player2)");
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Choose region where you want to put o:");
                    char region2= scan.next().charAt(0);
                    for (int x = 0; x < 9; x++) {
                        if (board[x] == region2) {
                            board[x] = 'o';
                            for (int k = 0; k < 9; k += 3) {
                                System.out.println(board[k] + "\t" + board[k + 1] + "\t" + board[k + 2]);

                            }
                            if(((board[0]=='x')&&(board[1]=='x')&&(board[2]=='x'))||((board[3]=='x')&&(board[4]=='x')&&(board[5]=='x'))||((board[6]=='x')&&(board[7]=='x')&&(board[8]=='x')))
                            { System.out.println("Player X won!");
                                i=10; }
                            else if (((board[0]=='x')&&(board[3]=='x')&&(board[6]=='x'))||((board[1]=='x')&&(board[4]=='x')&&(board[7]=='x'))||((board[2]=='x')&&(board[5]=='x')&&(board[8]=='x')))
                            { System.out.println("Player X won!");
                                i=10; }
                            else if (((board[0]=='x')&&(board[4]=='x')&&(board[8]=='x'))||((board[2]=='x')&&(board[4]=='x')&&(board[6]=='x')))
                            { System.out.println("Player X won!");
                                i=10;}
                            else if(((board[0]=='o')&&(board[1]=='o')&&(board[2]=='o'))||((board[3]=='o')&&(board[4]=='o')&&(board[5]=='o'))||((board[6]=='o')&&(board[7]=='o')&&(board[8]=='o')))
                            { System.out.println("Player O won!");
                                i=10; }
                            else if (((board[0]=='o')&&(board[3]=='o')&&(board[6]=='o'))||((board[1]=='o')&&(board[4]=='o')&&(board[7]=='o'))||((board[2]=='o')&&(board[5]=='o')&&(board[8]=='o')))
                            {System.out.println("Player O won!");
                                i=10; }
                            else if (((board[0]=='o')&&(board[4]=='o')&&(board[8]=='o'))||((board[2]=='o')&&(board[4]=='o')&&(board[6]=='o')))
                            {  System.out.println("Player O won!");
                                i=10;}

                        }
                    }

                }
            }
            if ((i>7)&&(i<9))
                System.out.println("Draw!");
        }





    }
}
