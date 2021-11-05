class Parent {
    String name;
    void doIt(){
        System.out.println("Do it in Parent");
    }
}

class Child extends Parent{
    String name;
    void doIt() {
        System.out.println("Do it in Child " + super.name);
    }
}
