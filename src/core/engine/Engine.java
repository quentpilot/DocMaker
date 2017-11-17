/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           Engine.java
 * @Date:               2017-11-06T01:21:30+01:00
 * @Last modified by:   quentpilot
 * @Last modified time: 2017-11-07T09:19:50+01:00
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
  * This attribute would to build website data info
  *
  * @see Engine#run()
  */
  protected IEngine  website = new Bootstrap();

  /**
  * This attribute would to sort database attribute content
  * before to include them to
  *
  * @see Engine#run()
  */
  protected IEngine  sorter = new Sorter();

  /**
  * This attribute would to store documentation infos
  * like blocs emplacement, and related content
  *
  * @see Engine#run()
  */
  protected IEngine  database = new Entity();

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
  * This method would to run entity builder class
  *
  * @see Engine#run()
  */
  protected boolean buildDatabase() {
    this.getDatabase().run();
    if (!this.getDatabase().getStatus())
      return false;
    return true;
  }

  /**
  * This method would to sort entity objects
  *
  * @see Engine#run()
  */
  protected boolean sortDatabase() {
    this.getSorter().setEntities(this.getDatabase().getEntities());
    this.getSorter().run();
    if (!this.getSorter().getStatus())
      return false;
    return true;
  }

  /**
  * This method would to build template from entities
  *
  * @see Engine#run()
  */
  protected boolean buildWebsite() {
    this.getWebsite().setEntities(this.getSorter().getEntities());
    this.getWebsite().run();
    if (!this.getWebsite().getStatus())
      return false;
    return true;
  }

  /**
  * Main method to run class
  *
  * @see Engine#Engine()
  */
  public boolean run(){
    // build entity
    if (!this.buildDatabase())
      return false;
      this.getDatabase().clean();
    // sort them
    if (!this.sortDatabase())
      return false;
    // build template
    if (!this.buildWebsite())
      return false;
    return true;
  }

  /**
  * Main method to clean temporary data class
  *
  * @see Engine#Engine()
  */
  public void clean(){
    Printer.printag("[@" + this.getType() + "]>", " Temporary files have been clean!");

    this.getDatabase().clean();
    this.getSorter().clean();
    this.getWebsite().clean();

    this.setType("DocMaker");
    this.setStatus(false);
    this.setDatabase(null);
    this.setSorter(null);
    this.setWebsite(null);
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
  * This method would to return website attribute value
  *
  * @return website attribute value
  *
  * @see Engine#website
  */
  public IEngine getWebsite() { return this.website; }

  /**
  * This method would to set website attribute value
  *
  * @param data
  *               value to set
  *
  * @see Engine#website
  */
  public void setWebsite(IEngine data) { this.website = data; }

  /**
  * This method would to return sorter attribute value
  *
  * @return sorter attribute value
  *
  * @see Engine#sorter
  */
  public IEngine getSorter() { return this.sorter; }

  /**
  * This method would to set sorter attribute value
  *
  * @param data
  *               value to set
  *
  * @see Engine#sorter
  */
  public void setSorter(IEngine data) { this.sorter = data; }

  /**
  * This method would to return database attribute value
  *
  * @return database attribute value
  *
  * @see Engine#database
  */
  public IEngine getDatabase() { return this.database; }

  /**
  * This method would to set database attribute value
  *
  * @param data
  *               value to set
  *
  * @see Engine#database
  */
  public void setDatabase(IEngine data) { this.database = data; }

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
