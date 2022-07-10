//Andrew Weekes
//CS-151 Homework 1

import java.util.Scanner;

public class Homework1 {

public static void main (String [] args){

	System.out.println("\n********************");
	System.out.println("*  Andrew  Weekes  *");
	System.out.println("* Computer Science *");
	System.out.println("********************");


	//Problem 2: Turing Test
	//Write a program which asks the user three questions,
	//then responds in a friendly way and includes repeating the information entered.

	String name;
	String major;
	String hobby;

	Scanner scan = new Scanner(System.in);

	//First Question
	System.out.print("\nWhat is your name? ");
	name = scan.nextLine();
	System.out.println("Okay, I understand. Your name is " + name + ".");

	//Second Question
	System.out.print("\nWhat is your major? ");
	major = scan.nextLine();
	System.out.println("Okay, I understand. Your major is " + major + ".");

	//Third Question
	System.out.print("\nWhat is your favorite hobby? ");
	hobby = scan.nextLine();
	System.out.println("Okay, I understand. Your favorite hobby is " + hobby + ".");
	System.out.println("\n");


	/*Problem 3: A watched pot never boils

	You need to know exactly how long it will take for your water to boil.
	Your pot is cylindrical with a radius of 10cm.
	Your stove delivers 250 Cal/sec of heat energy.

	Write a java program which will ask the user how deep and warm the water is
	and then calculates and displays the time in minutes that it will take*/

	//declare constants and variables
	final double HEAT_RATE = 250.0; //cals/sec
	final double RADIUS = 10.0; //cm
	final double PI = 3.14;
	double depth = 0.0;
	double temp = 0.0;

	//get depth from user
	Scanner object = new Scanner(System.in);
	System.out.print("What is the depth of the pot? ");
	depth = object.nextDouble();

	//get starting temp from user
	Scanner keyboard = new Scanner(System.in);
	System.out.print("What is the starting temperature of the pot? ");
	temp = keyboard.nextDouble();

	//calculate volume
	double volume = PI * RADIUS * RADIUS * depth;

	//calculate time
	double tempChange = 100 - temp;
	double caloriesNeeded = volume * tempChange;
	double time = caloriesNeeded / HEAT_RATE;

	//display results
	System.out.println("The time it takes for the water to boil is " + time / 60 + " minutes.");

  }


}
