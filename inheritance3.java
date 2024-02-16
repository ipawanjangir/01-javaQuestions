// class Shape {
//     double getArea() {
//         return 0.0;
//     }
// }

// class rectangle extends Shape {

//     private double length;
//     private double base;

//     public rectangle(double length, double base) {
//         this.length = length;
//         this.base = base;
//     }

//     public double getArea() {
//         return length * base;
//     }

//     public static void main(String[] args) {
//         rectangle r = new rectangle(10.0, 7.0);
//         double area = r.getArea();
//         System.out.println(area);
//     }
// }

class Shape {
    public double getArea() {
        return 0.0;
    }
}

class rectangle extends Shape {
    double length;
    double base;

    public rectangle(double length, double base) {
        this.length = length;
        this.base = base;
    }

    public double getArea() {
        return length * base;
    }

    public static void main(String[] args) {
        rectangle r = new rectangle(12.0, 11.0);
        double area = r.getArea();
        System.out.println(area);
    }
}