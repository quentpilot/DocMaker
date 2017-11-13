/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           GsonAdapter.java
 * @Date:               2017-11-13T19:53:23+01:00
 * @Last modified by:   quentin
 * @Last modified time: 2017-11-13T20:05:58+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


 package src.tools.lexer.convert.format.gson;

 import java.lang.InstantiationException;
 import java.lang.reflect.*;
 import java.lang.reflect.Type;
 import src.tools.print.*;
 import src.tools.lexer.convert.format.gson.*;
 import src.builder.entity.resources.models.tree.*;
 import src.builder.entity.resources.models.filer.*;
 import src.tools.lexer.convert.resources.*;
 import src.builder.entity.resources.models.tree.*;
 import com.google.gson.Gson;
 import com.google.gson.*;
 import com.google.gson.GsonBuilder;
 import com.google.gson.reflect.*;
 import com.google.gson.JsonSyntaxException;
 import java.lang.reflect.Type;
 import com.google.gson.JsonArray;
 import com.google.gson.JsonDeserializationContext;
 import com.google.gson.JsonDeserializer;
 import com.google.gson.JsonSerializationContext;
 import com.google.gson.JsonSerializer;
 import com.google.gson.JsonElement;
 import com.google.gson.JsonObject;
 import com.google.gson.JsonParseException;


 public class GsonAdapter implements JsonDeserializer {

   private static final String CLASSNAME = "CLASSNAME";
    private static final String DATA = "DATA";

    public Format deserialize(JsonElement jsonElement, Type type,
        JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {

        JsonObject jsonObject = jsonElement.getAsJsonObject();
        JsonPrimitive prim = (JsonPrimitive) jsonObject.get(CLASSNAME);
        String className = prim.getAsString();
        Class klass = getObjectClass(className);
            return jsonDeserializationContext.deserialize(jsonObject.get(DATA), klass);
        }
        public JsonElement serialize(Format jsonElement, Type type, JsonSerializationContext jsonSerializationContext) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty(CLASSNAME, jsonElement.getClass().getName());
            jsonObject.add(DATA, jsonSerializationContext.serialize(jsonElement));
            return jsonObject;
        }
    /****** Helper method to get the className of the object to be deserialized *****/
        public Class getObjectClass(String className) {
            try {
                return Class.forName(className);
                } catch (ClassNotFoundException e) {
                    //e.printStackTrace();
                    throw new JsonParseException(e.getMessage());
                }
        }
    }
