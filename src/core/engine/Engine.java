/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           Engine.java
 * @Date:               2017-11-06T01:21:30+01:00
 * @Last modified by:   quentpilot
 * @Last modified time: 2017-11-07T11:02:55+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


package src.core.engine;

import src.tools.print.*;
import src.core.engine.*;
import src.core.engine.builder.*;

public class Engine extends AEngine {

  /**
  * This attribute would to store type of child class to custom actions
  *
  * @see Engine#Engine()
  */
  protected String  type = "DocMaker";

  /**
  * This attribute would to store each engine instances
  *
  * @see Engine#run()
  */
  protected IEngine[]  engine = { new Entity(), new Sorter(), new Bootstrap() };

  /**
  * This attribute would to store final class status
  *
  * @see Engine#Engine()
  */
  protected boolean  status = false;

  /**
  * Main constructor
  *
  * @see Engine#Engine()
  */
  public Engine() {
    this.status = true;
  }

  /**
  * Second constructor which would to set some attributes
  *
  * @param classname
  *                   Name of instantiated class to set type attribute
  *
  * @see Engine#type
  */
  public Engine(String classname) {
    this.type = classname;
    this.status = true;
  }

  /**
  * Main method to run class
  *
  * @see Engine#Engine()
  */
  public boolean run() {
    int   it = 0;
    for (IEngine maker : this.getEngine()) {
      if (it > 0)
        maker.setEntities(this.getEngine()[it - 1].getEntities());
      maker.run();
      if (!maker.getStatus())
        return false;
      maker.clean();
      it++;
    }
    this.result();
    return true;
  }

  /**
  * Main method to clean temporary data class
  *
  * @see Engine#Engine()
  */
  public void clean(){
    this.setStatus(false);
    Printer.printag("[@" + this.getType() + "]>", " Temporary files have been clean!");
  }

  /**
  * This method would to print result of class we want
  *
  * @see Engine#run()
  */
  public void result() {
    Printer.printag("[@" + this.getType() + "]>", " Future result message emplacement when finish to build website documentation!");
  }

  /**
  * This method would to return type attribute value
  *
  * @return type attribute value
  *
  * @see Engine#type
  */
  public String getType() { return this.type; }

  /**
  * This method would to set type attribute value
  *
  * @param classname
  *               value to set
  *
  * @see Engine#type
  */
  public void setType(String classname) { this.type = classname; }

  /**
  * This method would to return engine attribute value
  *
  * @return engine attribute value
  *
  * @see Engine#engine
  */
  public IEngine[] getEngine() { return this.engine; }

  /**
  * This method would to set engine attribute value
  *
  * @param done
  *               engine to set
  *
  * @see Engine#engine
  */
  public void setEngine(IEngine[] instances) { this.engine = instances; }

  /**
  * This method would to return status attribute value
  *
  * @return status attribute value
  *
  * @see Engine#status
  */
  public boolean getStatus() { return this.status; }

  /**
  * This method would to set status attribute value
  *
  * @param done
  *               value to set
  *
  * @see Engine#status
  */
  public void setStatus(boolean done) { this.status = done; }
}
