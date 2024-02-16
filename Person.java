class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Person p = new Person("pawan jangir", 23);
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}
