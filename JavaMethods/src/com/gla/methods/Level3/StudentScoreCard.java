
package com.gla.methods.Level3;
public class StudentScoreCard {
    static int[][] scores(int n){
        int[][] a=new int[n][3];
        for(int i=0;i<n;i++)
            for(int j=0;j<3;j++)
                a[i][j]=(int)(Math.random()*51)+50;
        return a;
    }
    static double[][] result(int[][] a){
        double[][] r=new double[a.length][3];
        for(int i=0;i<a.length;i++){
            int t=a[i][0]+a[i][1]+a[i][2];
            r[i][0]=t;
            r[i][1]=Math.round((t/3.0)*100)/100.0;
            r[i][2]=Math.round((t/300.0)*10000)/100.0;
        }
        return r;
    }
    public static void main(String[] args){
        int[][] s=scores(5);
        double[][] r=result(s);
        System.out.println(r.length);
    }
}
