package generalization;

public class HomeOwner {
  public static void main(String[] args) {
    Plumber p = Plumber.getTheDefaultPlumber();
//    Plumber p = new RobotPlumber();
    p.fixTheDrain();
  }
}
