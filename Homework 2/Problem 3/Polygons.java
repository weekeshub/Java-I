//Andrew Weekes
//CS-151 Homework 2

import java.util.Scanner;

public class Polygons {

  public static void main (String [] args) {

    //create variables for length
    Scanner length = new Scanner(System.in);
    int sideLength = -1;
    int triesLeft1 = 1;

    //create do loop for input validation
    do {
      System.out.print("\nWhat is the length of the side? ");
      sideLength = length.nextInt();
      System.out.println("You entered " + sideLength + ".");
      if ( sideLength <= 0 ){
        System.out.println("Side length must be equal to a positive real number.");
      }
      triesLeft1--;
    } while ((sideLength > 0)  &&  triesLeft1>0);


    //create variables for number of sides
    Scanner number = new Scanner(System.in);
    int sideNumber = -1;
    int triesLeft2 = 1;

    //create do loop for input validation
    do {
      System.out.print("\nWhat is the total number of sides? ");
      sideNumber = number.nextInt();
      System.out.println("You entered " + sideNumber + ".");
      if ( sideNumber <= 2 ){
        System.out.println("The total number of sides must be equal to a positive integer of 3 or more.");
      }
      triesLeft2--;
    } while ((sideNumber >= 3)  &&  triesLeft2>0);


    //create variables for apothem
    Scanner apothem1 = new Scanner(System.in);
    int apothem = -1;
    int triesLeft3 = 1;

    //create do loop for input validation
    do {
      System.out.print("\nWhat is the length of the apothem? ");
      apothem = apothem1.nextInt();
      System.out.println("You entered " + apothem + ".");
      if ( apothem <= 0 ){
        System.out.println("Apothem length must be equal to a positive real number.");
      }
      triesLeft3--;
    } while ((apothem > 0)  &&  triesLeft3>0);


    //calculate smoothness and print error if negative
    double smoothness = sideNumber / sideLength + Math.sqrt(apothem);
    if ( smoothness > 0 ){
      System.out.println("\nThe smoothness is " + smoothness + ".");
    } else {
      System.out.println("\nERROR: smoothness cannot be negative.");
    }

  }

}
