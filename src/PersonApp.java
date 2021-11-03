public class PersonApp {
    public static void main(String[] args) {
        // Membuat Object
        // Object adalah hasil instansiasi dari sebuah class.
        // Untuk membuat object kita bisa menggunakan kata kunci new, dan diikuti dengan nama class dan kurung ().

        // Contoh object
        var person1 = new Person("Kadekframa", "Badung");     // memanggil constructor. Constructor adalah method yang pertama kali dipanggil ketika sebuah object dibuat.


        Person person2 = new Person("budi");  // Object person2

        Person person3;                 // Object person3
        person3 = new Person();
        person3.name = "Joko";


        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Kadek");
        person3.sayHello("Kadek");      // karena person3 belum dideklarasikan maka nilai nya adalah null.
    }
}
