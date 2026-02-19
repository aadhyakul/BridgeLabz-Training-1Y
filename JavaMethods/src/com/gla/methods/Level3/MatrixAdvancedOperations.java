
package com.gla.methods.Level3;
public class MatrixAdvancedOperations {
    static int[][] random(int n){
        int[][] a=new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                a[i][j]=(int)(Math.random()*10);
        return a;
    }
    static int det2(int[][] m){ return m[0][0]*m[1][1]-m[0][1]*m[1][0]; }
    static int[][] transpose(int[][] a){
        int[][] t=new int[a.length][a.length];
        for(int i=0;i<a.length;i++)
            for(int j=0;j<a.length;j++)
                t[j][i]=a[i][j];
        return t;
    }
    public static void main(String[] args){
        int[][] m=random(2);
        System.out.println(det2(m));
    }
}
