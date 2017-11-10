/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentpilot>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           AEngine.java
 * @Date:               2017-11-06T07:20:03+01:00
 * @Last modified by:   quentin
 * @Last modified time: 2017-11-10T19:46:11+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


package src.core.engine;

import java.util.*;
import java.lang.*;
import src.tools.print.*;
import src.tools.check.*;
import src.builder.*;
import src.core.engine.IEngine;
import src.tools.ObjectFactory.*;
import src.tools.ObjectFactory.resources.*;
import src.tools.ObjectFactory.array.*;

public abstract class AEngine implements IEngine {

  /**
  * This attribute would to store type of child class to custom actions
  *
  * @see AEngine#AEngine()
  */
  protected String  type = "DocMaker";

  /**
  * This attribute would to store final class status
  *
  * @see AEngine#AEngine()
  */
  protected boolean  status = false;

  /**
  * This attribute would to store entities data
  *
  * @see AEngine#AEngine()
  */
  protected ArrayObjectFactory  entities = new ArrayObjectFactory();

  /**
  * This attribute would to store an instance of Builder
  *
  * @see AEngine#AEngine()
  */
  protected Builder  builder = new Builder();

  /**
  * This attribute would to store an instance of Checker
  *
  * @see AEngine#AEngine()
  */
  protected Checker  checker = new EngineChecker();

  /**
  * This method to build data
  *
  * @see AEngine#AEngine()
  */
  public boolean build() { return false; }

  /**
  * Main method to run class
  *
  * @see AEngine#AEngine()
  */
  public boolean run() {
    if (!this.build())
      return false;
    return true;
  }

  /**
  * Main method to clean temporary data class
  *
  * @see AEngine#AEngine()
  */
  public void clean(){}

  /**
  * Main method to check actions
  *
  * @see AEngine#run()
  */
  public boolean check() {
    return true;
  }

  /**
  * This method would to return type attribute value
  *
  * @return type attribute value
  *
  * @see AEngine#type
  */
  public String getType() { return this.type; }

  /**
  * This method would to set type attribute value
  *
  * @param classname
  *               value to set
  *
  * @see AEngine#type
  */
  public void setType(String classname) { this.type = classname; }

  /**
  * This method would to return status attribute value
  *
  * @return status attribute value
  *
  * @see AEngine#status
  */
  public boolean getStatus() { return this.status; }

  /**
  * This method would to set status attribute value
  *
  * @param done
  *               value to set
  *
  * @see AEngine#status
  */
  public void setStatus(boolean done) { this.status = done; }

  /**
  * This method would to return entities attribute value
  *
  * @return entities attribute value
  *
  * @see AEngine#entities
  */
  public ArrayObjectFactory getEntities() { return this.entities; }

  /**
  * This method would to set entity attribute value
  *
  * @param data
  *               value to set
  *
  * @see AEngine#entities
  */
  public void setEntities(ArrayObjectFactory data) { this.entities = data; }

  /**
  * This method would to return builder attribute value
  *
  * @return entities attribute value
  *
  * @see AEngine#builder
  */
  public Builder getBuilder() { return this.builder; }

  /**
  * This method would to set builder attribute value
  *
  * @param data
  *               value to set
  *
  * @see AEngine#builder
  */
  public void setBuilder(Builder data) { this.builder = data; }

  /**
  * This method would to return checker attribute value
  *
  * @return checker attribute value
  *
  * @see AEngine#checker
  */
  public Checker getChecker() { return this.checker; }

  /**
  * This method would to set checker attribute value
  *
  * @param data
  *               value to set
  *
  * @see AEngine#checker
  */
  public void setChecker(Checker data) { this.checker = data; }
}
