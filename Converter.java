package main;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		int menuSelection = -1;
		Scanner scanInput = new Scanner(System.in); 
		
		while(menuSelection != 4) {
			System.out.println("Please select an option:");
			System.out.println("1. Cups to Teaspoons");
			System.out.println("2. Miles to Kilometers");
			System.out.println("3. US Gallons to Imperial Gallons");
			System.out.println("4. Quit");
			
			menuSelection = scanInput.nextInt();
			
			switch(menuSelection) {
			case 1:
				System.out.println("Please enter the number of Cups");
				double noOfCups = scanInput.nextDouble();
				double noOfTeaspoons = noOfCups * 48;
				System.out.println(noOfCups + " Cups is " + noOfTeaspoons + " Teaspoons");
				break;
			case 2:
				System.out.println("Please enter the number of Miles");
				double noOfMiles = scanInput.nextDouble();
				double noOfKilometers = noOfMiles * 1.60934;
				System.out.println(noOfMiles + " Miles is " + noOfKilometers + " Kilometers");
				break;
			case 3:
				System.out.println("Please enter the number of US Gallons");
				double noOfUSGallons = scanInput.nextDouble();
				double noOfImperialGallons = noOfUSGallons * 0.832674;
				System.out.println(noOfUSGallons + " US Gallons is " + noOfImperialGallons + " Imperial Gallons");
				break;
			}
		}
		scanInput.close();
	}
}
