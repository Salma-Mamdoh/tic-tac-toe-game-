package com.mycompany.xogame;
import java.util.Scanner;
public class XOPlayer extends Player {
    public int x;
    public int y;
    XOPlayer(){};
    XOPlayer(String name,char symbol ){
        this.name=name;
        this.symbol=symbol;
    }
    @Override
    public void getmove(){
        Scanner in=new Scanner(System.in);
        System.out.print("Please enter your move x and y (0 to 2) separated by spaces: ");
        x=in.nextInt();
        y=in.nextInt();
        //System.out.print(x + y );
    }
    @Override
    public char getsymbol(){
        return symbol;
    }

    @Override
    public String getname(){
        return name;
    }
}
