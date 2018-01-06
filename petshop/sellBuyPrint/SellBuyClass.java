package petshop.sellBuyPrint;

import petshop.animals.Animal;
import petshop.holder.HolderClass;

public class SellBuyClass {

    public void buy(Animal animal) {
        String operationName = "buy";
        HolderClass.getHolderStorage().getAnimals().add(animal);
        HolderClass.getPrinting().printForOperations(animal, operationName);
    }

    public void sell(Animal animal) {
        String operationName = "sell";
        if (HolderClass.getHolderStorage().getAnimals().contains(animal)) {
            HolderClass.getHolderStorage().getAnimals().remove(animal);
            HolderClass.getPrinting().printForOperations(animal, operationName);
        }
    }
}
