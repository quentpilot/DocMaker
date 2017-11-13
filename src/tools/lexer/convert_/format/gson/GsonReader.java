/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           GsonReader.java
 * @Date:               2017-11-11T19:28:29+01:00
 * @Last modified by:   quentin
 * @Last modified time: 2017-11-13T20:58:37+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


 package src.tools.lexer.convert.format.gson;

 import java.io.BufferedReader;
 import java.lang.reflect.Type;
 import java.util.Collection;
 import src.tools.print.*;
 import src.tools.lexer.convert.resources.*;
 import src.tools.lexer.write.*;
 import src.tools.lexer.convert.format.gson.GsonAdapter;
 import src.builder.entity.resources.models.tree.*;
 import com.google.gson.Gson;
 import com.google.gson.GsonBuilder;
 import com.google.gson.reflect.*;
 import com.google.gson.JsonSyntaxException;

 public class GsonReader {

   protected Gson gson = new Gson();

   protected GsonBuilder gsonbuilder = new GsonBuilder();

    protected Class format = null;

    protected Format result = null;

    protected BufferedReader content = null;

    protected String classname = null;

    public GsonReader() {}

    public GsonReader(Class data) {
      this.setFormat(data);
    }

    public GsonReader(Class data, BufferedReader filecontent) {
      this.setFormat(data);
      this.setContent(filecontent);
      this.convert();
    }

    public GsonReader(String classname, BufferedReader filecontent) {
      this.setClassname(classname);
      this.setContent(filecontent);
      this.convert();
    }

    public boolean convertFromModel() {
      String name = this.getClassname();
      Type token = null;
      if (name.equals("Format")) {
        token = new TypeToken<Format>() {}.getType();
      } else if (name.equals("CDatabase")) {
        token = new TypeToken<CDatabase>() {}.getType();
      } else {
        return false;
      }
      return this.convertType(token);
    }

    public boolean convertType(Type instance) {
      try{
          Format obj = this.getGson().fromJson("{\"name\":\"Dharam\"}", instance);
          this.setResult(obj);
          return true;
        } catch (JsonSyntaxException e) {
          e.printStackTrace();
          return false;
        }
    }

    public boolean convert() {
      if (this.getClassname() != null) {
        return this.convertFromModel();
      }
      try{
          Class cname = Class.forName("src.builder.entity.resources.models.tree.Format");
          //Format f = gson.fromJson("{\"name\":\"Dharam\"}", cname.class);
          Type fooType = new TypeToken<Format>() {}.getType();
          Format obj = this.getGson().fromJson("{\"name\":\"Dharam\"}", fooType);

          this.setResult(obj);
          return true;
        } catch (JsonSyntaxException | ClassNotFoundException e) {
          e.printStackTrace();
          return false;
        }
    }

    public Class getFormat() { return this.format; }

    public void setFormat(Class name) { this.format = name; }

    public Format getResult() {  return this.result; }

    public void setResult(Format data) { this.result = data; }

    public BufferedReader getContent() {  return this.content; }

    public void setContent(BufferedReader data) { this.content = data; }

    public Gson getGson() { return this.gson; }

    public void setGson(Gson converter) { this.gson = converter; }

    public GsonBuilder getGsonbuilder() { return this.gsonbuilder; }

    public void setGsonbuilder(GsonBuilder converter) { this.gsonbuilder = converter; }

    public String getClassname() { return this.classname; }

    public void setClassname(String name) { this.classname = name; }
 }
