package programmer.pemula.error;

public class DatabaseError extends Error{
    // Error.
    // Error adalah jenis exception yang terakhir.
    // Biasanya error terjadi ketika ada masalah serius, dan sangat tidak direkomendasikan untuk di try catch.
    // Artinya, direkomendasikan untuk mematikan aplikasi.
    // Contoh, misal jika diawal aplikasi kita tidak bisa terkoneksi ke database, direkomendasikan untuk membuat exception jenis error, dan menghentikan aplikasi.


    public  DatabaseError(String message){      // membuat constructor DatabaseErorr.
        super(message);                         // meng-override super constructor Error pada class parent Error.
    }

}
