package programmer.pemula.application;

import programmer.pemula.data.Produk;

public class Application {
    public static void main(String[] args) {

        Produk produk = new Produk("macbook pro", 30000000);
        System.out.println(produk.name);
        System.out.println(produk.price);

    }
}
