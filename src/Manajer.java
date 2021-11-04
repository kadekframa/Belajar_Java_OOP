class Manajer extends Employee {
    // Inheritance.
    // Inheritance atau pewarisan adalah kemampuan untuk menurunkan sebuah class ke class lain.
    // Dalam artian, kita bisa membuat class Parent dan class Child.
    // Class Child, hanya punya satu class Parent, namun satu class Parent bisa punya banyak class Child.
    // Saat sebuah class diturunkan, maka semua field dan method yang ada di class  Parent, secara otomatis akan dimiliki oleh class child.
    // Untuk melakukan pewarisan, di class child, kita harus menggunakan kata kunci extends lalu diikuti dengan nama class parent nya.

    String company;

    Manajer(String name){                       // constructor Manajer degan satu parameter.
        super(name);
    }

    Manajer(String name, String company){       // membuat constructor Manajer.
        super(name);
        this.company = company;
    }

    void sayHello(String name){
        System.out.println("Hello " + name + ", My name is Manajer " + this.name);
    }



}
