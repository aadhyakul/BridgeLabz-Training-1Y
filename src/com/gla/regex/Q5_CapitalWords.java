package com.gla.regex;
import java.util.*;import java.util.regex.*;
public class Q5_CapitalWords{
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
String t=sc.nextLine();
Matcher m=Pattern.compile("\\b[A-Z][a-z]*\\b").matcher(t);
while(m.find()) System.out.println(m.group());
}}