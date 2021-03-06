package programmer.pemula.application;

import programmer.pemula.data.Avanza;
import programmer.pemula.data.Bus;
import programmer.pemula.data.Car;

public class CarApp {
    public static void main(String[] args) {

        Car car = new Avanza();             // membuat object dengan polymorphism.
        car.drive();                        // memanggil method drive() yang ada di class Avanza.
        System.out.println(car.getTire());  // memanggil method getTire() yang ada di class Avanza.

        System.out.println(car.getBrand());
        System.out.println(car.isMaintenanca());

        Car bus = new Bus();                // membuat object bus.
        System.out.println("Ini Bus punya: " + bus.isBig());
    }
}


// Idealnya untuk membuat kontrak sebaiknya menggunakan interface, jangan menggunakan abstract class (lebih direkomendasikan).