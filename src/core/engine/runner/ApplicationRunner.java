/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            LiveCurrencyConverter
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           ApplicationRunner.java
 * @Date:               2017-11-05T23:44:20+01:00
 * @Last modified by:   quentin
 * @Last modified time: 2017-11-06T02:01:23+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/LiveCurrencyConverter
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
  public                   ApplicationRunner(){
    super();
    Printer.printbot("DocMaker is running...");
    this.status = true;
  }
}
