class Animal {
    void makeSound() {
        System.out.println("cat sount create mau mau");
    }
}

class cat extends Animal {
    void makeSound() {
        System.out.println("cat sound create mm mm mm");
    }

    public static void main(String[] args) {
        cat c = new cat();
        c.makeSound();

        Animal a = new Animal();
        a.makeSound();
    }
}