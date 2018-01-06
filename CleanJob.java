package petshop.cleanPollution;

import petshop.animals.Animal;
import petshop.holder.HolderClass;

public class CleanJob extends Thread {

    @Override
    public void run() {
        int key;
        try {
            while (true) {
                key = (int) (Math.random() * 11) + 20;
                Thread.sleep(50);
                for (Animal a : HolderClass.getHolderStorage().getAnimals()) {
                    a.setDegreeOfPollution(-key);
                }
            }
        } catch (InterruptedException e) {
        }
    }
}
