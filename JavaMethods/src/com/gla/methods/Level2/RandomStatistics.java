
package com.gla.methods.Level2;
public class RandomStatistics {
    static int[] generate(int n){
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=(int)(Math.random()*9000)+1000;
        return a;
    }
    static double[] stats(int[] a){
        int min=a[0],max=a[0],sum=0;
        for(int x:a){ min=Math.min(min,x); max=Math.max(max,x); sum+=x; }
        return new double[]{(double)sum/a.length,min,max};
    }
    public static void main(String[] args){
        int[] a=generate(5);
        double[] r=stats(a);
        System.out.println(r[0]+" "+r[1]+" "+r[2]);
    }
}
