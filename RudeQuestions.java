import java.util.Scanner;

public class RudeQuestions {
  public static void main(String[] args) {

    String name, favoriteAnimal;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.println("Hello. What is your name?");
    name = keyboard.next();

    System.out.println("Hi, " + name + "! " + "How old are you? ");
    age = keyboard.nextInt();

    System.out.println("So you're " + age + ", eh? That's not very old.");
    System.out.println("How much do you weigh " + name + " ?");
    weight = keyboard.nextDouble();

    System.out.println(weight + "!" + " Better keep that quiet!!");
    System.out.println("Finally, what's your income, " + name + "?");
    income = keyboard.nextDouble();

    System.out.print("Hopefully that is " + income + " per hour!");
    System.out.println(" and not per year!");
    System.out.print("Well, thanks for answering my rude questions, ");
    System.out.println(name + ".");

    System.out.println("Okay, okay. I've asked enough rude questions. What is your favorite animal?");
    favoriteAnimal = keyboard.next();
    System.out.print("A " + favoriteAnimal + ", you say? Mine too!");

/* 1. No, the program does not blow up when you enter an integer instead of a double,
the double variable allows for decimal points and whole numbers.
2. Yes, the program does blow up if you enter a number where a string variable has been
declared. This occurs because number are not in the apporoved range of answers.
3.  */

  }
}
