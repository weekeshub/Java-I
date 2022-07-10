//Andrew Weekes
//CS 151-05
//Homework 4

import java.util.Scanner;

public class NumbersSolution {

	public static void main(String[] args) {

		int[][] numbers = {
			{23,74,10,51,76,61,6,7},{16,50,27,35,38,15,78,15},
			{75,29,68,67,64,68,38,49},{22,99,50,61,65,36,68,17},
			{89,3,5,12,8,9,92,90},{88,49,0,28,95,64,14,5},
			{59,15,87,76,47,66,31,99},{54,15,86,52,48,30,91,40},
			{37,53,77,89,8,66,74,22},{19,86,96,57,1,45,34,85},
			{4,78,31,60,44,86,67,88},{22,59,83,75,72,90,13,34},
			{81,57,22,53,62,1,64,40},{97,1,48,55,20,28,31,89},
			{97,93,91,39,9,89,23,32},{93,42,85,81,21,47,45,56},
			{16,66,85,43,18,59,71,10},{10,65,39,5,30,52,58,67},
			{77,22,75,32,82,6,23,91},{0,10,19,19,50,49,92,40}
		};

		int favNumber = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("\nEnter your favorite number between 1 and 99: ");
		favNumber = scan.nextInt();

		if (favNumber < 100 && favNumber > 0){
			System.out.println("You entered: " + favNumber);
		} else {
			System.out.println("Invalid entry, enter another number.");
		}
		System.out.print("\n");

		int index = 0;
		int count = 0;
		for (int outer = 0; outer < numbers.length; outer++){
			for (int inner = 0; inner < numbers[outer].length; inner++){
				if (numbers[outer][inner] == favNumber){
					count++;
				} else {
					count = count;
				}
			}
		}
		System.out.println("Favorite number appears: " + count + " times.");
		System.out.print("\n");

	}

}
