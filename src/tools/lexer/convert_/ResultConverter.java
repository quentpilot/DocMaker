/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           ResultConverter.java
 * @Date:               2017-11-11T21:55:33+01:00
 * @Last modified by:   quentin
 * @Last modified time: 2017-11-11T22:21:19+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


 package src.tools.lexer.convert;

 import src.tools.lexer.convert.resources.*;
 import src.tools.lexer.convert.format.gson.*;
 import src.builder.entity.resources.models.tree.*;

 public class ResultConverter {

   protected String toWrite = null;

   protected Format toRead = null;

   public ResultConverter(){}

  public ResultConverter(GsonConverter infos) {
    this.setToWrite(infos.getResult());
    this.setToRead(infos.getFileformat());
  }

  public String getToWrite() { return this.toWrite; }

  public void setToWrite(String data) { this.toWrite = data; }

  public Format getToRead() { return this.toRead; }

  public void setToRead(Format data) { this.toRead = data; }
 }
