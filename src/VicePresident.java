class VicePresident extends Manajer{
    // Method overidding.
    // Mendeklarasikan ulang method yang sudah ada di class parent pada class child.
    // Namun apabila sudah melakukan method overidding, maka method yang sama yang ada pada parent class sudah tidak dapat diakses dari child class karena child class sudah memiliki method tersebut.

    void sayHello(String name){
        System.out.println("Hello " + name + ", My name is Vice President " + this.name);
    }
}
