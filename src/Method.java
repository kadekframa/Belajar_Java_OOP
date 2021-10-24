class Method {
    // Method di Java.
    // Selain menambahkan field, kita juga bisa menambahkan method ke object.
    // Cara nya dengan mendeklarasikan method tersebut di dalam block class.
    // Sama seperti method biasanya, kita juga bisa menambahkan return value, parameter dan method overloading di method yang ada di dalam block class.
    // Untuk mengakses method tersebut, kita bisa menggunakan tanda titik(.) dan diikuti dengan nama method nya. Sama seperti mengakses field.

    // Contoh penggunaan method.

    String name;
    String address;
    final String country = "Indonesia";

    void sayHello(String paraName){
        System.out.println("Hallo " + paraName + ", My Name is " + name);
    }


}