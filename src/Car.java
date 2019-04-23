public class Car {

  private boolean mIsTurnedOn;

  public Car() {
    mIsTurnedOn = false;
  }

  public void turnOn() {
    if (mIsTurnedOn) {
      throw new IllegalStateException("Cannot turn a car that is already on");
    }
    mIsTurnedOn = true;
  }

  public boolean ismIsTurnedOn() {
    return mIsTurnedOn;
  }

  public void turnOff() {
    if (!mIsTurnedOn) {
      throw new IllegalStateException("Cannot turn off a car that is already off");
    }
    mIsTurnedOn = false;
  }

  public void fly() {
    throw new UnsupportedOperationException();
  }
}
