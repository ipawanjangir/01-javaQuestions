class Rectangle {
    private double length;
    private double base;

    Rectangle(double length, double base) {
        this.length = length;
        this.base = base;
    }

    public double calculateArea() {
        return length * base;
    }

    public double calculatePerimeter() {
        return 2 * (length + base);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(25, 20);
        System.out.println("rectangle are is " + r.calculateArea());
        System.out.println("rectangle perimeter is " + r.calculatePerimeter());
    }

}
