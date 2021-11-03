class Person {
    // Fields
    // Fields/Properties/Attributes adalah data yang bisa kita sisipkan di dalam object.
    // Namun sebelum kita bisa memasukkan data di fields, kita harus mendeklarasikan data apa saja yang dimilki oleh object tersebut di dalam class nya.
    // Membuat field sama seperti membuat variable, namun ditempatkan di block class.

    String name;
    String address;
    final String country = "Indonesia";         // final sama seperti constant di javascript.


    // Constructor
    // Saat kita membuat object, maka kita seperti memanggil sebuah method, karena kita menggunakan kurung ().
    // Di dalam class Java, kita bisa membuat constructor , constructor adalah method yang akan dipanggil saat pertama kali object dibuat.
    // Mirip seperti di Method, kita bisa memberi parameter pada constructor.
    // Nama constructor harus sama dengan nama class, dan tidak membutuhkan kata kunci void atau return value.
    // Contoh Constructor.
    Person(String paramName, String paramAddress){
        name = paramName;
        address = paramAddress;
    }

    // Constructor Overloading
    // Sama seperti method, di constructor pun kita bisa melakukan overloading.
    // Kita bisa membuat constructor lebih dari satu dengan syarat tipe data parameter harus berbeda, atau jumlah parameter harus berbeda.
    // Contoh constructor overloading.
    Person(String paramName){
        this(paramName, "Karangasem");
    }



    // Memanggil Constructor Lain.
    // Constructor bisa memanggil constructor lain.
    // Hal ini memudahkan saat kita butuh menginisialisasi data dengan berbagai kemungkinan.
    // Cara untuk memanggil constructor lain, kita hanya perlu memanggilnya seperti memanggil method, namun dengan kata kunci this.
    Person(){
        this(null);
    }


    // Method.
    // Selain menambahkan field, kita juga bisa menambahkan method ke object.
    // cara dengan mendeklarasikan method tersebut di dalam block class.
    // Sama seperti method biasanya, kita juga bisa menambahkan return value, parameter dan method overloading di method yang ada di dalam block class.
    // Untuk mengakses method tersebut, kita bisa menggunakan tanda titik (.) dan diikuti dengan nama method nya. Sama seperti mengakses field.

    void sayHello(String paramName){
        System.out.println("Hello " + paramName + ", My name is " + name);
    }


}