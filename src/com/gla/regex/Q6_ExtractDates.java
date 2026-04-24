package com.gla.regex;
import java.util.*;import java.util.regex.*;
public class Q6_ExtractDates{
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
String t=sc.nextLine();
Matcher m=Pattern.compile("\\b\\d{2}/\\d{2}/\\d{4}\\b").matcher(t);
while(m.find()) System.out.println(m.group());
}}