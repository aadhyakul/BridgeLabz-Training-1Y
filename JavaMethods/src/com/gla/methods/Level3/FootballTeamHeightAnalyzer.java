
package com.gla.methods.Level3;
public class FootballTeamHeightAnalyzer {
    static int[] heights(){
        int[] h=new int[11];
        for(int i=0;i<11;i++) h[i]=(int)(Math.random()*101)+150;
        return h;
    }
    static int sum(int[] a){ int s=0; for(int x:a)s+=x; return s; }
    static int min(int[] a){ int m=a[0]; for(int x:a) if(x<m)m=x; return m; }
    static int max(int[] a){ int m=a[0]; for(int x:a) if(x>m)m=x; return m; }
    public static void main(String[] args){
        int[] h=heights();
        System.out.println(min(h));
        System.out.println(max(h));
        System.out.println((double)sum(h)/h.length);
    }
}
