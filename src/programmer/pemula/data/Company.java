package programmer.pemula.data;

public class Company {
    // Inner class.
    // Di Java, kita bisa membuat class di dalam class, atau disebut dengan inner class.
    // Salah satu kasus kita membuat inner class biasanya ketika kita butuh membuat beberapa class yang saling berhubungan, dimana sebuah class tidak bisa dibuat tanpa class lain.

    // Keuntungan menggunakan inner class.
    // Mengakses outer class.
    // Keuntungan saat kita membuat inner class adalah, kemampuan untuk mengakses outer class nya.
    // Inner class bisa membaca semua private member yang ada di outer class nya.
    // Untuk mengakses object outer class nya, kita bisa menggunakan nama class outer nya diikuti dengan kata kunci this, misal Company.this.
    // Dan untuk mengakses super class outer class nya, kita bisa menggunakan nama class outer nya diikuti dengan kata kunci super, misal Company.super.


    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public class Employee{                  // inner class.
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCompany(){
           return Company.this.getName();   // Contoh cara mengakses method yang ada di outer class nya employee yaitu Company class. Ini adalah keuntungan menggunakan inner class, karena dapat mengakses method ataupun field yang ada di outer class nya (bahkan private sekalipun).
        }
    }
}
