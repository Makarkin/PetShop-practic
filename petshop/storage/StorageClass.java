package petshop.storage;

import petshop.animals.Animal;

import java.util.List;

public class StorageClass {

    private List<Animal> animals;

    public void setAnimals(List<Animal> list) {

        this.animals = list;
    }

    public List<Animal> getAnimals() {

        return animals;
    }
}
