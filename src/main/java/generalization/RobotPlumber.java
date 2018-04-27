package generalization;

public class RobotPlumber implements Plumber {
  @Override
  public void fixTheDrain() {
    System.out.println("burr wizz, click, done!");
  }

  @Override
  public int sendMeYouBill() {
    return 50;
  }
}
