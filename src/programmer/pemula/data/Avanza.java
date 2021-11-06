package programmer.pemula.data;

public class Avanza implements Car, IsMaintenance{     // untuk melakukan pewarisan dari interface, itu dapat menggunakan kata kunci implements pada child class nya.

    // Pada child class dari interface itu wajib harus meng-override semua method yang ada di interface atau parent nya.

    public void drive() {
        System.out.println("Avanza Drive");
    }

    public int getTire() {
        return 4;
    }

    public String getBrand(){
        return "Toyota";
    }

    public boolean isMaintenanca() {
        return true;
    }
}
