package com.gla.generics;
public class Pair<T,U> {
    private T first;
    private U second;

    public Pair(T first, U second){
        this.first = first;
        this.second = second;
    }

    public T getFirst(){ return first; }
    public U getSecond(){ return second; }

    public static void main(String[] args) {
        Pair<String,Integer> p = new Pair<>("Amol",20);
        System.out.println(p.getFirst()+" "+p.getSecond());
    }
}
