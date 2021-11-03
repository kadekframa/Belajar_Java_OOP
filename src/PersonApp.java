public class PersonApp {
    public static void main(String[] args) {
        // Membuat Object
        // Object adalah hasil instansiasi dari sebuah class.
        // Untuk membuat object kita bisa menggunakan kata kunci new, dan diikuti dengan nama class dan kurung ().

        // Contoh object
        var person1 = new Person();     // Object person1
        person1.name = "Kadek Frama";                       // memanipulasi field pada sebuah object dapat dilakukan dengan menggunakan kata kunci titik ".". Yaitu dengan nama object diikuti dengan titik "." dan diikuti dengan nama field nya.
        person1.address = "Badung, Bali";
//        person1.country = "Tidak Bisa Diubah";            // field country tidak bisa diubah, karena sudah bersifat final.

        Person person2 = new Person();  // Object person2

        Person person3;                 // Object person3
        person3 = new Person();


        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);
    }
}
