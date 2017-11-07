/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            LiveCurrencyConverter
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           Builder.java
 * @Date:               2017-11-04T17:32:31+01:00
 * @Last modified by:   quentpilot
 * @Last modified time: 2017-11-07T17:31:14+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


package src.builder;

import src.tools.print.*;
import src.tools.ObjectFactory.array.*;
import src.tools.lexer.*;

public class Builder extends ArrayObjectFactory {

  /**
  * This attribute would to store class type
  *
  * @see Builder#Builder()
  */
  public String             type = "builderbot";

  /**
  * This attribute would to store Entities array
  *
  * @see Builder#Builder()
  */
  public ArrayObjectFactory entities = new ArrayObjectFactory();

  /**
  * This attribute would to store Lexer tools
  *
  * @see Builder#Builder()
  */
  public Lexer lexer = new Lexer();

  /**
  * Main constructor
  *
  * @see Builder#Builder()
  */
  public                     Builder() {
    super();
    this.setType(this.type);
    Printer.printag(this.getType(), "Builder is working...");
  }

  /**
  * Main constructor
  *
  * @see Builder#Builder()
  */
  public                     Builder(String classname) {
    super();
    this.setType(classname);
    Printer.printag(this.getType(), "Builder is working...");
  }

  /**
  * This method would to build object actions
  *
  * @return Success or not
  *
  * @see Builder#run()
  */
  public boolean             build() {
    Printer.printag(this.getType(), "Builder is building...");
    return true;
  }

  /**
  * This method would to run main class methods
  *
  * @return Success or not
  *
  * @see Builder#build()
  */
  public boolean             run() {
    if (!this.build())
      return false;
    Printer.printag(this.getType(), "Builder is running...");
    return true;
  }

  /**
  * This method would to clean dump data
  *
  * @return Success or not
  *
  * @see Builder#run()
  */
  public boolean             clean() {
    Printer.printag(this.getType(), "Builder cleaning...");
    return true;
  }

  /**
  * This method would to return type attribute value
  *
  * @return type attribute value
  *
  * @see Builder#type
  */
  public String              getType() { return this.type; }

  /**
  * This method would to set type attribute value
  *
  * @param classname
  *               value to set
  *
  * @see Builder#type
  */
  public void                setType(String classname) {
    this.type = "[@" + classname + "]> ";
  }

  /**
  * This method would to return entities attribute value
  *
  * @return entities attribute value
  *
  * @see Builder#entities
  */
  public ArrayObjectFactory getEntities() { return this.entities; }

  /**
  * This method would to set entity attribute value
  *
  * @param data
  *               value to set
  *
  * @see Builder#entities
  */
  public void setEntities(ArrayObjectFactory data) { this.entities = data; }

  /**
  * This method would to return lexer attribute value
  *
  * @return entities attribute value
  *
  * @see Builder#lexer
  */
  public Lexer getLexer() { return this.lexer; }

  /**
  * This method would to set lexer attribute value
  *
  * @param data
  *               value to set
  *
  * @see Builder#lexer
  */
  public void setLexer(Lexer data) { this.lexer = data; }
}
