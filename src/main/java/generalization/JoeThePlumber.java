package generalization;

public class JoeThePlumber implements Plumber {
  @Override
  public void fixTheDrain() {
    System.out.println("ooh, looks bad, let me get the " +
        "rods out, and the chemicals!");
  }

  @Override
  public int sendMeYouBill() {
    return 100;
  }
}
