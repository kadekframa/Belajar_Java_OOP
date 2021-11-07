package programmer.pemula.application;

import programmer.pemula.data.Application;
import programmer.pemula.data.Constant;
import programmer.pemula.data.Country;
import programmer.pemula.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {

        System.out.println(Constant.APPLICATION);       // mengakses field static.
        System.out.println(Constant.VERSION);           // mengakses field static.

        System.out.println("Hasil penjumlahan yaitu adalah: " + MathUtil.sum(1,2,3,4,5));    // mengakses method sum() pada class MathUtil.

        Country.City city = new Country.City();     // membuat object dengan inner class City.
        city.setName("Badung");                     // merubah data pada field name yang ada di City.

        System.out.println(city.getName());         // memanggil method getName().

        System.out.println(Application.PROCESSORS);

    }
}
