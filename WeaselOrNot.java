import java.util.Scanner;

public class WeaselOrNot {
  public static void main(String[] args) {
  Scanner keyboard = new Scanner(System.in);
  String word;
  boolean yep, nope;

  System.out.println("Type the word \"weasel\" please.");
  word = keyboard.next();

  yep = "weasel".equals(word);
  nope = ! word.equals("weasel");

  /* In lines 12 & 13 we can reaarage the string and the varaible and get the
  same results. In order for this to work we must make sure the string is in
  quotaions and the variable is not. Both ways work.  */

  System.out.println("You typed what was requested: " + yep);
  System.out.println("You ignored polite instructions: " + nope);

  }
}
