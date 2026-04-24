package com.gla.regex;
import java.util.*;
public class Q1_ValidateUsername{
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
System.out.println(s.matches("^[A-Za-z][A-Za-z0-9_]{4,14}$")?"Valid":"Invalid");
}}