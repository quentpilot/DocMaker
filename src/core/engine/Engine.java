/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            LiveCurrencyConverter
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           Engine.java
 * @Date:               2017-11-06T01:21:30+01:00
 * @Last modified by:   quentin
 * @Last modified time: 2017-11-06T02:01:29+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/LiveCurrencyConverter
 */


package src.core.engine;

import src.tools.print.*;

public class Engine {

  /**
  * This attribute would to store final class status
  *
  * @see Engine#Engine()
  */
  public boolean  status = false;

  /**
  * Main constructor
  *
  * @see Engine#Engine()
  */
  public Engine(){
    this.run();
  }

  /**
  * Main method to run class
  *
  * @see Engine#Engine()
  */
  protected void run(){}

  /**
  * Main method to clean temporary data class
  *
  * @see Engine#Engine()
  */
  protected void clean(){
    Printer.printbot("DocMaker temporary files have been clean!");
  }

  /**
  * This method would to return status attribute value
  *
  * @see Engine#status
  */
  public boolean getStatus() { return this.status; }

}
