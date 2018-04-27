package datestuff;

public class Holiday extends Date {
  String name;

  public Holiday(int day, int month, int year, String name) {
    super(day, month, year);
    this.name = name;
  }

  @Override
  public String toString() {
    return "Holiday called " + this.name + " on " +
        this.day + "/" + this.month + "/" + this.year;
  }
}
