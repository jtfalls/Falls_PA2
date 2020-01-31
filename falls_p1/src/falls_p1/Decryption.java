

package falls_p1;
//package cryptographyPKG;

import java.lang.*;
public class Decryption {

	public int firstNum,secondNum,thirdNum,fourthNum;

	private String inputUser4;


	public  void decrypt(String userInput3) {


		//set input variable to an instance variable
		String userInput4=userInput3;

		 int  temp;
		//put string into integers
		int num =Integer.parseInt(userInput4);



		//calculation
		 firstNum = num / 1000;
	     secondNum = num / 100 % 10;
	     thirdNum = num / 10 % 10;
	     fourthNum = num% 10;

	     if(firstNum <= 6 && firstNum >= 0)
	            firstNum = firstNum + 10;

	     if(secondNum <= 6 && secondNum >= 0)
	            secondNum = secondNum + 10;

	        if(thirdNum <= 6 && thirdNum >= 0)
	            thirdNum = thirdNum + 10;

	        if(fourthNum <= 6 && fourthNum >= 0)
	            fourthNum = fourthNum + 10;


	        firstNum = firstNum - 7;

	        secondNum = secondNum - 7;

	        thirdNum = thirdNum - 7;

	        fourthNum = fourthNum - 7;

	        //swap the numbers
	        temp = firstNum;
	        firstNum = thirdNum;
	        thirdNum = temp;
	        temp = secondNum;
	        secondNum = fourthNum;
	        fourthNum = temp;


	        //print to the user


	        System.out.println("Your decrypted codes is: "+firstNum+secondNum+thirdNum+fourthNum);


	}

}