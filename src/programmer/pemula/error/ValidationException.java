package programmer.pemula.error;

public class ValidationException extends Throwable{
    // Exception.
    // Saat kita membuat aplikasi, kita tidak akan terhindar dengan yang namanya error.
    // Di Java, error direpresentasikan dengan istilah exception, dan semua direpresentasikan dalam bentuk class exception.
    // Kita bisa menggunakan class exception sendiri, atau menggunakan yang sudah disediakan oleh Java.
    // Jika kita ingin membuat exception, maka kita harus membuat class yang extends class Throwable atau turunan-turunannya.

    private String message;

    public ValidationException(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
