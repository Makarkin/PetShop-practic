package PetShopPackage.SimulationPackage;

import PetShopPackage.AnimalsPackage.*;
import PetShopPackage.Holder.HolderClass;

import java.util.Random;

public class SimulationProcess {

    public void start() throws InterruptedException {
        boolean b = true;
        int i = 0;
        while (b) {
            if (HolderClass.getHolder_storage().getStorage().size() == 0) {
                System.out.println("Storage is empty!");
                b = false;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int key = new Random().nextInt(80);
            int code = new Random().nextInt(10);
            switch (code) {
                case 4:
                    if (key <= 20) {
                        HolderClass.getSell_buy().buy(new Cat());
                        i++;
                        break;
                    } else if (key > 20 && key <= 40) {
                        HolderClass.getSell_buy().buy(new Dog());
                        i++;
                        break;
                    } else if (key > 40 && key <= 60) {
                        HolderClass.getSell_buy().buy(new Snake());
                        i++;
                        break;
                    } else if (key > 60) {
                        HolderClass.getSell_buy().buy(new Turtle());
                        i++;
                        break;
                    }
                case 5:
                    if (key <= 20) {
                        Cat o = new Cat();
                        if (HolderClass.getHolder_storage().getStorage().contains(o)) {
                            HolderClass.getSell_buy().sell(new Cat());
                        }
                        i++;
                        break;
                    } else if (key > 20 && key <= 40) {
                        HolderClass.getSell_buy().sell(new Dog());
                        i++;
                        break;
                    } else if (key > 40 && key <= 60) {
                        HolderClass.getSell_buy().sell(new Snake());
                        i++;
                        break;
                    } else if (key > 60) {
                        HolderClass.getSell_buy().sell(new Turtle());
                        i++;
                        break;
                    }
                case 0:
                    if (HolderClass.getHolder_storage().getStorage().size() > 0) {
                        HolderClass.getHolder_storage().getStorage().remove(0);
                        System.out.println("Animal was run!");
                        i++;
                        break;
                    }
            }

            if (i > 10) {
                b = false;
            }
        }
    }
}

