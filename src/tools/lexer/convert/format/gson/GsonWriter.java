/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           GsonWriter.java
 * @Date:               2017-11-11T19:28:38+01:00
 * @Last modified by:   quentin
 * @Last modified time: 2017-11-11T20:46:12+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


 package src.tools.lexer.convert.format.gson;

 import src.tools.lexer.convert.resources.*;
 import src.builder.entity.resources.models.tree.*;

 public class GsonWriter {

    protected Format format = null;

    protected String result = null;

    public GsonWriter(){}

    public GsonWriter(Format data) {
      this.setFormat(data);
    }

    public boolean convert() {
      return true;
    }

    public Format getFormat() { return this.format; }

    public void setFormat(Format name) { this.format = name; }

    public String getResult() {  return this.result; }

    public void setResult(String data) { this.result = data; }
}
