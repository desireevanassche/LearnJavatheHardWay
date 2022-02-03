import java.util.Scanner;

public class BMICalculator {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    int feet;
    double inches, lbs, bmi, height;

    System.out.print("Your height (feet only): ");
    feet = keyboard.nextInt();

    System.out.print("Your height (inches): ");
    inches = keyboard.nextDouble();

    height = (feet * 12) + inches;
    /* this formula will convert feet to inches and then add the inches remaining
    for a total heigh in inches making a cleaner calculation for the BMI*/ 

    System.out.print("Your weight in pounds: ");
    lbs = keyboard.nextDouble();

    bmi = (lbs / height / height) * 703;

    // retieved BMI formula from the CDC

    System.out.println("Your BMI is " + bmi);

  }
}
