package application.Tool;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Common {
    private  static ObjectMapper objectMapper = new ObjectMapper();

    public static String getJsonData(Object obj) throws JsonProcessingException {
        return objectMapper.writeValueAsString(obj);
    }

}
