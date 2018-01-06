package petshop.animals;

public class Cat extends RegularAnimal {

    public enum CatBreed {
        Persian, Siberian, Outbreed
    }

    private class CatInternalClass {
    }

    @Override
    public String getBreed() {
        return this.breed;
    }

    public Cat() {
        this.breed = CatBreed.Outbreed.toString();
        this.name = "Cat";
        this.character = "Naughty";
        this.cost = 1000;
        this.regMarkup = 10;
    }

    public Cat(String name, String character, CatBreed breed, int cost) {
        this.breed = breed.toString();
        this.name = name;
        this.character = character;
        this.cost = cost;
        this.regMarkup = 10;
    }
}
