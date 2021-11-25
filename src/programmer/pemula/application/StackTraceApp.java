package programmer.pemula.application;

public class StackTraceApp {
    public static void main(String[] args) {
        // StackTraceElement.
        // Throwable memiliki method yang bernama getStackTrace(), dimana menghasilkan Array dari StackTraceElement object.
        // StackTraceElement berisikan informasi tentang, class, file bahkan baris lokasi terjadinya error.
        // Class StackTraceElement ini sangat penting untuk menelusuri lokasi kejadian error yang terjadi.
        // Cara yang paling mudah, kita bisa memanggil method printStackTrace() class Throwable, untuk memprint ke console detail error Stack TraceElement nya.

        try {
            String[] names ={
                    "Kadek", "Frama", "Danamastyana"
            };
            System.out.println(names[2]);         // Ini akan menghasilkan error karena index yang dipanggil adalah index ke 100. Tetapi jumlah index yang pada object names hanya berjumlah 3 index.
        }catch (Throwable throwable){
            StackTraceElement[] stackTraceElement = throwable.getStackTrace();

            throwable.printStackTrace();            // NB: Jadi StackTraceElement ini dapat digunakan untuk mengetahui penyebab error, lokasi error bahkan akan ditunjukan di line berapa tepatnya terjadi error.
        }

    }
}
