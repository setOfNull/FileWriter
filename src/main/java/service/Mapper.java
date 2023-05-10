package service;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Cat;

public class Mapper {
ObjectMapper objectMapper = new ObjectMapper();

public Cat[] getModels(String json) throws JsonProcessingException {
    return objectMapper.readValue(json, Cat[].class);
}
}
