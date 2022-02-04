import java.util.Scanner;

public class ShallowGrandmother {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    int age;
    double income, cute, happy;
    boolean allowed, allowed2;

    System.out.println("Enter your age: ");
    age = keyboard.nextInt();

    System.out.println("Enter your yearly income: ");
    income = keyboard.nextDouble();

    System.out.println("How cute are you on a scale from 0.0 to 10.0? ");
    cute = keyboard.nextDouble();

    System.out.println("How happy do they make you on a scale from 0.0 to 10? ");
    happy = keyboard.nextDouble();

    allowed = (age > 25 && age < 40 && (income > 50000 || cute >= 8.5));
    System.out.println("Grandma 1: Allowed to date my grandchild? " + allowed);

    /* Study drill: many people have two grandmothers, lets pretend the other
    grandmother just wants you to be happy. Add a happiness question with a
    scale, a new boolean variable, and write the new expression that is true if
    persons age is close and they make you happy. */

    allowed2 = (age > 25 && age <40 && (happy >= 7));
    System.out.println("Grandma 2: Allowed to day my grandchild? " + allowed2);

  }
}
