package com.gla.regex;
import java.util.*;import java.util.regex.*;
public class Q12_Languages{
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
String t=sc.nextLine();
Matcher m=Pattern.compile("Java|Python|JavaScript|Go").matcher(t);
while(m.find()) System.out.println(m.group());
}}