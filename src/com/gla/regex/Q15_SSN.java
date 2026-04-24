package com.gla.regex;
import java.util.*;
public class Q15_SSN{
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
System.out.println(s.matches("^\\d{3}-\\d{2}-\\d{4}$")?"Valid":"Invalid");
}}