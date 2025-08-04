package com.MyPackage;

public class controlStatements {
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
		
		//nested if else
		int pass=12345;
		String email="alinapathan@gmail.com";
		
		if(pass==12345) {
			
			if(email=="alinapathan@gmail.com") {
				
				System.out.println("email and password both are correct");
				
			}else {
				
				System.out.println("Password is correct but email is wrong");
				
			}
			
		}else {
			
			if(email=="alinapathan@gmail.com") {
				
				System.out.println("email is correct and password is wrong");
				
			}else {
		
					System.out.println("email and password both are wrong");
				
			}
		}
 }

}
