package programmer.pemula.data;

public class Category {
    // Getter dan Setter.
    // Encapsulation artinya memastikan data sensitif sebuah object tersembunyi dari akses luar.
    // Hal ini bertujuan agar kita bisa menjaga agar data sebuah object tetap baik dan valid.
    // Untuk mencapai ini, biasanya kita akan membuat semua field menggunakan access modifier private, sehingga tidak bisa diakses atau diubah dari luar.
    // Agar bisa diubah, kita akan menyediakan method untuk mengubah dan mendapatkan field tersebut yaitu menggunakan getter dan setter.

    /** Tipe data       Getter method       Setter method
     * - boolean :      isXxx()             setXxxx(boolean value)
     * - primitif:      getXxxx()           setXxx(primitif value)
     * - object  :      getXxx()            setXxx(Object value)
     */


    private String id;
    private boolean expensive;

    public String getId() {             // membuat method getter String id.
        return id;
    }

    public void setId(String id) {      // membuat method setter id.
        if (id != null){            // membuat validasi agar id tidak sama dengan null.
            this.id = id;
        }

    }

    public boolean isExpensive() {      // membuat method getter boolean expensive.
        return expensive;
    }

    public void setExpensive(boolean expensive) {   // membuat method setter boolean expensive.
        this.expensive = expensive;
    }

    // NB:
    // Kegunaan membuat getter dan setter yaitu agar tidak ada orang yang mengakses langsung field yang ada di object nya.
}
