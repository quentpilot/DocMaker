 /**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           DatabaseFiler.java
 * @Date:               2017-11-09T18:12:12+01:00
 * @Last modified by:   quentin
 * @Last modified time: 2017-11-10T22:35:16+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


package src.builder.entity.resources.models.filer;

import src.builder.entity.resources.models.filer.*;

public class DatabaseFiler extends FilerModel {

  /**
  * Main constructor
  *
  * @see FilerModel#Filer#Model()
  */
  public DatabaseFiler() {
    super();
    this.setType("dbfilermodel#" + this.id);
    this.setDirpath("resources/database");
    this.setFilepath("database.json");
  }

}
