
package com.gla.methods.Level3;
public class EuclideanDistanceAndLine {
    static double distance(double x1,double y1,double x2,double y2){
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }
    static double[] line(double x1,double y1,double x2,double y2){
        double m=(y2-y1)/(x2-x1);
        double b=y1-m*x1;
        return new double[]{m,b};
    }
    public static void main(String[] args){
        double[] l=line(1,2,3,4);
        System.out.println(distance(1,2,3,4));
        System.out.println(l[0]+" "+l[1]);
    }
}
