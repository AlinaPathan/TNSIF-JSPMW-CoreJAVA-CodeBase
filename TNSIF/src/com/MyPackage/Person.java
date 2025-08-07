package com.MyPackage;

import java.util.*;

//to calculate tax on basis of
//1)males have tax females dont
//2)below 18 age and above 60 no tax
//0-2lakh no tax,2-5 lakh 10% tax ,5-8 lakh 20% tax ,above 8 lakh 30% tax

public class Person {
	//data //private because only accesible in person class
	
	private String name;
	private int income;
	private int age;
	private String gender;
	private int tax;
	

	
	
	//object is a super class
  //because all the memoiry adress stored in object class
	
	//object.toString---> used to access the objects
	//right click ->source->generate to string
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", income=" + income + ", age=" + age + ", gender=" + gender + ", tax=" + tax+ "]";
	}
	
	
	
	
	
	//right click ->source->declare getter and setter->select all
		public String getName() {
			return name;
		}


	public void setName(String name) {
		this.name = name;
	}


	public int getIncome() {
		return income;
	}


	public void setIncome(int income) {
		this.income = income;
	}



	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getTax() {
		return tax;
	}


	public void setTax(int tax) {
		this.tax = tax;
	}





	
	

}
