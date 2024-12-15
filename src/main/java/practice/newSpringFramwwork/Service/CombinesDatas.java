package practice.newSpringFramwwork.Service;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CombinesDatas implements ICombinesDatas{
    private ObjectMapper objectMapper = new ObjectMapper();

    public <T> T getDatas(String json, Class <T> clase ){
        try{
            return objectMapper.readValue(json, clase);
        }catch (JacksonException e){
            throw new RuntimeException(e);
        }
    }
}
