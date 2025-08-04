package com.MyPackage;

//type casting


public class MySecondProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //implicit-widening
		
		byte b=10;
		int i=b;
		
		
		float f=22.14f;
		double d=f;
		System.out.println(d);
		
		char c='A';
		int a=c;
		System.out.println(a);
		
		
		//explicite type casting
		
		double f1=10.4245f;
		long ll=(long)f1;
		System.out.println(ll);
		
		int i2=130;
		byte b1=(byte)i2;
		System.out.println(b1);//loop over range of byte -128 to 127
				
		
		
		
	}

}
