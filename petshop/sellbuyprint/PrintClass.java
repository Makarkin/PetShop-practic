package petshop.sellbuyprint;

import petshop.animals.Animal;

public class PrintClass {

    public void printForOperations(Animal animal, String operationName) {
        if ("sell".equals(operationName)) {
            System.out.printf("Shop sold an %s. Its breed is %s\n", animal.getName().toString(), animal.getBreed());
        } else if ("buy".equals(operationName)) {
            System.out.printf("Shop bought an  %s. Its breed is %s\n", animal.getName().toString(), animal.getBreed());
        }
    }
}
