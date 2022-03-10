package task1;

//1.c - create private fields
public class Car {
    private String make;
    private String model;
    private int year;
    private String bodyStyle;
    private Driver driver;

    //1.d - create a constructor for class Car
    public Car(String make, String model, int year, String bodyStyle) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.bodyStyle = bodyStyle;
    }

    //1.e - create a getter and setter for driver variable
    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    //1.f - override and give new return output
    @Override
    public String toString() {
        return "Make: " + make + ". Model: " + model + " (" + year + "), BodyStyle: " + bodyStyle;
    }
}

