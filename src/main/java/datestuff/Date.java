package datestuff;

import java.io.FileNotFoundException;

public class Date {
  int day;
  int month;
  int year;
//  public static void printADate(Date d) {
//    System.out.println("Date is " + d.day + "/" + d.month + "/" + d.year);
//  }

  public Date(int day, int month, int year) {
    if (day < 1 || month < 1 || year < 1 || day > 31 || month > 12) {
      throw new IllegalArgumentException("Bad day info");
    }
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public void printADate() {
    System.out.println("Date is "
        + this.day + "/" + this.month + "/" + this.year);
  }
  public String toString() {
    return "Date as text  is " + this.day + "/" + this.month + "/" + this.year;
  }

  public static boolean isLeapYear(int year) {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
  }
}
