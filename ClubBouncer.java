public class ClubBouncer {

  public static void main(String[] args) {

    int age = 22;
    boolean onGuestList = false;
    double allure = 7.5;
    String gender = "F";

    if (onGuestList || age >= 21 || (gender.equals("F") && allure >= 8)) {
      System.out.println("You are allowed to enter the club.");
    }
    /* Study Drill: add a println in here and see if it compiles -
    this generates an error code 'else without if' and does not compile. */

    else {
      System.out.println("You are not allowed in the club.");
    }

  }
}
