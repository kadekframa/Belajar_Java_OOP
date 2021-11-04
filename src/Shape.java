class Shape {

    int getCorner(){
        return 0;
    }

}

// super keyword.
// Kadang kita ingin mengakses method yang terdapat di class parent yang sudah terlanjur kita override di class child.
// Untuk mengakses method milik class parent, kita bisa menggunakan kata kunci super.
// Sederhanya, super digunakan mengakses class parent.
// Tidak hanya method, field milik parent class pun bisa kita akses menggunakan kata kunci super.

class Rectangle extends Shape{          // membuat class child rectangle dengan parent childnya yaitu class Shape.

    int getCorner(){                // membuat method overidding.
        return 4;
    }

    int getParentCorner(){
        return super.getCorner();   // menggunakan kata kunci super untuk mengakses method yang ada pada parent class Shape.
    }

}
