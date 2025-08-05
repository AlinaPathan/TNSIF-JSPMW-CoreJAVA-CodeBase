package com.MyPackage;

public class JumpStaements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//jump statements
		
		
		//break -execution is stopped when we use break
		for (int i=5;i<10;i++) {
			if(i==5) 
				break;
				System.out.println(i);
				System.out.println("Hello Freinds");
				//break;
			
		}
		
		
		
		//continue statements-
		for (int k=5;k<15;k++) {
			//skip odd numbers
			if(k%2 !=0 ) {
				continue;
			}
			System.out.print(k+ " ");
		}
System.out.println();
		
		
		
		//switch statements
		//example of customer care
		int userInput=8;
		switch(userInput) {
		case 1:System.out.println(userInput+ ": current plan details");
		break;
		case 2:System.out.println(userInput+ ": update plan");
		break;
		case 3:System.out.println(userInput+ ": customer support");
		break;
		case 4:System.out.println(userInput+ ": new plan overviews");
		break;
		default:
			System.out.println("repeat Everything");
		}
		
		
	}

}
