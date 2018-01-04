package PetShopPackage.StorageAndSaveDataPackage;

import PetShopPackage.Holder.HolderClass;

public class ThreadSaveDataClass extends Thread {

    @Override
    public void run() {
        boolean b = true;
        int i = 0;
        try {
            while (b) {
                Thread.sleep(1000);
                i++;
                HolderClass.getData_saving().writeValue(HolderClass.getHolder_storage());
                if (HolderClass.getHolder_storage().getStorage().size() == 0  || i > 10) b = false;
            }
        } catch (InterruptedException e) {
        }
    }

}
