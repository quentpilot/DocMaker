/**
 * @Description:        IObjectFactory class would to model subclasses
 * @Author:             Quentin Le Bianw <quentpilot>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           IObjectFactory.java
 * @Date:               2017-11-07T13:43:17+01:00
 * @Last modified by:   quentpilot
 * @Last modified time: 2017-11-07T14:22:08+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


package src.tools.ObjectFactory.resources;

public interface IObjectFactory {

  /**
  * This method would to build object actions
  *
  * @return Success or not
  *
  * @see IObjectFactory#run()
  */
  public boolean build();

  /**
  * This method would to run main class methods
  *
  * @return Success or not
  *
  * @see IObjectFactory#build()
  */
  public boolean run();

  /**
  * This method would to clean dump data
  *
  * @return Success or not
  *
  * @see IObjectFactory#run()
  */
  public boolean clean();
}
