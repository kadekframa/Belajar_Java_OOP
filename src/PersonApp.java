public class PersonApp {
    public static void main(String[] args) {
        // Membuat Object
        // Object adalah hasil instansiasi dari sebuah class.
        // Untuk membuat object kita bisa menggunakan kata kunci new, dan diikuti dengan nama class dan kurung ().

        // Contoh object
        var person1 = new Person();     // Object person1

        Person person2 = new Person();  // Object person2

        Person person3;                 // Object person3
        person3 = new Person();


        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}
