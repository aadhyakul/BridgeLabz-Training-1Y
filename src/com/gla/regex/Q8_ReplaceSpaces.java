package com.gla.regex;
import java.util.*;
public class Q8_ReplaceSpaces{
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
System.out.println(s.replaceAll("\\s+"," "));
}}