/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentpilot>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           Sorter.java
 * @Date:               2017-11-06T05:20:32+01:00
 * @Last modified by:   quentin
 * @Last modified time: 2017-11-09T14:20:46+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


package src.core.engine.builder;

import java.util.*;
import src.tools.print.*;
import src.core.engine.AEngine;
import src.builder.*;
import src.builder.core.engine.sorter.*;

public class Sorter extends AEngine {

  /**
  * Main constructor
  *
  * @see Sorter#Sorter()
  */
  public          Sorter() {
    this.type = "sorterbot";
  }

  /**
  * This method would to build data
  *
  * @see Sorter#run()
  */
  public boolean  build() {
    this.setBuilder(new SorterBuilder());
    this.setEntities(this.getBuilder().getEntities());
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
    this.setStatus(true);
    return true;
  }

  /**
  * Main method would to clean temporary data class
  *
  * @see Entity#Entity()
  */
  public void     clean() {}

  /**
  * This method would to check actions
  *
  * @see Sorter#run()
  */
  public boolean check() {
    return true;
  }
}
