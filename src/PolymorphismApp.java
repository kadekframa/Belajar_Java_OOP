public class PolymorphismApp {
    public static void main(String[] args) {



        Employee employee = new Employee("Kadek");
        employee.sayHello("Budi");

        employee = new Manajer("Kadek");
        employee.sayHello("Joko");

        employee = new VicePresident("Kadek");
        employee.sayHello("Anwar");

        sayHello(new Employee("Kadek"));
        sayHello(new Manajer("Frama"));
        sayHello(new VicePresident("Danamastyana"));


    }

    static void sayHello(Employee employee){
        System.out.println("Hello " + employee.name);
    }
}
