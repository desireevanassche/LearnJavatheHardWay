import java.util.Scanner;

public class SecretWord {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    String secret = "please", guess, potao;

    System.out.print("What's the secret word? ");
    guess = keyboard.next();

    /*Study Drill: Pick a second keyword that will also work, the add an OR
    to the first if statment so thay typiing either will result in an
    "That's Correct" answer. New secret work: potato */

    if (guess.equals(secret) || guess.equals("potato")) {
      System.out.println("That's correct!");
    }

    else {
      System.out.println("No, the secret word isnt \"" + guess + "\".");
    }
    if (guess == secret) {
      System.out.println("(This will never show, no matter what.)");

    }
  }
}
