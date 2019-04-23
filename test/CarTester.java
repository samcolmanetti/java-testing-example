import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CarTester {

  private Car mCar;

  @Before
  public void setUp() {
    mCar = new Car();
  }

  @Test
  public void constructor_whenCreated_shouldBeTurnedOff() {
    assertFalse(mCar.isTurnedOn());
  }

  @Test
  public void turnOn_whenOff_shouldPass() {
    mCar.turnOn();
    assertTrue(mCar.isTurnedOn());
  }

  @Test(expected = IllegalStateException.class)
  public void turnOn_whenOn_shouldThrow() {
    mCar.turnOn();
    mCar.turnOn(); // should throw exception
  }

  @Test(expected = IllegalStateException.class)
  public void turnOff_whenOff_shouldThrow() {
    assertFalse(mCar.isTurnedOn());
    mCar.turnOff();
  }

  @Test
  public void turnOff_whenOn_shouldPass() {
    mCar.turnOn();
    mCar.turnOff();
    assertFalse(mCar.isTurnedOn());
  }

  @Test(expected = UnsupportedOperationException.class)
  public void fly_shouldThrow() {
    mCar.fly();
  }

  @Test
  public void drive_whenOn_shouldPass() {
    mCar.turnOn();

    int miles = 100;
    mCar.drive(miles);
    assertEquals(miles, mCar.getMilesDriven());
  }

  @Test(expected = IllegalStateException.class)
  public void drive_whenOff_shouldThrow() {
    assertFalse(mCar.isTurnedOn());

    int miles = 100;
    mCar.drive(miles);
  }

  @Test
  public void drive_whenMultipleTrips_shouldPass() {
    int firstLeg = 10;
    mCar.turnOn();
    mCar.drive(firstLeg);
    mCar.turnOff();

    int secondLeg = 20;
    mCar.turnOn();
    mCar.drive(secondLeg);
    mCar.turnOff();

    int thirdLeg = 30;
    mCar.turnOn();
    mCar.drive(thirdLeg);
    mCar.turnOff();

    int expected = firstLeg + secondLeg + thirdLeg;
    assertEquals(expected, mCar.getMilesDriven());
  }

}