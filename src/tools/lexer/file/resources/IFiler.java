/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           IFiler.java
 * @Date:               2017-11-09T17:59:34+01:00
 * @Last modified by:   quentin
 * @Last modified time: 2017-11-09T18:05:46+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


package src.tools.lexer.file.resources;

import src.tools.lexer.resources.*;

public interface IFiler implements ILexer {
  
  /**
  * This method would to build object actions
  *
  * @return Success or not
  *
  * @see ILexer#run()
  */
  public boolean build();

  /**
  * This method would to run main class methods
  *
  * @return Success or not
  *
  * @see ILexer##build()
  */
  public boolean run();


  /**
  * This method would to clean dump data
  *
  * @return Success or not
  *
  * @see ILexer#run()
  */
  public boolean clear();
}
