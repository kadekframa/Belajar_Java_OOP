package programmer.pemula.util;

public class MathUtil {

    public static int sum(int... values){   // membuat method argument static.
        int total = 0;
        for (var value : values){       // for each.
            total += value;
        }
        return total;
    }
}