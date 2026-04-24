package com.gla.regex;
import java.util.*;
public class Q3_HexColor{
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
System.out.println(s.matches("^#[0-9a-fA-F]{6}$")?"Valid":"Invalid");
}}