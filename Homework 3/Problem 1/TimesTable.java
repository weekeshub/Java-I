//Andrew Weekes
//CS 151-05
//Homework 3

public class TimesTable {

	public static void main (String [] args){

		for(int outer = 1; outer <= 13; outer += 3){
			for(int inner = 1; inner <= 13; inner += 2){
				System.out.printf("%6d", inner * outer);
			}
			System.out.println();

		}


	}

}
