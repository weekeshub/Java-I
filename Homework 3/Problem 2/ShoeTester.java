/*
* @author Jeff Blankenship
*/

public class ShoeTester{

  public static void main(String[] args){

    //create three shoes and assign brand/model
    //First shoe
    Shoe shoe1 = new Shoe();
    shoe1.setBrand("Nike");
    shoe1.setModel("AirJordan");

    //Second shoe
    Shoe shoe2 = new Shoe();
    shoe2.setBrand("Nike");
    shoe2.setModel("AirJordan");

    //Third shoe
    Shoe shoe3 = new Shoe();
    shoe3.setBrand("Converse");
    shoe3.setModel("All Stars");

    //display the shoes
    System.out.println("shoe1 is: " + shoe1);
    System.out.println("shoe2 is: " + shoe2);
    System.out.println("shoe3 is: " + shoe3);

    //test if shoes are equal
    System.out.println("shoe1.equals(shoe2): " + shoe1.equals(shoe2) );
    System.out.println("shoe1 == shoe2:      " + (shoe1 == shoe2)    );
    System.out.println("shoe2.equals(shoe3): " + shoe2.equals(shoe3) );

  }

}
