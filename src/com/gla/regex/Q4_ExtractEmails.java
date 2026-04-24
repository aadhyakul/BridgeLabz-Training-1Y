package com.gla.regex;
import java.util.*;import java.util.regex.*;
public class Q4_ExtractEmails{
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
String t=sc.nextLine();
Matcher m=Pattern.compile("[\w.-]+@[\w.-]+").matcher(t);
while(m.find()) System.out.println(m.group());
}}