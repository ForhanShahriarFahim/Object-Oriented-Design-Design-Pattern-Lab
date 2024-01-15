public class Dog extends Animal {
    private String owner;
    public Dog(String name, int age,String owner) {
        super(name, age);
        this.owner = owner;
    }

     public void makeSound() {
         System.out.println(getName() + " barks.");
     }

    // public void fetch() {
    //     System.out.println(getName() + " is fetching a ball.");
    // }
}