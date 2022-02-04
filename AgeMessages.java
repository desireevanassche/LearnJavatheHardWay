import java.util.Scanner;

public class AgeMessages {
  public static void main(String[] args) {

  Scanner keyboard = new Scanner(System.in);
  int age;

  System.out.print("How old are you? ");
  age = keyboard.nextInt();

    System.out.println("You are: ");
    if (age < 13) {
    System.out.println("\ttoo young to create a Facebook account");
    }
    //#3 For each if statment add another if statment that says the opposite
    if (age >= 13) {
      System.out.println("\told enough to create a Facebook");
    }

    if (age < 16) {
      System.out.println("\ttoo young to get a drivers license");
    }

    if (age >= 16 ) {
      System.out.println("\told enough to get a drivers license");
    }

    if (age < 18) {
      System.out.println("\ttoo young to get a tatoo");
    }

    if (age >= 18) {
      System.out.println("\told enough to get a tatoo");
    }

    if (age < 21) {
      System.out.println("\ttoo young to drink alcahol");
    }

    if (age >= 21) {
      System.out.println("\told enough to drink alcahol");
    }

    if (age < 35) {
      System.out.println("\ttoo young to run for President of the U.S.");
      System.out.println("\t\t(How sad!)");
    }

    if (age >= 35){
      System.out.println("\told enough to run for President of the U.S.");
    }
    
    if (age >= 65) {
      System.out.println("\tYou are old enough to retire!");
      //2. New condition added
    }

/*Study drill: 1. If you type in an age greater than 35 what gets printed? Why?
You are: is printed since the println is created before the if statments start and
there is not currently a condition that matches the input age. */
  }
}
