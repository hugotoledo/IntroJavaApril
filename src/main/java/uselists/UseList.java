package uselists;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UseList /*extends Object*/ {
  public static void main(String[] args) {
//    List<String> names = new ArrayList<String>();
    List<String> names = new LinkedList<>();
//    List names = new ArrayList();
    names.add("Fred");
    names.add("Jim");
    names.add("Sheila");
//    names.add(LocalDate.now());

    System.out.println("first item in the list is " + names.get(0));
    System.out.println("There are " + names.size() + " items in the list");
    for(String n : names) {
      System.out.println("name: " + n);
    }
  }
}
