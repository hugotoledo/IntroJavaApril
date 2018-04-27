package datestuff;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class DateSupport {
  public static int getDayOfWeek(int day, int month, int year)
      throws FileNotFoundException {
    if (day < 1 || month < 1 || year < 1 || day > 31 || month > 12) {
      throw new FileNotFoundException("Bad day info");
    }
    int m, y;
//    System.out.println(m); // CANNOT read unitialized local variable
    if (month > 2) {
      m = month;
      y = year;
    } else {
      m = month + 12;
      y = year - 1;
    }
    int dayOfWeek = (day
        + (13 * (m + 1) / 5)
        + y
        + (y / 4)
        - (y / 100)
        + (y / 400)) % 7;
    return dayOfWeek;
  }

  public static void main(String[] args) {
    try {
      System.out.println("jan 1 2000 was day number " + getDayOfWeek(1, 1, 2000));
      System.out.println("Today is day number " + getDayOfWeek(27, 4, 2018));
      System.out.println("non-day is day number " + getDayOfWeek(0, -3, -100));
    } catch (FileNotFoundException e) {
      System.out.println("Ooops, that broke");
//      e.printStackTrace();
    }
//    catch (SQLException sqle) {}
    finally {
      System.out.println("");
    }
    System.out.println("Program is still running...");
  }
}
