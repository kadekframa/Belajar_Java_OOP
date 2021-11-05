package programmer.pemula.application;

import programmer.pemula.data.Animal;
import programmer.pemula.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {

        Animal animal = new Cat();
        animal.name = "Puss";
        animal.run();

    }
}
