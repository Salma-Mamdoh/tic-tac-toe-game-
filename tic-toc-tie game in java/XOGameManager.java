package com.mycompany.xogame;
import java.util.Scanner;
public class XOGameManager extends GameManager {
    XOGameManager(){};
    @Override
    public void PlayGame(){
        XoBoard b=new XoBoard();
        System.out.print("Player 1 please enter your name : ");
        Scanner in=new Scanner(System.in);
        String p1=in.nextLine();
        System.out.print("Player 2 please enter your name : ");
        String p2=in.nextLine();
        //System.out.print(p1+"\n");
        //System.out.print(p2+"\n");
        XOPlayer player1= new XOPlayer(p1,'X');
        XOPlayer player2= new XOPlayer(p2,'O');
        b.displayboard();
        int z=1;
        boolean tie=false;
        while(z<10){
            if(z%2==1){
                player1.getmove();
                b.updateboard(player1.x,player1.y , 'X');
                if(b.iswinner()){
                    b.displayboard();
                    System.out.print(player1.name + " wins\n");
                    tie=true;
                    break;
                }
                b.displayboard();
                z++;
            }
            else{
                player2.getmove();
                b.updateboard(player2.x,player2.y , 'O');
                if(b.iswinner()){
                    b.displayboard();
                    System.out.print(player2.name + " wins\n");
                    tie=true;
                    break;
                }
                b.displayboard();
                z++;
            }

        }
        if(tie==false){
            System.out.print("Draw\n");
        }
        System.out.print("This The End of Game\n");

    }
}
