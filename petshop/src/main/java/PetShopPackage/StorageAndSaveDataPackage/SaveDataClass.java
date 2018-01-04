package PetShopPackage.StorageAndSaveDataPackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;

public class SaveDataClass {

    public void writeValue(StorageClass storage) {
        ObjectMapper mapper = new ObjectMapper();
        try (FileWriter fw = new FileWriter("D:\\Storage.txt" , true)) {
            fw.write("\r\n");
            mapper.writeValue(fw, storage);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
