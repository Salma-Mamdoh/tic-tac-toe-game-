package com.mycompany.xogame;

public class Player {
    protected String name;
    protected char symbol;
    public Player(){};
    Player(String name,char symbol ){
        this.name=name;
        this.symbol=symbol;
    }
    public void getmove(){};
    public char getsymbol(){
        return 0;
    }
    public String getname(){
        return "";
    }
}
