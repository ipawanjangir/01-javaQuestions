class Animal {
    public void Sound() {
        System.out.println("animal are cry ");
    }
}

class Bird extends Animal {
    public void Sound() {
        System.out.println("bird are make sound chi chi");
    }
}

class Cat extends Animal {
    public void Sound() {
        System.out.println("cat are make sound mau mau");
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        a.Sound();

        Bird b = new Bird();
        b.Sound();

        Cat c = new Cat();
        c.Sound();
    }
}
