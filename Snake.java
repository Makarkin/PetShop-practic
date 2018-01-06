package petshop.animals;

public class Snake extends ExoticAnimal {

    public enum SnakeBreed {
        Cobra, Viper, Outbreed
    }

    private class SnakeInternalClass {
    }

    @Override
    public String getBreed() {
        return this.breed;
    }

    public Snake() {
        this.breed = SnakeBreed.Outbreed.toString();
        this.name = "Snake";
        this.character = "Naughty";
        this.cost = 5000;
        this.exMarkup = 50;
    }

    public Snake(String name, String character, SnakeBreed breed, int cost) {
        this.breed = breed.toString();
        this.name = name;
        this.character = character;
        this.cost = cost;
        this.exMarkup = 50;
    }
}
