class Cat extends Animal {
    private String owner;
    public Cat(String name, int age,String owner) {
        super(name, age);
        this.owner = owner;
    }
    public void makeSound() {
        System.out.println(getName() + " meows.");
    }

    public void scratch() {
        System.out.println(getName() + " is scratching.");
    }
}