package utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

import static org.testng.Assert.fail;

public final class JsonUtils {
    private JsonUtils() {
    }

    public static <T> T objectFromJson(String json, Class<T> clazz) {
        T object;
        try {
            object = new Gson().fromJson(json, clazz);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return object;
    }

    public static String objectToJson(Object o) {
        return new Gson().toJson(o);
    }

    public static String mapObjectToJsonUsingJackson(Object objectToMap) {
        return mapObjectToJsonUsingJackson(objectToMap, null);
    }

    public static String mapObjectToJsonUsingJackson(Object objectToMap, JsonInclude.Include serializationInclusion) {
        ObjectMapper objectMapper = new ObjectMapper();
        if (serializationInclusion != null) {
            objectMapper.setSerializationInclusion(serializationInclusion);
        }
        try {
            return objectMapper.writeValueAsString(objectToMap);
        } catch (JsonProcessingException exception) {
            throw new RuntimeException(exception);
        }
    }

    /**
     * Saves json object to file with using pretty printing.
     *
     * @param srcObject Json object.
     * @param fileName  File name.
     */
    public static void saveObjectAsJsonToFile(Object srcObject, String fileName) {
        GsonBuilder builder = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping();
        Gson gson = builder.create();

        File details = new File(fileName);
        try (BufferedWriter detailsWriter = new BufferedWriter(new FileWriter(details))) {
            gson.toJson(srcObject, detailsWriter);
        } catch (IOException e) {
            fail("Error saving to file: " + e.getMessage());
        }
    }

    public static <T> T mapJsonToObject(String json, Class<T> objectClass) {
        return mapJsonToObject(json, objectClass, JsonMappers.JACKSON_2);
    }

    public static <T> T mapJsonToObject(String json, Class<T> objectClass, JsonMappers mapper) {
        switch (mapper) {
            case JACKSON_2:
                return mapJsonToObjectUsingJackson(json, objectClass);
            case GSON:
                return objectFromJson(json, objectClass);
            default:
                throw new RuntimeException("unable to use the following JSON mapper: " + mapper);
        }
    }

    public static String mapToJsonString(Object object) {
        return mapToJsonString(object, false);
    }

    public static String mapToJsonString(Object object, boolean areNullFieldsIgnored) {
        JsonInclude.Include serializationInclusion = areNullFieldsIgnored
                ? JsonInclude.Include.NON_NULL
                : null;
        return mapObjectToJsonUsingJackson(object, serializationInclusion);
    }

    private static <T> T mapJsonToObjectUsingJackson(String json, Class<T> objectClass) {
        try {
            return new ObjectMapper().readValue(json, objectClass);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static JsonNode mapToJsonTree(String jsonString) {
        try {
            return new ObjectMapper().readTree(jsonString);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public enum JsonMappers {
        JACKSON_2,
        GSON
    }

    public static Set<String> getJsonFieldNames(Object object) {
        return mapJsonToObject(mapObjectToJsonUsingJackson(object), HashMap.class).keySet();
    }
}
