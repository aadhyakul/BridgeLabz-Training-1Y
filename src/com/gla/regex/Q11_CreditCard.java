package com.gla.regex;
import java.util.*;
public class Q11_CreditCard{
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
System.out.println(s.matches("^[45]\\d{15}$")?"Valid":"Invalid");
}}