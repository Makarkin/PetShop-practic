package PetShopPackage.SellBuyAndPrintPackage;

import PetShopPackage.AnimalsPackage.Animal;
import PetShopPackage.Holder.HolderClass;

public class SellBuyClass {

    public void buy(Animal animal) {
        String operationName = "buy";
        HolderClass.getHolder_storage().getStorage().add(animal);
        HolderClass.getPrinting().printForOperations(animal, operationName);
    }

    public void sell(Animal animal) {
        String operationName = "sell";
        boolean b = false;
        for (Animal a: HolderClass.getHolder_storage().getStorage()) {
            if (a.getClass().equals(animal.getClass())) {
                b = true; break;
            }
        }
        if (b) {
            HolderClass.getHolder_storage().getStorage().remove(animal);
            HolderClass.getPrinting().printForOperations(animal, operationName);
        }
    }
}
