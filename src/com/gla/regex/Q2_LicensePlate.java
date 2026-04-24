package com.gla.regex;
import java.util.*;
public class Q2_LicensePlate{
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
System.out.println(s.matches("^[A-Z]{2}[0-9]{4}$")?"Valid":"Invalid");
}}