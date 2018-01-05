package PetShopPackage.AnimalsPackage;

public class Dog extends RegularAnimal {
    public enum DogBreed {
        Husky, Bulldog, Outbreed
    }

    private class DogInternalClass {
    }

    @Override
    public String getBreed() {
        return this.breed;
    }

    public Dog() {
        this.breed = DogBreed.Outbreed.toString();
        this.name = "Dog";
        this.character = "Naughty";
        this.cost = 1100;
        this.reg_markup = 5;
    }

    public Dog(String name, String character, DogBreed breed, int cost) {
        this.breed = breed.toString();
        this.name = name;
        this.character = character;
        this.cost = cost;
        this.reg_markup = 10;
    }
}
