import java.util.Scanner;

public class BMICategories {
  public static void main(String[] args){

    Scanner keyboard = new Scanner(System.in);
    double bmi, inches, lbs, height;
    int feet;

    System.out.print("Enter your height (in feet only): ");
    feet = keyboard.nextInt();

    System.out.print("Enter your height (in inches): ");
    inches = keyboard.nextDouble();

    height = (feet * 12) + inches;

    System.out.print("Your weight in pounds: ");
    lbs = keyboard.nextDouble();

    bmi = (lbs / height / height) * 703;
    System.out.println("Your BMI is: " + bmi);

    if (bmi < 15.0) {

      System.out.println("Very severly underweight");
    }
    /* Study Drill 1. Remove the else from the if statment on line 22 and
    see what happens. Removing the else if breaks rank and will display
    multiple outputs.*/

    else if (bmi <= 16.0) {
      System.out.println("severly underweight");
    }
    else if (bmi < 18.5) {
      System.out.println("underweight");
    }
    else if (bmi < 25.0) {
      System.out.println("normal weight");
    }
    else if (bmi < 30.0) {
      System.out.println("over weight");
    }

    else if (bmi < 35.0) {
      System.out.println("moderately obese");
    }

    else if (bmi < 40.0) {
      System.out.println("severly obese");
    }
    else {
      System.out.println("very severly/\"morbidly\" obese");
    }
  }
}
