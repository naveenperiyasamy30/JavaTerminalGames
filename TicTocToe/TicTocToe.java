import java.util.Scanner;

public class TicTocToe {

    private static char[][] board;
    private static int size;
    private static char player;
    
    TicTocToe(int n){
        size=n;
        board = new char[n][n];
        InitializeBoard();
        player='X';
    }

    public void InitializeBoard(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                board[i][j]='-';
            }
        }
    }

    public void printBoard(){
        System.out.println();
         for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    private boolean makeMove(int row, int col){
        if(row >= 0 && row <= size && col >= 0 && col <= size && board[row][col]=='-'){
            board[row][col] = player;
            return true;
        }
        
        return false;
    }


     private boolean checkWin(){

        
        for(int i=0;i<size;i++){
            boolean rowCheck=true;
            for(int j=0;j<size;j++){
                if(board[i][j]!=player){
                    rowCheck=false; break;
                }
            }

            if(rowCheck) return true;
        }
        
       
        for(int j=0;j<size;j++){
            boolean colCheck=true;
            for(int i=0;i<size;i++){
                if(board[i][j]!=player){
                    colCheck=false;
                }
            }
             if(colCheck) return true;
        }


        boolean diagCheck=true;
        for(int i=0;i<size;i++){
           if(board[i][i]!=player){
            diagCheck=false;
           }
        }
        if(diagCheck) return true;

       
         boolean aDiagCheck=true;
        for(int i=0;i<size;i++){
            if(board[i][size-i-1]!=player){
                aDiagCheck=false;
            }
        }
        if(aDiagCheck) return true;



        return false;
    }

    boolean isBoardFull(){
        for(int i=0;i<size;i++){
            for(int j=0; j<size; j++){
                if(board[i][j] == '-'){
                    return false;
                }
            }
          
        }
        return true;
    }

    void swithPlayer(){
     player = (player == 'X') ? 'O' : 'X';
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the board size n x n : ");
        int n=scan.nextInt();

        TicTocToe game = new TicTocToe(n);
       

        while(true){
            game.printBoard();
            System.out.println("Player (" +game.player+ ") : Enter the Row and Column: ");
            int row = scan.nextInt();
            int col = scan.nextInt();
            
            if(!game.makeMove(row, col)){
                System.out.println("Invalid Move. Try again !");
                continue;
            }

            if(game.checkWin()){
                game.printBoard();
                System.out.println("Player"+game.player+". Wins!");
                break;
            }

            if(game.isBoardFull()){
                System.out.println("It's a draw!");
                break;
            }

            game.swithPlayer();

        }
       
        
    }

   
}
