
package com.gla.methods.Level3;
public class PerfectAbundantDeficientStrong {
    static int sumDiv(int n){
        int s=0;
        for(int i=1;i<n;i++) if(n%i==0) s+=i;
        return s;
    }
    static boolean isStrong(int n){
        int t=n,sum=0;
        while(t>0){
            int d=t%10,f=1;
            for(int i=1;i<=d;i++) f*=i;
            sum+=f;
            t/=10;
        }
        return sum==n;
    }
    public static void main(String[] args){
        int n=145;
        int s=sumDiv(n);
        System.out.println(s==n);
        System.out.println(s>n);
        System.out.println(s<n);
        System.out.println(isStrong(n));
    }
}
