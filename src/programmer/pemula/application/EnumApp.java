package programmer.pemula.application;

import programmer.pemula.data.Customer;
import programmer.pemula.data.Level;

public class EnumApp {
    public static void main(String[] args) {


        Customer customer = new Customer();     // membuat object customer.
        customer.setName("Kadek");              // mengubah / meng-set dengan method setName name.
        customer.setLevel(Level.PREMIUM);       // mengubah / meng-set dengan method setLevel level.

        System.out.println(customer.getName());                  // memanggil getName method.
        System.out.println(customer.getLevel());                 // memanggil getLevel method.
        System.out.println(customer.getLevel().getDescription());// memanggil getDescription method.

        String levelName = Level.VIP.name();        // Konversi dari Enum ke String. Dengan menggunakan method name().
        System.out.println(levelName);

        Level level = Level.valueOf("PREMIUM");     // Konversi dari String ke Enum. Dengan menggunakan method valueOf().
        System.out.println(level);

        System.out.println("");
        System.out.println("Print Level:");
        for (var value : Level.values()){           // Mengakses semua opsi enum yang ada dengan perulangan for each. Yaitu dapat menggunakan nama enum nya "Level" titik diikuti dengan method "values()".
            System.out.println(value);
        }



    }
}
