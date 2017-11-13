/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           GsonConverter.java
 * @Date:               2017-11-11T13:20:33+01:00
 * @Last modified by:   quentin
 * @Last modified time: 2017-11-13T17:57:25+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


package src.tools.lexer.convert.format.gson;

import java.lang.InstantiationException;
import java.lang.reflect.*;
import java.io.BufferedReader;
import src.tools.print.*;
import src.tools.lexer.write.*;
import src.tools.lexer.convert.format.gson.*;
import src.builder.entity.resources.models.tree.*;
import src.builder.entity.resources.models.filer.*;
import src.tools.lexer.convert.resources.*;

public class GsonConverter implements IConverter {

  protected FilerModel  fileinfo = null;

  protected Format      fileformat = null;

  protected Class       fileclass = null;

  protected BufferedReader    filecontent = null;

  protected String      result = null;

  protected GsonReader  read = new GsonReader();

  protected GsonWriter  write = new GsonWriter();

  public GsonConverter(){}

  public GsonConverter(FilerModel file) {
    this.setFileinfo(file);
    this.run();
  }

  public GsonConverter(FilerModel file, BufferedReader content) {
    this.setFileinfo(file);
    this.setFilecontent(content);
    this.run();
  }

  public GsonConverter(FilerModel file, Format content) {
    this.setFileinfo(file);
    this.setFileformat(content);
    this.run();
  }

  public boolean run() {
    if (!this.build())
      return false;
    return true;
  }

  public boolean build() {
    if (this.getFileinfo() != null && this.getFileformat() != null) {
      this.toFormat(this.getFileformat());
      return true;
    } else if (this.getFileinfo() != null) {
      String  classname = this.getFileinfo().getType();
      Class   file = classname.getClass();

      this.setFileclass(file);
      this.toObject(file);
      return true;
    }
    return false;
  }

  /**
  * This method would to serialize and write Format objet to gson format (json file)
  *
  * @param classname
  *                   current Format instance to save in file
  *
  * @see GsonConverter#build()
  */
  public void toFormat(Format classname) {
    this.getWrite().setFormat(classname);
    this.getWrite().convert();
    this.setResult(this.getWrite().getResult());
  }

  /**
  * This method would to deserialize and store json file data to a Format objet
  *
  * @param classname
  *                   current Class to use
  *
  * @see GsonConverter#build()
  */
  public void toObject(Class classname) {
    this.getRead().setFormat(classname);
    this.getRead().setContent(this.getFilecontent());
    this.getRead().convert();
    this.setFileformat(this.getRead().getResult());
  }

  public FilerModel getFileinfo() { return this.fileinfo; }

  public void setFileinfo(FilerModel data) { this.fileinfo = data; }

  public Format getFileformat() { return this.fileformat; }

  public void setFileformat(Format data) { this.fileformat = data; }

  public Class getFileclass() { return this.fileclass; }

  public void setFileclass(Class data) { this.fileclass = data; }

  public BufferedReader getFilecontent() {  return this.filecontent; }

  public void setFilecontent(BufferedReader data) { this.filecontent = data; }

  public String getResult() {  return this.result; }

  public void setResult(String data) { this.result = data; }

  public GsonReader getRead() { return this.read; }

  public void setRead(GsonReader data) { this.read = data; }

  public GsonWriter getWrite() { return this.write; }

  public void setWrite(GsonWriter data) { this.write = data; }
}
