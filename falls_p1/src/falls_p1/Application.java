package falls_p1;


import java.util.Scanner; //Needed for Scanner class







public class Application {
	public int userInput;
	public static int firstNum,secondNum,thirdNum,fourthNum;
	public static void main(String[] args)  {


		//get numbers from user
		System.out.println("Enter four integers: ");
		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine();





		//find out if the user wants to encrypt or decrypt
		System.out.println("Would you like to (1)encrypt the integer or (2)decrypt?");
		Scanner choice = new Scanner(System.in);
			int deOrEn = choice.nextInt();


			//based on the user's choice, it will get passed to another class here.
			if (deOrEn==1) {

				Encryption Encrypter = new Encryption();
			    Encrypter.encrypt(userInput);



			}

			if (deOrEn==2) {

				Decryption Decrypter = new Decryption();
			    Decrypter.decrypt(userInput);


			}


	      }

}

