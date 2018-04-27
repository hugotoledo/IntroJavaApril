package expressionsetc;

public class Ex1 {
  public static void main(String[] args) {
    // primitive types:
    // boolean - true, false
    // byte, short, int, long -- signed integers e.g. +36, -99
    // char (16 unicode character) nothing negative
    // float, double -- floating point
    int x = 99;
    long y = 12345678901234L;
    System.out.println("y is " + y);
    x = (int)y; // casting know what you're doing!!
    System.out.println("x is " + x);
    // arithmetic + - * /   modulus %
    // Math.sin(x)
    System.out.println("sin of 1/2 is " + Math.sin(0.5));

    x = 0;
    while (x < 10) {
      // comparisons are < > <= >= != ==
      System.out.println("x is " + x);
//      x = x + 1;
//      x += 1; // shorthand
      ++x; // shorthand also x++ --x x--
    }

    for (int idx = 0; idx < 5; idx++) {
      System.out.println("idx is " + idx);
    }
//    System.out.println(idx);
// idx is scoped to "formal parameter list" and block that follows

    String [] names = new String[3];
    names[0] = "Fred";
    names[1] = "Jim";
    names[2] = "Sheila";

    System.out.println("the first name is " + names[0]);
    for (int idx = 0; idx < names.length; idx++) {
      System.out.println("name " + idx + " is " + names[idx]);
    }

    for (String s : names) { // enhanced for loop (no index counter!!!!)
      System.out.println("And this string is: " + s);
    }

    if (Math.random() > 0.5) {
      System.out.println("Oh, that's big");
    } else if (Math.random() > 0.3){
      System.out.println("not so big...");
    } else {
      System.out.println("both kinda small.");
    }
  }
}
