/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           EngineException.java
 * @Date:               2017-11-06T03:27:16+01:00
 * @Last modified by:   quentpilot
 * @Last modified time: 2017-11-07T10:58:14+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */

package src.core.engine;

import java.io.*;
import src.tools.print.*;
import src.core.engine.Engine;

public class EngineException extends IOException {

  public EngineException() {
    super();
  }

  public EngineException(String msg) {
    super(msg);
  }

  public void error(Engine engine){
    Printer.echo("An error occured while trying to build " + engine.getType() + " engine!");
  }

}
