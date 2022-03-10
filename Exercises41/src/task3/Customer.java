package task3;

public class Customer {

    //3.a create fields
    private String firstName;
    private String lastName;
    private String username;
    private int id;

    //3.b add constructor & getters
    public Customer(String firstName, String lastName, String username){
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public int getId() {
        return id;
    }

    //3.b - override and give new return output
    @Override
    public String toString() {
        return "The firstname is: " + firstName + "\nThe lastname is: " + lastName + "\nThe username is: " + username + "\nThe ID is: " + id;
    }
}
