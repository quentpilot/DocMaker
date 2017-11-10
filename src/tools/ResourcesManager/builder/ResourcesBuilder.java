/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bianw <quentpilot>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           ResourcesBuilder.java
 * @Date:               2017-11-07T20:22:52+01:00
 * @Last modified by:   quentpilot
 * @Last modified time: 2017-11-07T20:28:18+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


 package src.tools.ResourcesManager.builder;

 import src.tools.print.*;
 import src.tools.lexer.*;
 import src.tools.ResourcesManager.*;
 import src.tools.ResourcesManager.resources.*;

 public class ResourcesBuilder extends Resources {
   /**
   * Main constructor
   *
   * @see Resources#Resources()
   */
   public                     ResourcesBuilder(){}

   /**
   * Second constructor
   *
   * @see Resources#Resources()
   */
   public                     ResourcesBuilder(String classname) {
     this.setType(classname);
   }
 }
