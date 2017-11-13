/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           Converter.java
 * @Date:               2017-11-11T13:23:18+01:00
 * @Last modified by:   quentin
 * @Last modified time: 2017-11-13T21:07:48+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


 package src.tools.lexer.convert;

 import java.lang.reflect.Type;
 import src.tools.print.*;
 import src.tools.lexer.*;
 import src.tools.lexer.write.*;
 import src.tools.lexer.read.*;
 import src.tools.lexer.convert.resources.*;
 import src.tools.lexer.convert.format.gson.*;
 import src.tools.lexer.scan.*;
 import src.builder.entity.resources.models.tree.*;
 import com.google.gson.Gson;
 import com.google.gson.GsonBuilder;
 import com.google.gson.reflect.*;
 import com.google.gson.JsonSyntaxException;

 public class Converter extends ALexer implements IEntityConverter {

   protected ALexer scanner = null;

   protected Format fileinstance = null;

   protected Type entity = null;

   protected GsonConverter gsontool = new GsonConverter();

   public Converter(){}

   public Converter(ALexer scan) {
     this.setScanner(scan);
     this.run();
   }

   public Converter(ALexer scan, Type entitytype) {
     this.setScanner(scan);
     this.setEntity(entitytype);
     this.run();
   }

   public boolean run() {
     if (!this.build())
      return false;
    return true;
   }

   public boolean build() {
     String format = this.getScanner().getFileinfo().getFormat();

     if (format.equals("json")) {
       if (!this.buildGson())
          return false;
       this.setResults(new ResultConverter(this.getGson()));
     }
     return false;
   }

   public boolean buildGson() {
     String type = this.getScanner().getFileinfo().getType();

     if (type.equals("Class")) {
       this.setGsonTool(new GsonConverter(this.getScanner().getFileinfo(), this.getFileinstance()));
       return true;
     }
     else if (type != null) {
       this.setGsonTool(new GsonConverter(this.getScanner().getFileinfo(), this.getScanner().getReader().getStream()));
       return true;
     }
     return false;
   }

   public GsonConverter getGson() {
    return this.getGsonTool();
   }

  public ALexer     getScanner() { return this.scanner; }

  public void       setScanner(ALexer data) { this.scanner = data; }

  public Format     getFileinstance() { return this.fileinstance; }

  public void       setFileinstance(Format data) { this.fileinstance = data; }

  public GsonConverter getGsonTool() { return this.gsontool; }

  public void       setGsonTool(GsonConverter tool) { this.gsontool = tool; }

  public ResultConverter getResults() { return this.results; }

  public void       setResults(ResultConverter tool) { this.results = tool; }

  public Type       getEntity() { return this.entity; }

  public void       setEntity(Type type) { this.entity = type; }
 }
