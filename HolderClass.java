package PetShopPackage.Holder;

import PetShopPackage.CleanAndPollutionPackage.CleanJob;
import PetShopPackage.CleanAndPollutionPackage.PolutionJob;
import PetShopPackage.SearchPackage.SearchClass;
import PetShopPackage.SellBuyAndPrintPackage.PrintClass;
import PetShopPackage.SellBuyAndPrintPackage.SellBuyClass;
import PetShopPackage.SimulationPackage.SimulationProcess;
import PetShopPackage.StorageAndSaveDataPackage.SaveDataClass;
import PetShopPackage.StorageAndSaveDataPackage.StorageClass;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.IOException;

public class HolderClass {
    private static StorageClass holder_storage;
    private static SellBuyClass sell_buy;
    private static SearchClass searching;
    private static SimulationProcess simulation;
    private static SaveDataClass data_saving;
    private static PrintClass printing;
    private static CleanJob cleaning;
    private static PolutionJob pollution;

    public static StorageClass getHolder_storage() {
        if (holder_storage == null) {
            holder_storage = new StorageClass();
            return holder_storage;
        } else {
            return holder_storage;
        }
    }

    public static void setHolder_storage(StorageClass input_holder_storage) {
        if (holder_storage == null) {
            holder_storage = input_holder_storage;
        }
    }

    public static SellBuyClass getSell_buy() {
        if (sell_buy == null) {
            sell_buy = new SellBuyClass();
            return sell_buy;
        } else {
            return sell_buy;
        }
    }

    public static SearchClass getSearching() {
        if (searching == null) {
            searching = new SearchClass();
            return searching;
        } else {
            return searching;
        }
    }

    public static SimulationProcess getSimulation() {
        if (simulation == null) {
            simulation = new SimulationProcess();
            return simulation;
        } else {
            return simulation;
        }
    }

    public static SaveDataClass getData_saving() {
        if (data_saving == null) {
            data_saving = new SaveDataClass();
            return data_saving;
        } else {
            return data_saving;
        }
    }

    public static PrintClass getPrinting() {
        if (printing == null) {
            printing = new PrintClass();
            return printing;
        } else {
            return printing;
        }
    }

    public static CleanJob getCleaning() {
          if (cleaning == null) {
            cleaning = new CleanJob();
            return cleaning;
        } else {
            return cleaning;
        }
    }

    public static PolutionJob getPollution() {
        if (pollution == null) {
            pollution = new PolutionJob();
            return pollution;
        } else {
            return pollution;
        }
    }

    public static void readValue() {
        ObjectMapper mapper = new ObjectMapper();
        String filepath = "D:\\Storage.txt";
        try {
            StorageClass s = mapper.readValue(new FileInputStream(filepath), StorageClass.class);
            HolderClass.setHolder_storage(s);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
