
package com.gla.methods.Level3;
public class CollinearPointsChecker {
    static boolean slope(int x1,int y1,int x2,int y2,int x3,int y3){
        return (y2-y1)*(x3-x2)==(y3-y2)*(x2-x1);
    }
    static boolean area(int x1,int y1,int x2,int y2,int x3,int y3){
        double a=0.5*(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2));
        return a==0;
    }
    public static void main(String[] args){
        System.out.println(slope(2,4,4,6,6,8));
        System.out.println(area(2,4,4,6,6,8));
    }
}
