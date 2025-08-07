package com.MyPackage;

public class TaxCalculater {
	
//function to calculate tax
	public void calculateTax(Person person) {
		//can access all the variables of person class
		//.equals method compare the askii value but .equalsIgnoreCase
		
		if(person.getAge()>65|| person.getGender().equalsIgnoreCase("Female")) {
			person.setTax(0);
			System.out.println("Tax not applicable");
		
		}else {
			if(person.getIncome()<=160000) {
				person.setTax(0);
				System.out.println("No tax applicable");
			}else if(person.getIncome()>160000 && person.getIncome()<500000) {
				person.setTax((person.getIncome()-160000)*10/100);
				System.out.println(person.getTax());
				
			}else if(person.getIncome()>500000 && person.getIncome()<800000) {
				person.setTax((person.getIncome()-160000)*20/100+34000);
				System.out.println(person.getTax());

			}else if(person.getIncome()>800000){
				person.setTax((person.getIncome()-160000)*60/100+94000)
				
			}
				
				
		}
		
		
		
	}

}
