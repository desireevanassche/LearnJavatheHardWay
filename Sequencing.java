import java.util.Scanner;

public class Sequencing {
  public static void main(String[] args) {
  //Broken code!

  Scanner keyboard = new Scanner(System.in);
  double price, salesTax, total;

/* I think the logical error was created in line 8: double price = 0, salesTax, total
This program is intended to collect the users input for the price value */


  System.out.print("How much is the purchase price? ");
  price = keyboard.nextDouble();

/* Since price is defined by the users input I moved the areas that the value
price is used to below where it is defined and given a value. These two correction
made the program operate as expected.*/

  salesTax = price * 0.0825;
  total = price + salesTax;

  System.out.println("Item price:\t" + price);
  System.out.println("Sales tac:\t" + salesTax);
  System.out.println("Total cost:\t" + total);


}
}
