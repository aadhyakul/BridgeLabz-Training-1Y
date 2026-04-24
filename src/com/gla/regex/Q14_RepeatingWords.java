package com.gla.regex;
import java.util.*;import java.util.regex.*;
public class Q14_RepeatingWords{
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
String t=sc.nextLine();
Matcher m=Pattern.compile("\\b(\\w+)\\s+\\1\\b").matcher(t);
while(m.find()) System.out.println(m.group(1));
}}