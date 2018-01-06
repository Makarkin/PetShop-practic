package petshop.animals;

public abstract class AbstractAnimal implements Animal {
    protected String breed;
    protected String name;
    protected String character;
    protected int cost;
    protected Integer degreeOfPollution = 0;

    @Override
    public String getBreed() {
        return this.breed;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getCharacter() {
        return this.character;
    }

    @Override
    public int getDegreeOfPollution() {
        return this.degreeOfPollution;
    }

    public void setDegreeOfPollution(int i) {
        this.degreeOfPollution += i;
        if (this.degreeOfPollution < 0) {
            this.degreeOfPollution = 0;
        } else if (this.degreeOfPollution > 100) {
            this.degreeOfPollution = 100;
        }
    }

    @Override
    public int getCost() {
        return this.cost;
    }
}
