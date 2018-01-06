package petshop.fileswork;

import petshop.holder.HolderClass;

public class ThreadSaveDataClass extends Thread {

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(10000);
                HolderClass.getDataSaving().writeValue(HolderClass.getHolderStorage());
            }
        } catch (InterruptedException e) {
        }
    }

}
