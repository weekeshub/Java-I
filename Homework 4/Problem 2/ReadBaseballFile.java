//Andrew Weekes
//CS 151-05
//Homework 4

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class ReadBaseballFile {

	public static void main (String[] args) throws IOException{

		File textFile = new File ("2004CCSUBaseball.txt");
		Scanner fileScanner = new Scanner (textFile);
		String[][] data = new String[19][23]; //[row]

		fileScanner.nextLine();


		//read the file and split it into the data array
		int row = 0;
		while (fileScanner.hasNextLine()){
			String line = fileScanner.nextLine();
			data[row] = line.split(",");
			System.out.println(line);
			row++;
		}
		fileScanner.close();
		System.out.println("\n\n");


		//print the array
		for (int outer = 0; outer<data.length; outer++){
			for (int inner = 0; inner<data[outer].length; inner++){
				System.out.print(data[outer][inner] + " ");
			}
			System.out.print("\n");
		}

		//only include player if at least 25 AB
		double AB = 0.0;
		double RBI = 0.0;
		double ER = 0.0;
		double count = 0.0;
		double sum = 0.0;
		double average = 0.0;
		for (int outer = 0; outer<data.length; outer++){

			RBI = Double.parseDouble(data[outer][9]);
			AB = Double.parseDouble(data[outer][3]);

			if ( AB > 25 ){
				ER = RBI / AB;
				sum += ER;
				count++;
				System.out.print("\n" + data[outer][0]);
				System.out.print("\nNumber of Expected Runs: " + ER);
				System.out.print("\nNumber of RBI: " + RBI);
				System.out.print("\nNumber of At Bats: " + AB);
				System.out.print("\n");
			}
		}
		average = sum / count;
		System.out.println("\nTeam average ER is " + average);



		int maxRow = 0;
		double maxER = 0.0;
		for (int outer = 0; outer < data.length; outer++){

			RBI = Double.parseDouble(data[outer][9]);
			AB = Double.parseDouble(data[outer][3]);

			ER = RBI / AB;

			if (ER > maxER && AB > 25){
				maxER = ER;
				maxRow = outer;
			}
		}
		System.out.print("\nFirst player is: " + data[maxRow][0] + " at position 1.");
		data[maxRow][9] = "0";
		maxER = 0;

		for (int outer = 0; outer < data.length; outer++){

			RBI = Double.parseDouble(data[outer][9]);
			AB = Double.parseDouble(data[outer][3]);

			ER = RBI / AB;

			if (ER > maxER && AB > 25){
				maxER = ER;
				maxRow = outer;
			}
		}
		System.out.print("\nSecond player is: " + data[maxRow][0] + " at position 2.");
		data[maxRow][9] = "0";
		maxER = 0;

		for (int outer = 0; outer < data.length; outer++){

			RBI = Double.parseDouble(data[outer][9]);
			AB = Double.parseDouble(data[outer][3]);

			ER = RBI / AB;

			if (ER > maxER && AB > 25){
				maxER = ER;
				maxRow = outer;
			}
		}
		System.out.println("\nThird player is: " + data[maxRow][0] + " at position 3.");
		System.out.print("\n");
		data[maxRow][9] = "0";
		maxER = 0;

	}
}
