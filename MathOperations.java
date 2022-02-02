public class MathOperations {
  public static void main(String[] args) {

  int a, b, c, d, e, f, g, h;
  double x, y, z, k, l, m;
  String one, two, both;

  a = 10;
  b = 27;
  System.out.println("a is " + a + ", b is " + b);

  c = a + b;
  System.out.println("a + b is " + c);

  d = a - b;
  System.out.println("a - b is " + d);

  e = a + b * 3;
  System.out.println("a + b * 3 is " + e);

  f = b / 2;
  System.out.println("b / 2 is " + f);

  g = b % 10;
  System.out.println("b % 10 is" + g);

  x = 1.1;
  System.out.println("\nx is " + x);

  y = x * x;
  System.out.println("x * x is " + y);

  z = b / 2;
  System.out.println("b / 2 is " + z);
  System.out.println();

  one = "dog";
  two = "house";
  both = one + two;
  System.out.println(both); //Skill drill ends here

  /* Study drill starts here: Add 2 new variables, then two new lines,
  use mathmatical expression and use all math operators at least once */

  h = 16;
  k = 4.4;

  l = (h / k) * k;
  System.out.println("(h / k) * k is " + l);

  m = (l + h) % 2;
  System.out.println("(l + h) % 2 is " + m);

  }
}
