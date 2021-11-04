public class PolymorphismApp {
    public static void main(String[] args) {



        Employee employee = new Employee("Kadek");
        employee.sayHello("Budi");

        employee = new Manajer("Kadek");
        employee.sayHello("Joko");

        employee = new VicePresident("Kadek");
        employee.sayHello("Anwar");

        sayHello(new Employee("Kadek"));
        sayHello(new Manajer("Frama"));
        sayHello(new VicePresident("Danamastyana"));


    }

    // Type check & casts
    // Sebelumnya kita sudah tau cara melakukan konversi tipe data (casts) di tipe data primitif.
    // Casts juga bisa digunakan untuk tipe data bukan primitif.
    // Namun agar aman, sebelum melakukan casts, pastikan kita melakukan type check (pengecekan tipe data), dengan menggunakan kata kunci intanceof.
    // Hasil operator instanceof adalah boolean, true jika tipe data sesuai, false jika tidak sesuai.

    static void sayHello(Employee employee){
        if(employee instanceof VicePresident){                          // Proses pengecekan tipe data (type check).
            VicePresident vicePresident = (VicePresident) employee;     // Proses konversi (casts).
            System.out.println("Hello VP "  + vicePresident.name);
        }else  if(employee instanceof  Manajer){
            Manajer manajer = (Manajer) employee;
            System.out.println("Hello Manajer " + employee.name);
        }else
        System.out.println("Hello " + employee.name);
    }
}
