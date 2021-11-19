package programmer.pemula.data;

// Enum class.
// Saat kita membuat aplikasi, kadang kita akan bertemu dengan jenis-jenis data yang nilainya terbatas.
// Misal, gender, ada male dan female. Atau tipe customer, ada standard, premium atau vip dan lain-lain.
// Dalam kasus seperti ini, kita bisa menggunakan enum classm yaitu class yang berisikan nilai terbatas yang sudah ditentukan.
// Saat membuat enum class, secara otomatis dia akan meng-extends class java.lang.Enum, oleh karena itu class enum tidak bisa extends class lain, namun masih tetap bisa implements interface.

// Enum Members.
// Sama seperti class biasanya, di class enum pun bisa menambahkan members (field, method dan constructor)
// Khusus constructor, kita tidak bisa membuat public constructor, karena memang tujuan enum bukan untuk di instansiasi secara bebas.

public enum Level {
    STANDARD("Standard Level"),
    PREMIUM("Premium Level"),
    VIP("VIP Level");

    private String description;

    Level(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
