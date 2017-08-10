package com.StringCalculatorTest.tdd;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

	public static int add(String numbers) {
		int sum=0;
		List negativeNumbers= new ArrayList();
		String[] numArray= numbers.split(",|\n|//|%"); // Split the character Array basing on "," or "/n"
		System.out.println(numArray);
		/*if(numArray.length>2){
			throw new RuntimeException("Cannot add more than 2 numebrs");
		}
		else*/
		if(numbers.length()==0){
			return sum;
		}
		else{
			for (int i=0;i<numArray.length;i++){
				if(numArray[i].isEmpty() || Integer.parseInt(numArray[i])>=1000){
					continue;
				}
				else{
					if(Integer.parseInt(numArray[i])<0){
						negativeNumbers.add(numArray[i]);
					}
					else{
						sum=sum+Integer.parseInt(numArray[i]);
					}
				}
				
			}
			if(negativeNumbers.size()>0){
				throw new RuntimeException("Negative Numbers not allowed :" +negativeNumbers.toString());
			}
			return sum;
			
		}
		
	}
}
