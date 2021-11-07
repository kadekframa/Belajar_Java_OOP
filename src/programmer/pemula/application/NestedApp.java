package programmer.pemula.application;

import programmer.pemula.data.Company;

public class NestedApp {
    public static void main(String[] args) {


        Company company = new Company();            // membuat object company dari Class company.
        company.setName("Programmer Pemula");       // merubah field name pada class company.

        Company.Employee employee = company.new Employee();     // membuat object employee (inner class).
        employee.setName("Kadek Frama");                        // merubah data field name pada inner class.

        System.out.println("employee name: " + employee.getName());     // mengakses method getName() pada inner class.
        System.out.println("company name: " + employee.getCompany());   // mengakses method getCompany() pada inner clas.
        System.out.println("");


        Company company2 = new Company();               // membuat object company2 dari class Company.
        company2.setName("Programmer Tetap Semangat");

        Company.Employee employee2 = company2.new Employee();       // membuat object employee2 dari inner class (Employee).
        employee2.setName("Frama Danamastyana");

        System.out.println("Nama employee tetap semangat: " + employee2.getName());     // mengakses method getName() pada inner class.
        System.out.println("Nama Company: " + employee2.getCompany());                  // mengakses method getCompany() pada inner class.


    }
}
