package programmer.pemula.data;

class SocialMedia {
    String name;
}


class  Facebook extends SocialMedia{
    // Final Method.
    // Kata kunci final juga bisa digunakan di method.
    // Jika sebuah method kita tambahkan kata kunci final, maka artinya method tersebut tidak bisa di override lagi di class child nya.
    // Ini sangat cocok jika kita ingin mengunci implementasi dari sebuah method agar tidak bisa diubah lagi oleh class child nya.

    final void login(String username, String password){     // final method.

    }

}


class FakeFacebook extends Facebook{
//    void login(String username, String password){       // ERROR, method login tidak bisak di override di class childnya, karena method pada parent class sudah final method.
//
//    }
}
