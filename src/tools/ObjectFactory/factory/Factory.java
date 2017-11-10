/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           Factory.java
 * @Date:               2017-11-09T22:25:59+01:00
 * @Last modified by:   quentin
 * @Last modified time: 2017-11-09T23:15:34+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


package src.tools.ObjectFactory.factory;

import java.util.ArrayList;
import java.io.File;
import src.tools.ObjectFactory.factory.*;

public class Factory extends AFactory {

  public Factory() {
    super();
  }

  public Factory(ArrayList<File> files) {
    super();
    this.setFiles(files);
    this.run();
  }

  /**
  * This method would to build object actions
  *
  * @return Success or not
  *
  * @see ObjectFactory#run()
  */
  public boolean             build() {
    return true;
  }
}
