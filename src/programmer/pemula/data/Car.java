package programmer.pemula.data;

public interface Car {
    // Interface.
    // Sebelumnya kita sudah tahu bahwa abstract class bisa kita gunakan sebagai kontrak untuk child nya.
    // Namun sebenarnya yang lebih tepat untuk kontrak adalah interface.
    // Jangan salah sangka bahwa interface disini bukanlah user interface.
    // Interface mirip seperti abstract class, yang membedakan adalah di interface, semua method otomatis abstract, tidak memiliki block.
    // Di interface kita tidak boleh memiliki field, kita hanya boleh memiliki constant (field yang tidak bisa diubah).
    // Untuk mewariskan interface, kita tidak menggunakan kata kunci extends, melainkan implements.

    void drive();

    int getTire();

}
