package programmer.pemula.data;

public class Produk {
    // Access Modifier.
    // Access Modifier adalah kemampuan membuat class, field, method dan constructor dapat diakses dari mana saja.
    // Sebelumnya teman-teman sudah melihat 2 access modifier, yaitu public dan default (no modifier).
    // Sekarang kita akan bahas access modifier lainnya.
    /**
     * Access modifier:
     * - public         // public itu dapat diakses dari mana saja.
     * - protected      // protected itu hanya dapat diakses dari class nya sendiri, package yang sama dan class turunan nya (subclass).
     * - no modifier    // default (no modifier) itu hanya dapat diakses dari class itu sendiri dan packages yang sama.
     * - private        // private itu hanya bisa diakses dari kelas itu sendiri.
     */

    public String name;
    public int price;

    public Produk(String name, int price){
        this.name = name;
        this.price = price;
    }


    // ToString Method
    // toString() adalah method yang terdapat di class object.
    // Method ini biasanya digunakan untuk merepresentasikan object dalam bentuk String.
    // Secara default, toString() ini akan menghasilkan:
    //      namaclass + @ + hashcode.
    // Namun kita bisa mengubahnya jika kita mau, agar object yang kita buat lebih mudah dibaca.

    public String toString(){               // method toString().
        return "Produk name: " + name + ", price: " + price;
    }

    @Override
    public boolean equals(Object o) {       // method equals().
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Produk produk = (Produk) o;

        if (price != produk.price) return false;
        return name != null ? name.equals(produk.name) : produk.name == null;
    }

    //    public boolean equals(Object o){
//        if (o == this){
//            return true;
//        }
//
//        if(!(o instanceof Produk)) {
//            return false;
//        }
//
//        Produk produk = (Produk) o;
//
//        if (this.price != produk.price){
//            return false;
//        }
//
//        if (this.name != null){
//            return this.name.equals(produk.name);
//        }else {
//            return produk.name == null;
//        }
//
//    }


}