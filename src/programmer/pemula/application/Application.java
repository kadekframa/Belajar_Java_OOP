package programmer.pemula.application;

import programmer.pemula.data.*;        // Dengan menggunakan tanda bintang (*), kita dapat melakukan import semua class yang ada di packages programmer.pemula.data. Jadi lebih mudah untuk melakukan import.

public class Application {
    public static void main(String[] args) {

        Produk produk = new Produk("macbook pro", 30000000);
        System.out.println(produk.name);
        System.out.println(produk.price);

        Data data = new Data();

    }
}
