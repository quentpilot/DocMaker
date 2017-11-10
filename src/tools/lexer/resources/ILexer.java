/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bianw <quentpilot>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           ILexer.java
 * @Date:               2017-11-07T16:39:02+01:00
 * @Last modified by:   quentpilot
 * @Last modified time: 2017-11-07T16:56:37+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


package src.tools.lexer.resources;

public interface ILexer {

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
