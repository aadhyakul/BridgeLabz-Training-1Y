package com.gla.regex;
import java.util.*;
public class Q10_IPValidate{
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
String ip=sc.nextLine();
String r="^((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)$";
System.out.println(ip.matches(r)?"Valid":"Invalid");
}}