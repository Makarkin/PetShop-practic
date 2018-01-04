package PetShopPackage.CleanAndPollutionPackage;

import PetShopPackage.AnimalsPackage.AbstractAnimal;
import PetShopPackage.AnimalsPackage.Animal;
import PetShopPackage.Holder.HolderClass;

public class PolutionJob extends Thread {

    @Override
    public void run() {
        int key;
        int i = 0;
        try {
            while (i < 20) {
                key = (int) (Math.random() * 11) + 20;
                Thread.sleep(50);
                for (Animal a : HolderClass.getHolder_storage().getStorage()) {
                    a = (AbstractAnimal) a;
                    a.setDegreeOfPollution(key);
                    i++;
                }
            }
        } catch (InterruptedException e) {
        }
    }
}
