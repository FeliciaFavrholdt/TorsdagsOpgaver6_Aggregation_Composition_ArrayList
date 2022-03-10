package task3;

import java.util.ArrayList;

public class Main {
    //3.c Create an arraylist
    public static ArrayList<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {

        //create customers
        Customer customerOne = new Customer("Hans", "Hansen", "HHtrorHanerSej");
        Customer customerTwo = new Customer("Erik", "Madsen", "EM_n0oo00b");
        Customer customerThree = new Customer("Sofie", "Nielsen", "Snuske124");
        Customer customerFour = new Customer("Kim", "Lange","LongOneK");
        Customer customerFive = new Customer("Molly", "Persson", "MollyP2000");
        Customer customerSix = new Customer("Jasper", "Knudsen", "Guy1074");

        //add customers to arraylist
        customers.add(customerOne);
        customers.add(customerTwo);
        customers.add(customerThree);
        customers.add(customerFour);
        customers.add(customerFive);
        customers.add(customerSix);

        //3.d test output of method
        printCustomers();

    }

    //3.d - create method to print customers
    public static void printCustomers() {
        for (Customer c: customers) {
            System.out.println(c);
        }
    }
}
