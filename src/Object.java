public class Object {
    public static void main(String[] args) {
        // Object di Java.
        // Object adalah hasil instansiasi dari sebuah class.
        // Untuk membuat object kita bisa menggunakan kata kunci new, dan diikuti dengan nama class dan kurung "()".

        // Contoh penggunaan object.
        var person1 = new Field();
        person1.name = "Kadek";                     // Jadi cukup dengan menggunakan "." (titik) dan diikuti dengan nama field nya untuk dapat mengubah field dari suatu object.
        person1.address = "Bali";
//        person1.country = "Indonesia";  // error

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        Person person2 = new Person();

        Person person3;
        person3 = new Person();
/*
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);*/

    }

}