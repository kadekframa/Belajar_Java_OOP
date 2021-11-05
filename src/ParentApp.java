public class ParentApp {
    public static void main(String[] args) {


        Child child = new Child();
        child.name = "Frama";
        child.doIt();
        System.out.println(child.name);

        Parent parent = (Parent) child;     // konversi (casts) dari object child menjadi parent.
        parent.doIt();
        System.out.println(parent.name);    // variable hiding.

    }
}
