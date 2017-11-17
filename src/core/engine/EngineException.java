/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           EngineException.java
 * @Date:               2017-11-06T03:27:16+01:00
 * @Last modified by:   quentpilot
 * @Last modified time: 2017-11-06T09:07:36+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */

package src.core.engine;

import java.io.*;

public class EngineException extends IOException {

  public EngineException() {
    super();
  }

  public EngineException(String msg) {
    super(msg);
  }

}
