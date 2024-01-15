class PetShop {
    private String name;

    public PetShop(String name) {
        this.name = name;
    }

    public void sellPet(Animal pet) {
        System.out.println(name + " sells " + pet.getName() + " age is " + pet.getAge());
    }
}