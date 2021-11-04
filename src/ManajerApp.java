public class ManajerApp {
    public static void main(String[] args) {


        var manajer = new Manajer("Kadek");        // membuat object baru yaitu manajer dari class Parent Manajer.
        manajer.name = "Kadek";
        manajer.sayHello("Joko");
        manajer.sayHello("tedst");


        var vp = new VicePresident("Joko");       // membuat object vp dari class child VicePresident.
//        vp.name = "Budi Doremi";            // mengakses field yang ada pada class Parent. Dalam hal ini class VicePresident adalah sebagai class child, sedangkan class Manajer adalah sebagai class Parent nya.
        vp.sayHello("Kunto");         // Jadi semua field dan method yang berada di class Parent dapat diakses di class child.

        vp.sayHello("anak magang");

    }
}
