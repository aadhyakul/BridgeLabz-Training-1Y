package com.gla.regex;
import java.util.*;
public class Q9_CensorWords{
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
System.out.println(s.replaceAll("damn|stupid","****"));
}}