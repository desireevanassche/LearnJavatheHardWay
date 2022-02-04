import java.util.Scanner;
public class BooleanExpressions {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    boolean a, b, c, d, e, f;
    double x, y;

    System.out.println("Give me two numbers. The first number: ");
    x = keyboard.nextDouble();

    System.out.println("The second number: ");
    y = keyboard.nextDouble();

    a = (x < y);
    b = (x <= y);
    c = (x == y);
    d = (x != y);
    e = (x > y);
    f = (x >= y);

    System.out.println(x + "is LESS THAN " + y + ": " + a);
    System.out.println(x + "is LESS THAN or EQUAL TO " + y + ": " + b);
    System.out.println(x + "is EQUAL TO " + y +  ": " + c);
    System.out.println(x + "is NOT EQUAL TO " + y + ": " + d);
    System.out.println(x + "is GREATER THAN " + y + ": " + e);
    System.out.println(x + "is GREATER THAN or EQUAL TO " + y + ": " + f);
    System.out.println();



    System.out.println( !(x < y ) + " " + (x >= y));
    System.out.println( !(x <= y) + " " + (x > y));
    System.out.println( !(x == y) + " " + (x != y));
    System.out.println( !(x != y) + " " + (x == y));
    System.out.println( !(x > y) + " " + (x <= y));
    System.out.println( !(x >= y) + " " + (x < y));

    /* the "not" opperator is an exclamation point(!) , meaning it takes the logical
    opposite. Therfore if !(x < y) means that x is greater than y because it is the
    opposite of the expression in parentesis, which would be x is less than y */

    /* Study drill: Add comments explaining all 6 operators and their meanings
    Less than is <
    Greater than is >
    Less than or equal to is <-
    Greater than or equal to is >=
    Is equal to is ==
    Is NOT equal to is !=
    */

    }
}
