package petshop.holder;

import petshop.cleanPollution.CleanJob;
import petshop.cleanPollution.PolutionJob;
import petshop.search.SearchClass;
import petshop.sellBuyPrint.PrintClass;
import petshop.sellBuyPrint.SellBuyClass;
import petshop.simulation.SimulationProcess;
import petshop.storage.SaveDataClass;
import petshop.storage.StorageClass;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.FileInputStream;
import java.io.IOException;

public class HolderClass {
    private static StorageClass holderStorage;
    private static SellBuyClass sellBuy;
    private static SearchClass searching;
    private static SimulationProcess simulation;
    private static SaveDataClass dataSaving;
    private static PrintClass printing;
    private static CleanJob cleaning;
    private static PolutionJob pollution;

    public static StorageClass getHolderStorage() {
        if (holderStorage == null) {
            readValue();
            return holderStorage;
        } else {
            return holderStorage;
        }
    }

    public static void setHolderStorage(StorageClass holderStorage) {
        if (HolderClass.holderStorage == null) {
            HolderClass.holderStorage = holderStorage;
        }
    }

    public static SellBuyClass getSellBuy() {
        if (sellBuy == null) {
            sellBuy = new SellBuyClass();
            return sellBuy;
        } else {
            return sellBuy;
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

    public static SaveDataClass getDataSaving() {
        if (dataSaving == null) {
            dataSaving = new SaveDataClass();
            return dataSaving;
        } else {
            return dataSaving;
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
            HolderClass.setHolderStorage(s);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
