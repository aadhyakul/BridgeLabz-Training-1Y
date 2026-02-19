package com.gla.string.Level2;

import java.util.Scanner;
public class RockPaperScissorsGame {
    public static String computer(){
        int r=(int)(Math.random()*3);
        if(r==0) return "rock";
        if(r==1) return "paper";
        return "scissors";
    }
    public static String winner(String u,String c){
        if(u.equals(c)) return "Draw";
        if(u.equals("rock")&&c.equals("scissors")||
                u.equals("paper")&&c.equals("rock")||
                u.equals("scissors")&&c.equals("paper"))
            return "User";
        return "Computer";
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int games=sc.nextInt();
        int u=0,c=0;
        for(int i=0;i<games;i++){
            String user=sc.next();
            String comp=computer();
            String w=winner(user,comp);
            if(w.equals("User")) u++;
            else if(w.equals("Computer")) c++;
        }
        System.out.println("UserWins: "+u);
        System.out.println("ComputerWins: "+c);
    }
}