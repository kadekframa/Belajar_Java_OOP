package programmer.pemula.data;

// Record Class.
// Fitur ini masih versi preview dan belum stabil di versi Java 15, namun kita sudah bisa mencobanya.
// Tapi perlu diingat, bahwa karena fitur ini masih experimental, artinya tidak ada jaminan di versi Java mendatang, fitur ini akan tetap ada, bisa saja dihilangkan.

// Kadang kita sering membuat class, hanya untuk class yang berisikan data. Hanya berisi getter, equals, hashcode, dan toString method.
// Record class digunakan untuk mempermudah pembuatan jenis class tersebut.
// Saat kita membuat record class, secara otomatis Java akan membuatkan getter, equals, hashCode dan toString method secara otomatis, dan juga constructor secara otomatis.
// Saat ,e,biat record class, secara kita akan meng-extends class java.lang.Record, yang artinya kita tidak bisa extends class lain. Namun kita tetap bisa meng-implement interface.

public record LoginRequest(String username, String password) {      // constructor nya langsung disini (record class).

    // Record class constructor.
    // Secara default, constructor di record class akan dibuat secara otomatis, sesuai dengan definisi record class parameter.
    // Namun jika kita ingin melakukan sesuatu di constructor tersebut, kita bisa membuat compact constructor, yaitu constuctor tanpa tanda ().
    // Selain itu, kta juga bisa melakukan constructor overloading, namum ada syaratnya, yaitu constructor overloading nya harus tetap memanggil constructor utama yang secara otomatis dibuatkan di record class.

    public LoginRequest{                                    // membuat compact constructor. Jadi ketika constructor di record class dipanggil, compact constructor ini akan dieksekusi.
        System.out.println("Membuat object LoginRequest");
    }

    public LoginRequest(String username){
        this(username, "");
    }

    public LoginRequest(){
        this("", "");
    }




    // Kesimpulan: Java record ini memang dikhususkan untuk menyimpan data. Dan data nya itu imutable (kekal) tidak bisa berubah.
}
