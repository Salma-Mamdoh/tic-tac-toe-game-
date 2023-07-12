package com.mycompany.xogame;
public class Main {
    public static void main(String []args){
        //System.out.print("hallo in main function");
        //Booard obj=new Booard();
        //obj.n=3;
        //System.out.print(obj.n);
        //XoBoard obj2=new XoBoard();
        //obj2.n=12;
        //System.out.print(obj.n);
        //obj2.displayboard();
        // Player p=new Player("salma",'x');
        // System.out.print(p.getname());
        // XOPlayer p2=new XOPlayer();
        //p2.getmove();
        XOGameManager m1=new XOGameManager();
        m1.PlayGame();
    }
}
