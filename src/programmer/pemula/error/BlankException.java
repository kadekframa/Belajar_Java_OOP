package programmer.pemula.error;

public class BlankException extends RuntimeException{
    // Jenis Exception.
    // Secara garis besar,di java, exception dibagi menjadi 3 jenis, yaitu:
    /*
    -   Checked Exception, yaitu exceptio yang wajib di try catch, seperti yan sudah kita bahas sebelumnya.
    -   Runtime Exception, dan
    -   Error (yang akan kita bahaas di materi selanjutnya).
     */

    // Runtime Exception.
    // Runtime Exception adalah jenis exception yang tidak wajib di tangkap menggunakan try catch.
    // Kompiler Java tidak akan protes walaupun kita tidak menggunakan try catch ketika kita memanggil method yang bisa menyebabkan runtime exception.
    // Untuk membuat class runtime exception, kita wajib meng-exctends class RuntimeException.
    // Ada banuak di Java yang merupakan runtime exception, seperti NullPointerException, IllegalArgumentException, dan lain-lain.


    public BlankException (String message){
        super(message);
    }



}
