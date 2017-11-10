/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           ApplicationRunner.java
 * @Date:               2017-11-05T23:44:20+01:00
 * @Last modified by:   quentpilot
 * @Last modified time: 2017-11-07T11:04:23+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


package src.core.engine.runner;

import src.tools.print.*;
import src.core.engine.Engine;

public class ApplicationRunner extends Engine {

  /**
  * Main constructor
  *
  * @see Engine#Engine()
  */
  public                   ApplicationRunner() {
    super("appbot");
    Printer.printbot("DocMaker is running...");
    this.run();
    this.clean();
  }

  /**
  * Second constructor which would to set some attributes
  *
  * @param classname
  *                   Name of instantiated class to set type attribute
  *
  * @see Engine#type
  */
  public ApplicationRunner(String classname) {
    super(classname);
    this.run();
  }
}
