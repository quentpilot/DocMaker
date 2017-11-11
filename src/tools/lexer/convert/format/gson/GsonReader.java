/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           GsonReader.java
 * @Date:               2017-11-11T19:28:29+01:00
 * @Last modified by:   quentin
 * @Last modified time: 2017-11-11T22:51:24+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


 package src.tools.lexer.convert.format.gson;

 import java.io.BufferedReader;
 import src.tools.lexer.convert.resources.*;
 import src.builder.entity.resources.models.tree.*;

 public class GsonReader {

    protected Class format = null;

    protected Format result = null;

    protected BufferedReader content = null;

    public GsonReader() {}

    public GsonReader(Class data) {
      this.setFormat(data);
    }

    public boolean convert() {
      return true;
    }

    public Class getFormat() { return this.format; }

    public void setFormat(Class name) { this.format = name; }

    public Format getResult() {  return this.result; }

    public void setResult(Format data) { this.result = data; }

    public BufferedReader getContent() {  return this.content; }

    public void setContent(BufferedReader data) { this.content = data; }
 }
