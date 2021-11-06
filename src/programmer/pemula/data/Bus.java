package programmer.pemula.data;

public class Bus implements Car {       // class bus turunan dari interface Car.

    @Override
    public void drive() {
        System.out.println("Bus Drive");
    }

    @Override
    public int getTire() {
        return 8;
    }

    @Override
    public String getBrand() {
        return "Hino";
    }

    @Override
    public boolean isMaintenanca() {
        return true;
    }


    public boolean isBig() {
        return Car.super.isBig();       // mengakses method default yang ada pada interface Car.
    }
}
