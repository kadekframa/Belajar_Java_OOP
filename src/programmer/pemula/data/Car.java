package programmer.pemula.data;

public interface Car extends HasBrand, IsMaintenance {
    // Interface.
    // Sebelumnya kita sudah tahu bahwa abstract class bisa kita gunakan sebagai kontrak untuk child nya.
    // Namun sebenarnya yang lebih tepat untuk kontrak adalah interface.
    // Jangan salah sangka bahwa interface disini bukanlah user interface.
    // Interface mirip seperti abstract class, yang membedakan adalah di interface, semua method otomatis abstract, tidak memiliki block.
    // Di interface kita tidak boleh memiliki field, kita hanya boleh memiliki constant (field yang tidak bisa diubah).
    // Untuk mewariskan interface, kita tidak menggunakan kata kunci extends, melainkan implements.


    // Interface inheritance
    // Sebelumnya kita sudah tahu kalo di Java, child class nya hanya bisa punya 1 class parent.
    // Namn berbeda dengan interface, sebuah child class bisa implement lebih dari 1 interface.
    // Bahkan interface pun bisa implement interface lain, bisa lebih dari 1. Namun jika interface ingin mewarisi interface lain, kita menggunakan kata kunci extends, bukan implements.

    void drive();

    int getTire();


    // Default method
    // Sebelumnya kita tahu bahwa di interface, kita tidak bisa membuat method konkrit yang memiliki block method.
    // Namun sejak versi Java 8, ada fitur default method di interface.
    // Fitur ini terjadi karena sulit untuk maintain kontrak interface jika sudah terlalu banyak class yang implement interface tersebut.
    // Ketika kita menambah satu method di interface, secara otomatis semua class yang implement akan rusak karena kita harus meng-override method tersebut.
    // Dengan menggunakan default method, kita bisa menambahkan konkrit method di interface.

    default boolean isBig(){    // contoh default method. Jadi dengan menggunakan default method maka pada semua class turunan car itu tidak wajib untuk meng-overrride method ini. Namun jika diperlukan boleh.
        return true;
    }



}
