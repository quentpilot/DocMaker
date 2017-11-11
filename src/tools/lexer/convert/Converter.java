/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           Converter.java
 * @Date:               2017-11-11T13:23:18+01:00
 * @Last modified by:   quentin
 * @Last modified time: 2017-11-11T18:06:26+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


 package src.tools.lexer.convert;

 import src.tools.print.*;
 import src.tools.lexer.*;
 import src.tools.lexer.write.*;
 import src.tools.lexer.read.*;
 import src.tools.lexer.convert.resources.*;
 import src.tools.lexer.convert.format.gson.*;
 import src.tools.lexer.scan.*;

 public class Converter extends ALexer {

   ALexer scanner = null;

   IConverter gsontool = new GsonConverter();

   public Converter(){}

   public Converter(ALexer scan) {
     this.setScanner(scan);
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
       this.setGsonTool(new GsonConverter(this.getScanner().getFileinfo()));
     }

     return true;
   }

  public IConverter getGson() {
    return this.getGsonTool();
  }

  public ALexer     getScanner() { return this.scanner; }

  public void       setScanner(ALexer data) { this.scanner = data; }

  public IConverter getGsonTool() { return this.gsontool; }

  public void       setGsonTool(IConverter tool) { this.gsontool = tool; }

 }
