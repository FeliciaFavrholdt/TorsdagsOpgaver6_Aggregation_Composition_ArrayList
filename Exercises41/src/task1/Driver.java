package task1;

//1.a - create private fields
public class Driver {
    private String name;
    private int age;

    //1.b - create a constructor for class Driver
    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //1.g - override and give new return output
    @Override
    public String toString() {
        return "The car is driven by "+ name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
