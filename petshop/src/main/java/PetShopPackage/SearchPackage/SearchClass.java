package PetShopPackage.SearchPackage;

import PetShopPackage.AnimalsPackage.Animal;
import PetShopPackage.Holder.HolderClass;

import java.util.List;

public class SearchClass {

      public void search(int cost, String...input_strings) {
        List<Animal> search_tmp = HolderClass.getHolder_storage().getStorage();
        search_tmp.stream().filter(s-> Arrays.asList(input_strings).contains(s.getName()) |
                Arrays.asList(input_strings).contains(s.getBreed()) |
                Arrays.asList(input_strings).contains(s.getCharacter()) &&
                s.getCost() <= cost).forEach(s -> System.out.println("Results of search: " + s));
    }

    public SearchClass() {
    }
}
