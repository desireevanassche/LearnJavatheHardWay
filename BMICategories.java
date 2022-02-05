import java.util.Scanner;

public class BMICategories {
  public static void main(String[] args){

    Scanner keyboard = new Scanner(System.in);
    double bmi;

    System.out.print("Enter your BMI: ");
    bmi = keyboard.nextDouble();

    if (bmi < 15.0) {
      System.out.println("Very severly underweight");
    }
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
