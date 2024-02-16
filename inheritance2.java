class Vehical {
    void drive() {
        System.out.println("ramu are now drive the car");
    }
}

class car extends Vehical {
    void drive() {
        System.out.println("reparing a car");
    }

    public static void main(String[] args) {
        car c = new car();
        c.drive();
    }
}
