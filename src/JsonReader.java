package src;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonReader {
    public static <T> List<T> readJsonListFromFile(String filePath, TypeReference<List<T>> typeRef) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(new File(filePath), typeRef);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}