/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            LiveCurrencyConverter
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           Builder.java
 * @Date:               2017-11-04T17:32:31+01:00
 * @Last modified by:   quentpilot
 * @Last modified time: 2017-11-07T15:21:04+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


package src.builder;

import src.tools.print.*;
import src.tools.ObjectFactory.*;

public class Builder extends ObjectFactory {

  /**
  * This attribute would to store class type
  *
  * @see Builder#Builder()
  */
  public String             type = "builderbot";

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
  public void setType(String classname) {
    this.type = "[@" + classname + "]> ";
  }
}
