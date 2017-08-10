package com.StringCalculatorTest.tdd;

public class StringCalculator {

	public static int add(String numbers) {
		int sum=0;
		String[] numArray= numbers.split(","); // String is converted to character Array
		if(numArray.length>2){
			throw new RuntimeException("Cannot add more than 2 numebrs");
		}
		else if(numbers.length()==0){
			return sum;
		}
		else{
			for (int i=0;i<numArray.length;i++){
				
				 sum=sum+Integer.parseInt(numArray[i]);
			}
			return sum;
		}
		
	}
}
