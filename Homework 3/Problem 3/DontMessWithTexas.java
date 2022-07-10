//Andrew Weekes
//CS 151-05
//Homework 3

public class DontMessWithTexas{

	public static void main (String [] args){

		int caliPopulation = 40000000;
		int texasPopulation = 29000000;
		int yearsPassed = 0;

		while(texasPopulation < caliPopulation){

			yearsPassed++;

			caliPopulation -= caliPopulation * 0.03;

			texasPopulation += texasPopulation * 0.02;

			System.out.print("Years passed: " + yearsPassed + " \t");
			System.out.print("CA population: ");
			System.out.printf("%,d\t", caliPopulation);
			System.out.print("TX population: ");
			System.out.printf("%,d", texasPopulation);

			System.out.println();

		}

	}

}
