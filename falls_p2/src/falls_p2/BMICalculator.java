package falls_p2;

import java.util.Scanner;

public class BMICalculator {
	//make something to be passed between methods in the same class
	private int passed,passedChoice;
	private double finalprint,kilo,weight,checkCategory,inches,centi,realKilo,realWeight,realInches,realCenti,realFeet,feet;
	
	public void readUserData() {

		readUnitType();

		readMeasurementData();

	}
	public void calculateBmi() {


		if (passedChoice==1) {
			double totalInches = feet * 12 + inches;


			 double bmi = weight * 703 /Math.pow(totalInches, 2);

			 finalprint=bmi;
			 checkCategory = finalprint;
			 calculateBmiCategory();




			}


		if (passedChoice==2) {
				double meters = centi/100;

				meters = meters*meters;

				double  bmi1 = kilo/meters;


				finalprint = bmi1;

				checkCategory=finalprint;
				calculateBmiCategory();

		}
	}




	public void displayBmi() {

	System.out.printf("The BMI = %.2f ",finalprint);


	}





	private void readUnitType() {
		System.out.println("Which BMI calculator would you like to use?\n");
		System.out.println("\t1.\tImperial");
		System.out.println("\t2.\tMetric");

		//get user input
		Scanner sd = new Scanner(System.in);
		int choice = sd.nextInt();
		//give the choice to the next method
		passed= choice;




	}

private void readMeasurementData() {



	if (passed==1) {

		readImperialData();
		//give choice to the next method CalculateBMI
		passedChoice=passed;

	}
		else if (passed==2) {
			//get height from user
		readMetricData();
		passedChoice=passed;
		}




	}


private void readImperialData() {


	System.out.println("Please Enter Height in feet (space)inches: ");
	Scanner sd = new Scanner(System.in);
	 feet = sd.nextInt();
	 inches = sd.nextInt();

	 getHeight(feet,inches);

	System.out.println("Please Enter Weight in pounds:  ");
	 weight = sd.nextInt();
}

private void calculateBmiCategory() {

	/*
	 * Underweight = <18.5
Normal weight = 18.5–24.9
Overweight = 25–29.9
Obesity = BMI of 30 or greater

	 */

	if(checkCategory<18.5) {

		System.out.println("You are underweight.");

	}

	if(checkCategory>=18.5&&checkCategory<=24.9) {

		System.out.println("You are a normal weight.");
	}

	if (checkCategory>=25&&checkCategory<=29.9) {

		System.out.println("You are overweight.");

	}
if (checkCategory>=30) {

		System.out.println("You are obese.");

	}


}





private void readMetricData() {
	System.out.println("Please Enter Height in centimeters: ");
	Scanner sd1 = new Scanner(System.in);
	centi = sd1.nextInt();
	getHeight(centi,0);
	System.out.println("Please Enter weight in kilograms: ");
	kilo = sd1.nextInt();



}

	public double getHeight(double firstHeightInput,double secondHeightInput){

		return firstHeightInput;



	}

	private void setHeight(double firstHeightInput) {



	}

}
