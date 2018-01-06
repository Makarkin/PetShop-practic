package petshop.search;

import petshop.animals.Animal;
import petshop.holder.HolderClass;
import java.util.List;
import java.util.stream.Collectors;

public class SearchClass {

    public List<Animal> searchByName(String name) {
        List<Animal> searchTmp = HolderClass.getHolderStorage().getAnimals();
         List<Animal> resultList = searchTmp.stream()
                 .filter(animal -> animal.getName().equals(name))
                 .collect(Collectors.toList());
        return resultList;
    }

    public List<Animal> searchByCost(int cost) {
        List<Animal> searchTmp = HolderClass.getHolderStorage().getAnimals();
        List<Animal> resultList = searchTmp.stream()
                .filter(animal -> animal.getCost() <= cost)
                .collect(Collectors.toList());
        return resultList;
    }

    public List<Animal> searchByBreed(String breed) {
        List<Animal> searchTmp = HolderClass.getHolderStorage().getAnimals();
        List<Animal> resultList = searchTmp.stream()
                .filter(animal -> animal.getBreed().equals(breed))
                .collect(Collectors.toList());
        return resultList;
    }

    public List<Animal> searchByCharacter(String character) {
        List<Animal> searchTmp = HolderClass.getHolderStorage().getAnimals();
        List<Animal> resultList = searchTmp.stream()
                .filter(animal -> animal.getCharacter().equals(character))
                .collect(Collectors.toList());
        return resultList;
    }

    public SearchClass() {
    }
}
