class VicePresident extends Manajer{
    // Method overidding.
    // Mendeklarasikan ulang method yang sudah ada di class parent pada class child.
    // Namun apabila sudah melakukan method overidding, maka method yang sama yang ada pada parent class sudah tidak dapat diakses dari child class karena child class sudah memiliki method tersebut.

    void sayHello(String name){
        System.out.println("Hello " + name + ", My name is Vice President " + this.name);
    }


    // super constructor.
    // Tidak hanya untuk mengakses method atau field yang ada di parent class, kata kunci super juga bisa digunakan untuk mengakses constructor.
    // Namun syaratnya untuk mengakses parent class constructor, kita harus mengaksesnya di dalam class child constructor.
    // Jika sebuah class parent tidak memiliki constructor yang tidak ada parameter nya (tidak memilki default consructor), maka class child wajib mengakses constructor class parent tersebut. NB: default constructor adalah constructor yang tidak memilki parameter atau tanpa parameter.

    VicePresident(String  name){
        super(name, null);          // Penggunaan kata kunci super, yang digunakan untuk mengakses constructor (yang ada pada parent class) dari class child.
    }
}
