public class Car {
  private String carName;
  private String carColor;
  private double carPrice;

  // Constructor that initializes the fields
  public Car(String carName, String carColor, double carPrice) {
    this.carName = carName;
    this.carColor = carColor;
    this.carPrice = carPrice;
  }

  // Default constructor
  public Car() {
    this("", "", 0.0);
  }

  // Getter method for the carName field
  public String getCarName() {
    return carName;
  }

  // Setter method for the carName field
  public void setCarName(String carName) {
    this.carName = carName;
  }

  // Getter method for the carColor field
  public String getCarColor() {
    return carColor;
  }

  // Setter method for the carColor field
  public void setCarColor(String carColor) {
    this.carColor = carColor;
  }

  // Getter method for the carPrice field
  public double getCarPrice() {
    return carPrice;
  }

  // Setter method for the carPrice field
  public void setCarPrice(double carPrice) {
    this.carPrice = carPrice;
  }

  // Method that returns a string representation of the Car object
  @Override
  public String toString() {
    return "Car [carName=" + carName + ", carColor=" + carColor + ", carPrice=" + carPrice + "]";
  }
}
