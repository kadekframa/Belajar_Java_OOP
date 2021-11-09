package programmer.pemula.application;

import programmer.pemula.data.Customer;
import programmer.pemula.data.Level;

public class EnumApp {
    public static void main(String[] args) {


        Customer customer = new Customer();
        customer.setName("Kadek");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());



    }
}
