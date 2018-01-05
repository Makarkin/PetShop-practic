package PetShopPackage.SimulationPackage;

import PetShopPackage.Holder.HolderClass;
import PetShopPackage.StorageAndSaveDataPackage.StorageClass;
import PetShopPackage.StorageAndSaveDataPackage.ThreadSaveDataClass;
import java.util.ArrayList;

public class SimulationClassMain {

    public static void main(String[] args) throws InterruptedException {  HolderClass.readValue();
        SimulationProcess sp = new SimulationProcess();
        sp.start();
        ArrayList<Thread> alt = new ArrayList<>();
        alt.add(new ThreadSaveDataClass());
        alt.add(HolderClass.getCleaning());
        alt.add(HolderClass.getPollution());
        for (Thread t : alt) {
            t.run();
        }
    }
}



