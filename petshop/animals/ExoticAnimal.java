package petshop.animals;

public abstract class ExoticAnimal extends AbstractAnimal {

    protected int exMarkup;

    public int getExMarkup() {
        return exMarkup;
    }

    public void setExMarkup(int ex_markup) {
        this.exMarkup = ex_markup;
    }

    @Override
    public int getCost() {
        return this.cost + this.cost/100* exMarkup;
    }
}
