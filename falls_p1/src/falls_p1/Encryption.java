package falls_p1;

import java.util.Scanner;

import com.sun.tools.javac.Main;

public class Encryption {
	private String userInput2;
	public static int firstNum,secondNum,thirdNum,fourthNum;
	//get 4 ints from main
	public  void encrypt(String userInput3)
	{
		//set input variable to an instance variable
	String userInput2=userInput3;
	int  encrypt, temp;


	//get that string into an Interget to be calculated
	int num =Integer.parseInt(userInput2);

	//calculation
	firstNum = num/1000;
    secondNum = num /100 % 10;
    thirdNum = num /10 %10;
    fourthNum = num % 10;


	firstNum = (firstNum+7 )%10 ;
	secondNum = (secondNum+7)% 10;
	thirdNum = (thirdNum+7)%10;
	fourthNum = (fourthNum+7)%10;

	//swap first and third
	 encrypt = firstNum;
	firstNum = thirdNum;
	thirdNum = encrypt;
	//swap second and fourth
    temp = secondNum;
    secondNum = fourthNum;
    fourthNum = temp;
	//print output to user
	System.out.println("Your encrypted code is: "+firstNum+secondNum+thirdNum+fourthNum);



	}
}
