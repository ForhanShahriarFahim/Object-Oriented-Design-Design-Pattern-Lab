import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the first pet: ");
        String pet1Name = scanner.nextLine();
        System.out.print("Enter the age of the first pet: ");
        int pet1Age = Integer.parseInt(scanner.nextLine().trim());
        System.out.print("Enter the color of the first pet: ");
        String pet1Color = scanner.nextLine();
        System.out.print("Enter the type of the first pet: ");
        String pet1Type = scanner.nextLine();
        System.out.print("Enter the owner's name of the first pet: ");
        String pet1OwnerName = scanner.nextLine();
        System.out.print("Enter the owner's phone number of the first pet: ");
        String pet1OwnerPhoneNo = scanner.nextLine();
        Pet newPet1 = new Pet(pet1Name, pet1Age, pet1Color, pet1Type, pet1OwnerName, pet1OwnerPhoneNo);

        System.out.print("Enter the name of the second pet: ");
        String pet2Name = scanner.nextLine();
        System.out.print("Enter the age of the second pet: ");
        int pet2Age = Integer.parseInt(scanner.nextLine().trim());
        System.out.print("Enter the color of the second pet: ");
        String pet2Color = scanner.nextLine();
        System.out.print("Enter the type of the second pet: ");
        String pet2Type = scanner.nextLine();
        System.out.print("Enter the owner's name of the second pet: ");
        String pet2OwnerName = scanner.nextLine();
        System.out.print("Enter the owner's phone number of the second pet: ");
        String pet2OwnerPhoneNo = scanner.nextLine();
        Pet newPet2 = new Pet(pet2Name, pet2Age, pet2Color, pet2Type, pet2OwnerName, pet2OwnerPhoneNo);

        Management Management = new Management();

        Management.addPet(newPet1);
        Management.petStatus(newPet1);

        Management.addPet(newPet2);
        Management.feedPet(newPet2);

        Management.getOwnerInfo(newPet2);

        List<Pet> petList = Management.getPets();

        for (Pet petItem : petList) {
            System.out.println("Pet Name: " + petItem.name);
            System.out.println("Pet Color: " + petItem.color);
            System.out.println("Pet Age: " + petItem.age);
            System.out.println("Pet Type: " + petItem.type);
            System.out.println("Pet Owner: " + petItem.petOwner.petOwnerName);
            System.out.println("Pet Owner Contact: " + petItem.petOwner.petOwnerPhoneNumber);
            System.out.println();
        }

        scanner.close(); // Close the scanner when done.
    }
}
