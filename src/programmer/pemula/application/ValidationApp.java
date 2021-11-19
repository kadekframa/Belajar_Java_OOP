package programmer.pemula.application;

import programmer.pemula.data.LoginRequest;
import programmer.pemula.error.ValidationException;
import programmer.pemula.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        // Try Catch.
        // Saat kita memanggil sebuah function yang bisa menyebabkan exception, maka kita wajib menggunakan try-catch expression di Java.
        // Ini gunanya agar kita bisa menangkap exception yang terjadi, karena jika tidak ditangkap, lalu terjadi exception, maka secara otomatis program kita akan berhenti.
        // Cara menggunakan try-catch expression di java sangat mudah, di block try, kita tinggal panggil method yang bisa menyebabkan exception, dan di block catch, kita bisa melakukan sesuatu jika terjadi exception.

        LoginRequest loginRequest = new LoginRequest("kadek", "secret");

        try {                                           // membuat try-catch untuk mengatasi exception di Java. Try-catch ini berfungsi untuk menangkap exception yang kemungkinan bisa terjadi pada sebuah method.
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        }catch (ValidationException exception){
            System.out.println("Data tidak valid : " + exception.getMessage());
        }


    }
}
