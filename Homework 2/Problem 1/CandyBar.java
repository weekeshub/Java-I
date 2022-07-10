//Andrew Weekes
//CS-151 Homework 2

public class CandyBar {

  //declare variables and constants
  String name;
  double calories;
  public static final double calPerPound = 3500.0; //3500 calories/pound

  //constructor defines instance data
  public CandyBar (String newName, double newCalories){
    name = newName;
    calories = newCalories;
  }

  //provide access to instance data (getters)
  public String getName(){
    return name;
  }

  public double getCalories(){
    return calories;
  }

  //provide modifiers for instance data (setters)
  public void setName( String newName ){
    name = newName;
  }

  public void setCalories( double newCalories ){
    calories = newCalories;
  }

  public double howManyBars(){
    double bars = calPerPound / calories;
    return bars;
  }

}
