package com.mycompany.xogame;
public class XoBoard extends Booard {
    protected int n_moves=0;
    public char board [][]={{'?','?','?'},{'?','?','?'},{'?','?','?'}};
    public XoBoard(){
        n=3;
    }
    @Override
    public boolean updateboard(int x,int y,char symbol){
        if(!(x<0 || x>2 || y<0 || y>2)&& (board[x][y]=='?')){
            board[x][y]=symbol;
            n_moves++;
            return true;
        }
        else return false;
    }

    @Override
    public boolean iswinner(){
        for(int i=0 ; i<3 ; i++){
            // check rows
            if(board[i][0]== board[i][1] && board[i][1]==board[i][2] && board[i][0]==board[i][2] ){
                if (board[i][0] == 'O' && board[i][1] == 'O' && board[i][2] == 'O') {
                    return true;
                }
                else if(board[i][0] == 'X' && board[i][1] == 'X' && board[i][2] == 'X') {
                    return true;
                }
                else {
                    return false;
                }

            }
            // check columns
            else if(board[0][i]== board[1][i] && board[1][i]==board[2][i] && board[0][i]==board[2][i]){
                if (board[0][i] == 'O' && board[1][i] == 'O' && board[2][i] == 'O') {
                    return true;
                }
                else if (board[0][i] == 'X' && board[1][i] == 'X' && board[2][i] == 'X') {
                    return true;
                }
                else {
                    return false;
                }
            }
            // diagonals
            else if(board[0][0]== board[1][1] && board[1][1]==board[2][2] && board[0][0]==board[2][2]){
                if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
                    return true;
                }
                else if(board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
                    return true;
                }
                else {
                    return false;
                }
            }
            else if(board[0][2]== board[1][1] && board[1][1]==board[2][0] && board[2][0]==board[0][2]){
                if (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') {
                    return true;
                }
                else if(board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') {
                    return true;
                }
                else {
                    return false;
                }
            }

        }
        return false;
    }

    @Override
    public boolean isdraw(){
        return(n_moves==9 && !iswinner());
    }

    @Override
    public void displayboard(){
        // implement display board for xo game
        for(int i=0 ; i<3 ; i++){
            System.out.print("\n| ");
            for(int j=0 ; j<3 ; j++){
                System.out.print("("+i+","+j+")");
                System.out.print(board[i][j]+" |");
            }
            System.out.print("\n---------------------------");
        }
        System.out.print("\n");
    }
}
