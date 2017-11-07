/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentpilot>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           IEngine.java
 * @Date:               2017-11-06T05:25:01+01:00
 * @Last modified by:   quentpilot
 * @Last modified time: 2017-11-07T16:27:41+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


package src.core.engine;

import java.util.*;
import src.core.engine.*;
import src.builder.*;
import src.tools.ObjectFactory.array.*;

public interface IEngine {

  public boolean  build();

  public boolean  run();

  public void     clean();

  public boolean  getStatus();

  public ArrayObjectFactory getEntities();

  public void setEntities(ArrayObjectFactory data);
}
