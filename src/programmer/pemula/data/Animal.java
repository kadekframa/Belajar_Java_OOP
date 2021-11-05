package programmer.pemula.data;

public abstract class Animal {
    // Abstract method.
    // saat kita membuat class yang abstract, kita bisa membuat abstract method juga di dalam class abstract tersebut.
    // Saat kita membuat sebuah abstract method, kita tidak boleh membuat block method untuk method tersebut.
    // artinya, abstract method wajib di override di class child.
    // abstract method tidak boleh memiliki access modifier private.

    public String name;

    public abstract void run();         // contoh abstract method.

}
