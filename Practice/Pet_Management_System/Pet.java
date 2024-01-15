class Pet extends Animal{
    private String owner;

    public Pet(String name, int age, String owner) {
        super(name, age);
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }
}