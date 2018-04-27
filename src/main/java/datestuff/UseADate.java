package datestuff;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UseADate {
  public static void showADate(Date d) {
    System.out.println("The day is " + d.day);
  }

  public static void main(String[] args) {
//    Date today = new Date();
//    today.day = 27;
//    today.month = 4;
//    today.year = 2018;
    Date today = new Date(27, 4, 2018);
//    Date.printADate(today);
    today.printADate();

    Date tomorrow = new Date(today.day + 1, today.month, today.year);

//    Holiday h = new Holiday(1, 1, 2018, "Pancake Day");
    Holiday h = new Holiday(1, 1, 2018, "Pancake Day");
//    h.day = 1;
//    h.month = 1;
//    h.year = 2018;
//    h.name = "Pancake Day";
    System.out.println("holiday name is " + h.name);

    showADate(h);
    showADate(today);

    System.out.println("Holiday is: " + h);

//    Date.printADate(tomorrow);
    tomorrow.printADate();
    System.out.println("tomorrow is " + tomorrow);

    LocalDateTime betterToday = LocalDateTime.now();
    System.out.println("Today is " + betterToday);
  }
}
