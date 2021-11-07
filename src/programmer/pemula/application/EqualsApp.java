package programmer.pemula.application;

public class EqualsApp {
    public static void main(String[] args) {
        // Equals method.
        // Hal yang agak membingungkan di Java adalah, cara membandingkan object.
        // Di bahasa pemrograman lain, untuk mengecek apakah object sama, biasanya menggunakan operator ==, di Java, operator == hanya untuk mengecek data primitif.
        // Untuk non primitif pengecekan nya menggunakan menthod equals.
        // Dan secara default, method equals itu akan membandingkan dua buah object secara kesamaan posisi object di memory, artinya jika kita membuat 2 object yang isi fieldnya sama, tetap dianggap beda oleh method equals.
        // Oleh karena itu, ada baiknya kita meng-override method equals milik class Object tersebut. Sangat direkomendasikan untuk meng-override method equals().

        String first = "Kadek";
        first = first + " " + "Frama";

        System.out.println(first);

        String second = "Kadek Frama";
        System.out.println(second);

        System.out.println(first.equals(second));

        String third = "Kadek Frama";

        System.out.println(second == third);
        System.out.println(second.equals(third));



    }
}
