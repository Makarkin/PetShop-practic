package PetShopPackage.StorageAndSaveDataPackage;

import PetShopPackage.AnimalsPackage.Animal;
import java.util.List;

public class StorageClass {

    private List<Animal> storage;

    public void setStorage(List<Animal> list) {

        this.storage = list;
    }

    public List<Animal> getStorage() {

        return storage;
    }
}
