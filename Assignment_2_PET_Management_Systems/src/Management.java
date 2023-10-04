import java.util.ArrayList;
import java.util.List;

public class Management {
    private List<Pet> pets = new ArrayList<>();
    public void addPet(Pet pet)
    {
        this.pets.add(pet);
    }

    public void removePet(Pet pet)
    {
        int index = -1;
        for(Pet p : this.pets)
        {
            if(p.name==pet.name && p.type==pet.type)
            {
                index++;
                break;
            }
        }
        pets.remove(index);
        System.out.println(pet.name + " is removed.");
    }

    public void feedPet(Pet pet)
    {
        pet.eat();
    }

    public void petStatus(Pet pet)
    {
        pet.activity();
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void getOwnerInfo(Pet pet)
    {
        System.out.println("Owner Name : "+pet.petOwner.petOwnerName);
        System.out.println("Owner Phone No : "+pet.petOwner.petOwnerPhoneNumber);
    }
}