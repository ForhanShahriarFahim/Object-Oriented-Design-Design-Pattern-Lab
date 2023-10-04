import java.util.*;

public class Pet implements PetAnimal {
    public String name;
    public int age;
    public String color;
    public String type;
    public PetOwner petOwner = new PetOwner();

    public Pet(String name, int age, String color, String type, String ownerName, String ownerPhoneNo)
    {
        this.name = name;
        this.age = age;
        this.color = color;
        this.type = type;
        petOwner.petOwnerName = ownerName;
        petOwner.petOwnerPhoneNumber = ownerPhoneNo;
    }

    @Override
    public void eat()
    {
        System.out.println(this.name+" is eating.");
    }

    @Override
    public void run()
    {
        System.out.println(this.name+" is running.");
    }

    @Override
    public void speak()
    {
        Map<String, String> scores = new HashMap<>();
        scores.put("cow", "moo");
        scores.put("dog", "ghew");
        scores.put("bird", "chirp");
        scores.put("cat", "meaw");
        scores.put("pigs", "onik");
        System.out.println(this.name+" says "+scores.get(this.type));
    }

    @Override
    public void activity()
    {
        Random random = new Random();
        int index = random.nextInt(5);
        String[] activities = {"sleeping", "eating", "running", "walking", "seating"};
        System.out.println(this.name+" is "+activities[index]);
    }
}