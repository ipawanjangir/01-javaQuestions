class Dog {
    private String name;
    private String breed;

    Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String string) {
        this.name = name;
    }

    public void setBreed() {
        this.breed = breed;
    }

    public static void main(String[] args) {
        Dog d = new Dog("shera", "germany");

        System.out.println(d.name);
        System.out.println(d.breed);

    }

}
