//Andrew Weekes
//CS-151 Homework 2

public class CandyStore {

  public static void main (String [] args){

    //bar1: snickers, 230 calories
    CandyBar snickers = new CandyBar("Snickers", 230.0);

    //bar2: twix, 250 calories
    CandyBar twix = new CandyBar("Twix", 250.0);

    //retrieve first candy bar name, change it, and retrieve it again
    System.out.println("\n First candy bar name: " + snickers.getName());
    System.out.println("\n Change first candy bar name to Hersheys.");
    snickers.setName("Hersheys");
    System.out.println("\n First candy bar name is now: " + snickers.getName());

    //retrieve first candy bar calories, change it, and retrieve it again
    System.out.println("\n First candy bar calories: " + snickers.getCalories());
    System.out.println("\n Change first candy bar calories to " + 300.0);
    snickers.setCalories(300.0);
    System.out.println("\n First candy bar calories is now: " + snickers.getCalories());

    //calculate number of bars needed to gain one pound
    System.out.print("\n Number of candy bars needed to be eaten to gain one pound: ");
    System.out.println(twix.howManyBars());

  }

}
