package PetShopPackage.SimulationPackage;

import PetShopPackage.Holder.HolderClass;
import PetShopPackage.StorageAndSaveDataPackage.StorageClass;
import PetShopPackage.StorageAndSaveDataPackage.ThreadSaveDataClass;
import java.util.ArrayList;

public class SimulationClassMain {

    public static void main(String[] args) throws InterruptedException {
        StorageClass s = HolderClass.getHolder_storage();
        HolderClass.readValue();
        System.out.println(HolderClass.getHolder_storage().getStorage());
        Thread g = new ThreadSaveDataClass();
        SimulationProcess sp = new SimulationProcess();
        sp.start();
        g.run();

        ArrayList<Thread> alt = new ArrayList<>();
        alt.add(new ThreadSaveDataClass());
        alt.add(HolderClass.getCleaning());
        alt.add(HolderClass.getPollution());
        for (Thread t: alt) {
            t.run();
        }
    }
}



