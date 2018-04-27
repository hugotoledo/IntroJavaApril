package uselists;

import java.util.Arrays;
import java.util.List;

public class FunctionalList {
  public static void main(String[] args) {
    List<String> names =
        Arrays.asList("Fred", "Jim", "Sheila", "William", "Alice");

    names.forEach(x -> System.out.println("The value is " + x));

    names.stream()
        .map(x -> x.toUpperCase())
        .forEach(x -> System.out.println(x));

    names.forEach(x -> System.out.println("after " + x));

    names.stream()
        .filter(x -> x.length() > 4)
        .map(x -> x.toLowerCase())
        .forEach(x -> System.out.println(x));

  }
}
