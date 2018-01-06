package petshop.fileswork;

import com.fasterxml.jackson.databind.ObjectMapper;
import petshop.holder.HolderClass;
import petshop.storage.StorageClass;

import java.io.*;

public class WorkDataClass {

    public void writeValue(StorageClass storage) {
        ObjectMapper mapper = new ObjectMapper();
        try (FileWriter fw = new FileWriter("D:\\Storage.txt", true)) {
            fw.write("\r\n");
            mapper.writeValue(fw, storage);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
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
