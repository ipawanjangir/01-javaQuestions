class Employee {
    public double calculateSalary() {
        return 0.0;
    }
}

class Manager extends Employee {
    private double salary;
    private double new_salary;

    public Manager(double salary, double new_salary) {
        this.salary = salary;
        this.new_salary = new_salary;
    }

    public double calculateSalary() {
        return new_salary - salary;
    }
}

class Programer extends Employee {
    private double salary;
    private double new_salary;

    public Programer(double salary, double new_salary) {
        this.salary = salary;
        this.new_salary = new_salary;
    }

    @Override
    public double calculateSalary() {
        return new_salary - salary;
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.calculateSalary();

        Manager m = new Manager(10000, 12000);
        System.out.println(m.calculateSalary());

        Programer p = new Programer(8000, 10000);
        System.out.println(p.calculateSalary());
    }
}
