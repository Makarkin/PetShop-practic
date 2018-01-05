package PetShopPackage.AnimalsPackage;

public class Turtle extends ExoticAnimal {

    public enum TurtleBreed {
        Sea, Land, Outbreed
    }

    private class TurtleInternalClass {
    }

    @Override
    public String getBreed() {
        return this.breed;
    }

    public Turtle() {
        this.breed = TurtleBreed.Outbreed.toString();
        this.name = "Turtle";
        this.character = "Naughty";
        this.cost = 4300;
        this.ex_markup = 55;
    }

    public Turtle(String name, String character, TurtleBreed breed, int cost) {
        this.breed = breed.toString();
        this.name = name;
        this.character = character;
        this.cost = cost;
        this.ex_markup = 55;
    }
}
