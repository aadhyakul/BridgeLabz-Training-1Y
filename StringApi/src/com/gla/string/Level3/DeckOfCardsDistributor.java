package com.gla.string.Level3;

import java.util.Scanner;
public class DeckOfCardsDistributor {
    public static void main(String[] args){
        String[] suits={"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[] deck=new String[suits.length*ranks.length];
        int k=0;
        for(String s:suits)
            for(String r:ranks)
                deck[k++]=r+" of "+s;
        for(int i=0;i<deck.length;i++){
            int rand=i+(int)(Math.random()*(deck.length-i));
            String temp=deck[i];
            deck[i]=deck[rand];
            deck[rand]=temp;
        }
        Scanner sc=new Scanner(System.in);
        int players=sc.nextInt();
        int cards=sc.nextInt();
        if(players*cards>deck.length) return;
        int index=0;
        for(int i=0;i<players;i++){
            System.out.println("Player "+(i+1));
            for(int j=0;j<cards;j++)
                System.out.println(deck[index++]);
        }
    }
}