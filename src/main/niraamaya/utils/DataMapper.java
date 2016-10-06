package niraamaya.utils;


import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class DataMapper {


    public <T> T map(String dataFileToMap, Class<T> classToMap) throws FileNotFoundException {
        Gson gson = new Gson();
        T object = gson.fromJson(new FileReader(new File(dataFileToMap)), classToMap);
        return object;
    }




}
