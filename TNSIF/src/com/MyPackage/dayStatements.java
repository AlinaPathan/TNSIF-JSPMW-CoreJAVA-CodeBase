package com.MyPackage;

public class dayStatements {
 public static void main(String[] args) {
		int age= 26;
		if (age>=18) {
			System.out.println("Congratulations!!! you can vote now");
		}else {
			System.out.println("Sorry!!! you cant vote");
		}

		
		
		int a=10,b=12,c=14;
		if(a>b) {
			if(a>c) {
				System.out.println("a is grater");
			}else {
				System.out.println("c is greater");
			}
		}else {
			if(b>c) {
				System.out.println("b is grater");
			}else {
				System.out.println("c is greater");
			}
		}
 }

}
