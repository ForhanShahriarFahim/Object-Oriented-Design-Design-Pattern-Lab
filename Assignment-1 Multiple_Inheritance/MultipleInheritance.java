
interface Animal {
    void eat();
    void sleep();
}


interface Bird {
    void fly();
    void sing();
}

// Concrete class implementing both interfaces
class Sparrow implements Animal, Bird {
    @Override
    public void eat() {
        System.out.println("Sparrow is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Sparrow is sleeping.");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying.");
    }

    @Override
    public void sing() {
        System.out.println("Sparrow is singing.");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();

        // Calling methods from both interfaces
        sparrow.eat();
        sparrow.sleep();
        sparrow.fly();
        sparrow.sing();
    }
}
