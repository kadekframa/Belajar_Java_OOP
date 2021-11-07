package programmer.pemula.data;

public class ProdukApp {
    public static void main(String[] args) {


        Produk produk = new Produk("Hp pavilion gaming keren", 34000000);
        System.out.println(produk.name);
        System.out.println(produk.price);

        System.out.println(produk);

        Produk produk2 = new Produk("Hp pavilion gaming keren", 34000000);
        System.out.println("Ini true seharusnya ya: " + produk.equals(produk2));

    }
}
