package com.StringCalculatorTest.tdd;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

	/*  add method calculates the sum of all numbers in string which are less than 1000 , excludes negative numbers.
	*Input: numbers in String format
	*Output: Sum of numbers present in string 
	*/
	public static int add(String numbers) {
		int sum=0;
		int numArrayValue=0;
		String[] numArray = null;
		List<String> negativeNumbers= new ArrayList<String>();
		if(numbers!=null){
			numArray= numbers.split(",|\n|//|%"); // Split the character Array basing on "," or "/n"	
		}
		
		System.out.println(numArray);
		/*if(numArray.length>2){
			throw new RuntimeException("Cannot add more than 2 numebrs");
		}
		else*/
	
		if(numbers!=null && numbers.length()==0){
			return sum;
		}
		else{
			
			for (int i=0;i<numArray.length;i++){
				
				if(numArray[i].isEmpty() || Integer.parseInt(numArray[i])>=1000){
					continue;
				}
				else{
					numArrayValue=Integer.parseInt(numArray[i]);
					if(numArrayValue<0){
						negativeNumbers.add(numArray[i]);
					}
					else{
						sum=sum+numArrayValue;
					}
				}
				
			}
			if(negativeNumbers.size()>0){
				throw new RuntimeException("Negative Numbers not allowed :" +negativeNumbers);
			}
			return sum;
			
		}
		
	}
}
