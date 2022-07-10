//Andrew Weekes
//CS-151 Homework 2

import java.util.Scanner;

public class Registration {

  public static void main (String [] args) {

    //declare variables for number of credits and whether or not student is a commuter
    int credits = -10;
    String isCommuter = "bad answer";


    //get number of credits completed from user
    while ( credits<0 ){

      Scanner keyboard = new Scanner(System.in);
      System.out.print("\nHow many credits have you completed? ");
      credits = keyboard.nextInt();
      System.out.println("You have completed " + credits + " credits.");

    }

    //ask user: is the student a commuter or no?
    while ( (!isCommuter.equals("yes"))  &&  (!isCommuter.equals("no"))){

      Scanner mouse = new Scanner(System.in);
      System.out.print("\nAre you a commuter? Enter \"yes\" or \"no\"");
      isCommuter = mouse.nextLine();

      if (isCommuter.equals("yes")){
        credits += 60;
      }
      else {
        credits = credits;
      }

    }


    if (credits<30){
      System.out.println("\nRegistration begins on Wednesday, December 1 at 8:00 a.m.");
    }
    if (credits>=30 && credits<60){
      System.out.println("\nRegistration begins on Tuesday, November 16 at 1:30 p.m.");
    }
    if (credits>=60 && credits<90){
      System.out.println("\nRegistration begins on Thursday, November 11 at 10:30 a.m.");
    }
    if (credits>=90){
      System.out.println("\nRegistration begins on Tuesday, Novermber 9 at 8:00 a.m.");
    }


  }


}
