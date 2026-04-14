package com.gla.collections.Scenario;
import java.util.*;

class GameScore implements Comparable<GameScore>{
    String name; int score;

    GameScore(String n,int s){ name=n; score=s; }

    public int compareTo(GameScore o){
        return o.score - this.score;
    }

    public String toString(){
        return name+":"+score;
    }
}

public class GamingTournamentTrackerProgram {
    public static void main(String[] args) {

        TreeSet<GameScore> leaderboard = new TreeSet<>();
        leaderboard.add(new GameScore("A",10));
        leaderboard.add(new GameScore("B",20));

        System.out.println(leaderboard);
    }
}