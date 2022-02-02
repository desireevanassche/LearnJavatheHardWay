import java.util.Scanner; //allows us to recieve data from user

public class ForgetfulMachine {
  public static void main(String[] args){

    Scanner keyboard = new Scanner(System.in); /* This is a scanner object and the
    scanner is named "keyboard" the name can be changed but the same name must be used
    throughout the program or it will create an error */

    System.out.println("What city is the capital of France?");
    keyboard.next();

    System.out.println("What is 6 multiplied by 7?");
    keyboard.nextInt();

    System.out.println("Enter a numnber between 0.0 and 1.0.");
    keyboard.nextDouble();

    System.out.println("Is there anything else you would like to say?");
    keyboard.next();

/* Study drill: when entering any values outside of the ones assigned the program
"blows up" or crashes. For example, if I enter a decimal for the second question the program
will not work because it requires an integer not a double. For the third question if I
entered letters it would not work becuase it required a double, not a string. */

  }
}
