
class Fish extends Animal {
    private String owner;
    public Fish(String name, int age,String owner) {
        super(name, age);
        this.owner = owner;
    }

    public void makeSound() {
        System.out.println(getName() + " does not make a sound.");
    }

    public void swim() {
        System.out.println(getName() + " is swimming.");
    }
}