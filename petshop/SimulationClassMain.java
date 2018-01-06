package petshop.simulation;

import petshop.holder.HolderClass;
import petshop.storage.ThreadSaveDataClass;
import java.util.ArrayList;

public class SimulationClassMain {

    public static void main(String[] args) throws InterruptedException {
        SimulationProcess sp = new SimulationProcess();
        sp.start();
        ArrayList<Thread> alt = new ArrayList<>();
        alt.add(new ThreadSaveDataClass());
        alt.add(HolderClass.getCleaning());
        alt.add(HolderClass.getPollution());
        for (Thread t : alt) {
            t.start();
        }
    }
}



