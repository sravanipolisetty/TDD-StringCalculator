package com.StringCalculatorTest.tdd;

public class StringCalculator {

	public static int add(String numbers) {
		int sum=0;
		int negativeSum=0;
		int totalNegativeNumbers=0;
		String[] numArray= numbers.split(",|\n|//"); // Split the character Array basing on "," or "/n"
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
				if(numArray[i].isEmpty()){
					continue;
				}
				else if(Integer.parseInt(numArray[i])<0){
					totalNegativeNumbers++;
					negativeSum=negativeSum+Integer.parseInt(numArray[i]);
				}
				else{
					sum=sum+Integer.parseInt(numArray[i]);
				}
			}
			if(totalNegativeNumbers/2==0){
				return sum=sum+negativeSum;
			}
			else{
				throw new RuntimeException("Negatives are not allowed");
			}
			
		}
		
	}
}
