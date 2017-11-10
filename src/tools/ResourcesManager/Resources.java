/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bianw <quentpilot>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           Resources.java
 * @Date:               2017-11-07T20:15:42+01:00
 * @Last modified by:   quentpilot
 * @Last modified time: 2017-11-07T20:26:18+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


package src.tools.ResourcesManager;

import src.tools.print.*;
import src.tools.lexer.*;
import src.tools.ResourcesManager.*;
import src.tools.ResourcesManager.resources.*;

public class Resources implements IResources {
  /**
  * This attribute would to store resource type
  *
  * @see Resources#Resources()
  */
  public String             type = "resourcesbot";

  /**
  * Main constructor
  *
  * @see Resources#Resources()
  */
  public                     Resources(){}

  /**
  * Second constructor
  *
  * @see Resources#Resources()
  */
  public                     Resources(String classname) {
    this.setType(classname);
  }

  /**
  * This method would to return type attribute value
  *
  * @return type attribute value
  *
  * @see Resources#type
  */
  public String getType() { return this.type; }

  /**
  * This method would to set type attribute value
  *
  * @param classname
  *               value to set
  *
  * @see Resources#type
  */
  public void setType(String classname) { this.type = classname; }
}
