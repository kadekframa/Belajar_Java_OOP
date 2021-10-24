public class Object {
    public static void main(String[] args) {
        // Object di Java.
        // Object adalah hasil instansiasi dari sebuah class.
        // Untuk membuat object kita bisa menggunakan kata kunci new, dan diikuti dengan nama class dan kurung "()".

        // Contoh penggunaan object.
        var person1 = new Method();              // Mendeklarasikan object person1 untuk menampung class Method().
        person1.name = "Kadek Frama";            // Jadi cukup dengan menggunakan "." (titik) dan diikuti dengan nama field nya untuk dapat mengubah field dari suatu object.
        person1.address = "Bali";
//        person1.country = "Indonesia";  // error

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Kadek");      // Memanggil method sayHello() yang ada di class Method.

        Person person2 = new Person();

        Method person3;
        person3 = new Method();                  // Mendeklarasikan object person3 untuk menampung class method().
        person3.sayHello("test");       // Memanggil method sayHello() yang ada di class Method.
/*
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);*/

    }

}