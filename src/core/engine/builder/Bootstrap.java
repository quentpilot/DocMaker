/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentpilot>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           Bootstrap.java
 * @Date:               2017-11-06T05:21:31+01:00
 * @Last modified by:   quentin
 * @Last modified time: 2017-11-09T17:23:39+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


package src.core.engine.builder;

import java.util.*;
import src.tools.print.*;
import src.core.engine.AEngine;
import src.builder.*;
import src.builder.core.engine.bootstrap.*;

public class Bootstrap extends AEngine {

  /**
  * Main constructor
  *
  * @see Bootstrap#Bootstrap()
  */
  public          Bootstrap() {
    this.type = "bootstrapbot";
    this.status = true;
  }

  /**
  * This method would to build data
  *
  * @see Bootstrap#run()
  */
  public boolean  build() {
    this.setBuilder(new BootstrapBuilder());
    this.setEntities(this.getBuilder().getEntities());
    return true;
  }

  /**
  * This method would to run class
  *
  * @see Bootstrap#Bootstrap()
  */
  public boolean  run() {
    if (!this.build())
      return false;
    return true;
  }

  /**
  * This method would to clean temporary data class
  *
  * @see Engine#Engine()
  */
  public void     clean() {}

  /**
  * This method would to check actions
  *
  * @see Bootstrap#run()
  */
  public boolean check() {
    return true;
  }
}
