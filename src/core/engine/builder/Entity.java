/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentpilot>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           Entity.java
 * @Date:               2017-11-06T05:00:29+01:00
 * @Last modified by:   quentpilot
 * @Last modified time: 2017-11-06T09:32:17+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


package src.core.engine.builder;

import java.util.*;
import src.tools.print.*;
import src.core.engine.AEngine;
import src.builder.*;

public class Entity extends AEngine {

  /**
  * Main constructor
  *
  * @see Entity#Entity()
  */
  public          Entity() {
    this.type = "entitybot";
    this.status = true;
  }

  /**
  * This method would to build data
  *
  * @see Entity#run()
  */
  public boolean  build() {
    Printer.printag("[@" + this.getType() + "]>", " Working on entities builder...");
    return true;
  }

  /**
  * Main method would to run class
  *
  * @see Entity#Entity()
  */
  public boolean  run() {
    if (!this.build())
      return false;
    Printer.printag("[@" + this.getType() + "]>", " Entities are built!");
    return true;
  }

  /**
  * Main method would to clean temporary data class
  *
  * @see Engine#Engine()
  */
  public void     clean() {
    Printer.printag("[@" + this.getType() + "]>", " Dump data have been clean!");
  }

  /**
  * This method would to return entities attribute value
  *
  * @return entities attribute value
  *
  * @see AEngine#entities
  */
  public ArrayList<Builder> getEntities() { return this.entities; }
}
