/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentpilot>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           Sorter.java
 * @Date:               2017-11-06T05:20:32+01:00
 * @Last modified by:   quentpilot
 * @Last modified time: 2017-11-06T09:30:48+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


package src.core.engine.builder;

import java.util.*;
import src.tools.print.*;
import src.core.engine.AEngine;

public class Sorter extends AEngine {

  /**
  * Main constructor
  *
  * @see Sorter#Sorter()
  */
  public          Sorter() {
    this.type = "sorterbot";
    this.status = true;
  }

  /**
  * This method would to build data
  *
  * @see Sorter#run()
  */
  public boolean  build() {
    Printer.printag("[@" + this.getType() + "]>", " Working on entities sorting...");
    return true;
  }

  /**
  * Main method would to run class
  *
  * @see Sorter#Sorter()
  */
  public boolean  run() {
    if (!this.build())
      return false;
    Printer.printag("[@" + this.getType() + "]>", " Entities sortation...");
    return true;
  }

  /**
  * Main method would to clean temporary data class
  *
  * @see Entity#Entity()
  */
  public void     clean() {
    Printer.printag("[@" + this.getType() + "]>", " Dump data have been clean!");
  }
}
