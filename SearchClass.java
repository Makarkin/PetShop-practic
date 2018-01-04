package PetShopPackage.SearchPackage;

import PetShopPackage.AnimalsPackage.Animal;
import PetShopPackage.Holder.HolderClass;

import java.util.List;

public class SearchClass {

    private List<Animal> search_res;

    public void searchName(String name) {
        List<Animal> search_tmp = HolderClass.getHolder_storage().getStorage();
        for (Animal a : search_tmp) {
            if (name.equals(a.getName())) {
                search_res.add(a);
            }
        }

        System.out.println("Results of search by name: +/n" + search_res.toString());
    }

    public void searchCharacter(String name) {
        List<Animal> search_tmp = HolderClass.getHolder_storage().getStorage();
        for (Animal a : search_tmp) {
            if (name.equals(a.getCharacter())) {
                search_res.add(a);
            }
        }

        System.out.println("Results of search by character: +/n" + search_res.toString());
    }

    public void searchCost(int cost) {
        List<Animal> search_tmp = HolderClass.getHolder_storage().getStorage();
        for (Animal a : search_tmp) {
            if (cost == (a.getCost())) {
                search_res.add(a);
            }
        }

        System.out.println("Results of search by cost: +/n" + search_res.toString());
    }

    public void Search(String breedName) {
        List<Animal> search_tmp = HolderClass.getHolder_storage().getStorage();
        for (Animal a : search_tmp) {
            if (breedName == (a.getBreed())) {
                search_res.add(a);
            }
        }

        System.out.println("Results of search by breed: +/n" + search_res.toString());
    }

    public SearchClass() {
    }
}
