package PetShopPackage.AnimalsPackage;

public abstract class RegularAnimal extends AbstractAnimal {

    protected int reg_markup;

    public int getReg_markup() {
        return reg_markup;
    }

    public void setReg_markup(int reg_markup) {
        this.reg_markup = reg_markup;
    }

    @Override
    public int getCost() {
        return this.cost + reg_markup;
    }
}
