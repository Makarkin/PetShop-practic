package petshop.animals;

public abstract class RegularAnimal extends AbstractAnimal {

    protected int regMarkup;

    public int getRegMarkup() {
        return regMarkup;
    }

    public void setRegMarkup(int reg_markup) {
        this.regMarkup = reg_markup;
    }

    @Override
    public int getCost() {
        return this.cost + regMarkup;
    }
}
