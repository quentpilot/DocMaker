/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentpilot>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           AEngine.java
 * @Date:               2017-11-06T07:20:03+01:00
 * @Last modified by:   quentpilot
 * @Last modified time: 2017-11-07T09:22:02+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


package src.core.engine;

import java.util.*;
import src.tools.print.*;
import src.builder.*;
import src.core.engine.IEngine;

public class AEngine implements IEngine {

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
  * This attribute would to store final entities data
  *
  * @see AEngine#AEngine()
  */
  protected ArrayList<Builder>  entities = new ArrayList<Builder>();

  /**
  * This attribute would to store an instance of Builder
  *
  * @see AEngine#AEngine()
  */
  protected Builder  builder = new Builder();

  /**
  * This method to build data
  *
  * @see AEngine#AEngine()
  */
  public boolean build(){ return false; }

  /**
  * Main method to run class
  *
  * @see AEngine#AEngine()
  */
  public boolean run(){
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
  public ArrayList<Builder> getEntities() { return this.entities; }

  /**
  * This method would to set entity attribute value
  *
  * @param done
  *               value to set
  *
  * @see AEngine#entities
  */
  public void setEntities(ArrayList<Builder> data) { this.entities = data; }

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
  * @param done
  *               value to set
  *
  * @see AEngine#builder
  */
  public void setBuilder(Builder data) { this.builder = data; }
}
