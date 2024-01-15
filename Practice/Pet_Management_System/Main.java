public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("BulDog", 12,"Robin");
        Cat cat = new Cat("Kitty", 2,"Joe");
        Fish fish = new Fish("Pangas", 1,"Karim");

        dog.eat();
        cat.eat();
        fish.eat();

        dog.makeSound();


        PetShop petShop = new PetShop("Rajshahi Pet");
        AnimalCare animalCare=new AnimalCare();
        PetService petService=new PetService();

        petShop.sellPet(dog);
        petShop.sellPet(cat);
        petShop.sellPet(fish);

        animalCare.takeCareOfAnimal(dog);
        animalCare.takeCareOfAnimal(cat);
        animalCare.takeCareOfAnimal(fish);


        petService.provideService(dog, "Cleaning");
        petService.provideService(cat, "Treatment");
        petService.provideService(fish,"give food");
    }
}