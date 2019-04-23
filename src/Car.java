public class Car {

  private boolean mIsTurnedOn;
  private int mMilesDriven;

  public Car() {
    mIsTurnedOn = false;
    mMilesDriven = 0;
  }

  public void turnOn() {
    if (mIsTurnedOn) {
      throw new IllegalStateException("Cannot turn a car that is already on");
    }
    mIsTurnedOn = true;
  }

  public void turnOff() {
    if (!mIsTurnedOn) {
      throw new IllegalStateException("Cannot turn off a car that is already off");
    }
    mIsTurnedOn = false;
  }

  public boolean isTurnedOn() {
    return mIsTurnedOn;
  }

  public void drive(int miles) {
    if (!isTurnedOn()) {
      throw new IllegalStateException("Cannot drive if car is turned off");
    }

    mMilesDriven = mMilesDriven + miles;
  }

  public int getMilesDriven() {
    return mMilesDriven;
  }

  public void fly() {
    throw new UnsupportedOperationException();
  }
}
