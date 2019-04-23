public class Car {

  private boolean isTurnedOn;

  public Car() {
    isTurnedOn = false;
  }

  public void turnOn() {
    if (isTurnedOn) {
      throw new IllegalStateException("Cannot turn a car that is already on");
    }
    isTurnedOn = true;
  }

  public boolean isTurnedOn() {
    return isTurnedOn;
  }

  public void turnOff() {
    if (!isTurnedOn) {
      throw new IllegalStateException("Cannot turn off a car that is already off");
    }
    isTurnedOn = false;
  }

  public void fly() {
    throw new UnsupportedOperationException();
  }
}
