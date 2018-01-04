package PetShopPackage.AnimalsPackage;

public abstract class ExoticAnimal extends AbstractAnimal {

    protected int ex_markup;

    public int getEx_markup() {
        return ex_markup;
    }

    public void setEx_markup(int ex_markup) {
        this.ex_markup = ex_markup;
    }

    @Override
    public int getCost() {
        return this.cost + this.cost/100*ex_markup;
    }
}
