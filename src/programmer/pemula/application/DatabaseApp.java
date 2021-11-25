package programmer.pemula.application;

import programmer.pemula.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("kadek", null);
        System.out.println("Sukses");
    }

    public static void connectDatabase(String username, String password){       // membuat static method connectDatabase.
        if (username == null || password == null){
            throw new DatabaseError("Tidak Bisa Connect ke Database");          // membuat exception jenis error untuk mengehentikan aplikasi jika kondisi terjadi error.
        }
    }
}
