
package com.gla.methods.Level3;
public class FactorArrayOperations {
    static int[] factors(int n){
        int c=0;
        for(int i=1;i<=n;i++) if(n%i==0)c++;
        int[] a=new int[c]; int j=0;
        for(int i=1;i<=n;i++) if(n%i==0)a[j++]=i;
        return a;
    }
    static int max(int[] a){ int m=a[0]; for(int x:a) if(x>m)m=x; return m; }
    static int sum(int[] a){ int s=0; for(int x:a)s+=x; return s; }
    static double cubeProduct(int[] a){
        double p=1;
        for(int x:a) p*=Math.pow(x,3);
        return p;
    }
    public static void main(String[] args){
        int[] f=factors(6);
        System.out.println(max(f));
        System.out.println(sum(f));
        System.out.println(cubeProduct(f));
    }
}
