package generalization;

public interface Plumber {
  /*public abstract*/ void fixTheDrain();
  /*public abstract*/ int sendMeYouBill();

  static Plumber getTheDefaultPlumber() {
    if (Math.random() > 0.5) {
      return new JoeThePlumber();
    } else {
      return new RobotPlumber();
    }
  }
}
