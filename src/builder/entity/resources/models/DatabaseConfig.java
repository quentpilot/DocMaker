/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           DatabaseConfig.java
 * @Date:               2017-11-08T21:52:56+01:00
 * @Last modified by:   quentin
 * @Last modified time: 2017-11-09T14:25:08+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


package src.builder.entity.resources.models;

import src.builder.entity.resources.models.Model;

public class DatabaseConfig extends Model {

  /**
  * Main constructor
  *
  * @see DatabaseConfig#DatabaseConfig()
  */
  public                     DatabaseConfig() {
    super();
    this.setType("databaseconfig#" + this.id);
    this.setFilepath("build");
  }

  /**
  * Second constructor
  *
  * @param classname
  *                   name of class
  *
  * @see DatabaseConfig#DatabaseConfig(String classname)
  */
  public                     DatabaseConfig(String classname) {
    super(classname);
  }
}
