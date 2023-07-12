package com.mycompany.xogame;
public class Booard {
    protected int n;
    protected char [][]grid=new char [n][n];
    public Booard(){}
    public Booard(int size){
        n=size;
        //System.out.print("we are in the constructor now ");
    }

    public boolean updateboard(int x,int y,char symbol){
        return false;
    }

    public boolean iswinner(){
        return false;
    }
    public boolean isdraw(){
        return false;
    }
    public void displayboard(){
    }

}
