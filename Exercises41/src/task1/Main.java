package task1;

public class Main {

    public static void main(String[] args) {
        String whoIs = "\nWho is driving the car? ";

        //1.h - instantiate a new driver & populate fields with own name and age
        Driver myDriver = new Driver("Felicia", 28);
        System.out.println("This is the drivers age: " + myDriver.getAge() + " years old");

        //alternative driver of cars
        Driver herDriver = new Driver("Tobias", 27);

        //1.i instantiate a new car & populate fields with whatever values
        //1.j assign the driver to the car using the setter method created in step 1.e
        System.out.println("\nInformation about the first car: ");
        Car firstCar = new Car("Volkswagen", "Golf", 2012, "VII");
        System.out.println(firstCar);

        //1.k print the toString method of the car you've created followed by the toString method of the driver.
        firstCar.setDriver(myDriver);
        System.out.println(whoIs + "\n" + myDriver);

        //1.l create another car and assign the same driver to this car
        System.out.println("\nInformation about the second car: ");
        Car secondCar = new Car("Volvo", "V70", 2008, "Stationcar");
        System.out.println(secondCar);

        //1.m repeat the step 1.k for the new car created in 1.l
        secondCar.setDriver(myDriver);
        System.out.println(whoIs + "\n" + myDriver);

        //alternative driver output
        secondCar.setDriver(herDriver);
        System.out.println(whoIs + "\n" + herDriver);
    }
}
