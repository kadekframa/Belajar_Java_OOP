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


    // hashCode Method.
    // Method hashcode adalah method representasi integer objet kita, mirip method toString yang merupakan representasi String, hashCode adalah representasi integer.
    // Hashcode sangat bermanfaat untuk membuat struktur data unique seperti hashmap, set dan lain-lain, karena cukup menggunakan hashCode method untuk mendapatkan identitas unique object kita.
    // Secara default hashCode akan mengembalikan nilai integer sesuai data di memory, namun kita bisa meng-override nya jika kita ingin.

    // Kontrak HashCode Method.
    // Tidak mudah meng-override method hashCode, karena ada kontraknya :
    /**
     * - Sebanyak apapun hashCode dipanggil, untuk object yang sama, harus menghasilkan data integer yang sama.
     * - Jika ada 2 object yang sama jika dibandingkan menggunakan method equals, maka nilai hashCode nya juga harus sama.
     * - Tidak wajib hashCode berbeda jika method equals menghasilkan false, karena memang keterbatasan jumlah integer sekitar 2 milyar.
     */
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }


    @Override
    public boolean equals(Object o) {
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