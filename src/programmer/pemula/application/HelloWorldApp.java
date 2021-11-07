package programmer.pemula.application;

import programmer.pemula.data.HelloWorld;

public class HelloWorldApp {
    public static void main(String[] args) {
        // Anonymous Class.
        // Anonymous class atau class tanpa nama.
        // adalah kemampuan mendeklarasikan sebuah clas, sekaligus meng-instansiasi object nya secara langsung.
        // Anonymous class sebenarnya termasuk inner class, dimana outer class nya adalah tempat dimana kita membuat anonymous class nya.
        // Annonymous class sangat cocok ketika kita berhadapan dengan kasus membuat implementasi interface atau abstract class sederhana, tanpa harus membuat implmentasinya.

        HelloWorld english = new HelloWorld() {     // membuat anonymous class sekaligus dengan object nya. (Dalam hal ini object nya adalah english).
            public void sayHello() {                // meng-override method sayHello();
                System.out.println("Hello");
            }

            public void sayHello(String name) {     // meng-override method sayHello() dengan parameter;
                System.out.println("Hello " + name);
            }
        };

        HelloWorld indonesia = new HelloWorld() {
            public void sayHello() {                // meng-override method sayHello();
                System.out.println("Hallo");
            }

            public void sayHello(String name) {     // meng-override method sayHello() dengan parameter;
                System.out.println("Hallo " + name);
            }
        };

        english.sayHello();                         // memanggil method sayHello pada object english.
        english.sayHello("Kadek Frama");      // memanggil method sayHello dengan parameter pada object english.

        indonesia.sayHello();                       // memanggil method sayHello pada object indonesia.
        indonesia.sayHello("Kadek Frama");    // memanggil method sayHello dengan parameter pada object indonesia.
    }
}
