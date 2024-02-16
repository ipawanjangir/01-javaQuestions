class Vehical {
    public void SpeedUp() {
        System.out.println("vwhical are spped limit 100 Kmph");
    }
}

class car extends Vehical {
    public void SpeedUp() {
        System.out.println("car speed limit is 80 kmph");
    }
}

class Bike extends Vehical {
    public void SpeedUp() {
        System.out.println("bike speed limit is 100 kmph");
    }

    public static void main(String[] args) {
        Vehical c = new Vehical();
        c.SpeedUp();

        car c1 = new car();
        c1.SpeedUp();

        Bike b = new Bike();
        b.SpeedUp();

    }
}