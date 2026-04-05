package com.gla.wrapperClass.level2;

public class Q8_GameScoreboard {
    public static void main(String[] args) {
        Integer[] scores = {120, null, 85, null, 200, 95, null};
        int notPlayed = 0;
        int totalScore = 0;
        for (Integer score : scores) {
            if (score == null) {
                notPlayed++;
            } else {
                totalScore += score;
            }
        }
        System.out.println("Players who haven't played: " + notPlayed);
        System.out.println("Total of valid scores: " + totalScore);
    }
}
