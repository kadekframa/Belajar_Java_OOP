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


        // Finally Keyword.
        // Dalam try-catch, kita bisa menambahkan block finally.
        // Block finally ini adalah block dimana akan selalu dieksekusi baik terjadi exception ataupun tidak.
        // Ini sangat cocok ketika kita ingin melakukan sesuatu, tidak peduli sukses ataupun gagal, misal di blcok try kita ingin membaca file, di block catch kita akan tangkap jika terjadi error dan di block finally error ataupun sukses membaca file, kita wajib menutup koneksi ke file tersebut, biar tidak menggantung di memory.


        LoginRequest loginRequest = new LoginRequest("", "secret");

        try {                                           // membuat try-catch untuk mengatasi exception di Java. Try-catch ini berfungsi untuk menangkap exception yang kemungkinan bisa terjadi pada sebuah method.
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid, Tetap Semangat");
        }catch (ValidationException | NullPointerException exception){              // Cara mudah dan simple untuk membuat multiple catch untuk menangkap exception.
            System.out.println("Telah terjadi error:" + exception.getMessage());
        }finally {
            System.out.println("Selalu dieksekusi !, Tetap Semangat !!!");
        }



        // RuntimeException.

        LoginRequest loginRequest2 = new LoginRequest(null,null);
        ValidationUtil.validateRuntime(loginRequest2);
        System.out.println("Semangat");

        // NB: Walaupun runtime exception tidak wajib di try-catch, tapi ada baiknya kita tetap melakukan try-catch.
        // Karena jika terjadi runtime exception, yang ditakutkan adalah program kita berhenti.
        // Untuk mengetahui penggunaan lebih lanjut dari runtime exception, selanjutnya dapat mempelajari error handling dari framework atau library yang akan digunakan.


    }
}