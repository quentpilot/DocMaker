/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           CheckRunner.java
 * @Date:               2017-11-06T00:22:06+01:00
 * @Last modified by:   quentpilot
 * @Last modified time: 2017-11-07T11:51:16+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


package src.core.engine.runner;

import src.tools.print.*;
import src.core.engine.Engine;

public class CheckRunner extends Engine {

   /**
   * Main constructor
   *
   * @see Engine#Engine()
   */
   public                   CheckRunner() {
     super("checkbot");
     Printer.printbot("Check is running...");
     this.run();
     this.clean();
   }

   /**
   * Second constructor which would to set some attributes
   *
   * @param classname
   *                   Name of instantiated class to set type attribute
   *
   * @see Engine#type
   */
   public                   CheckRunner(String classname) {
     super(classname);
     this.run();
   }

   /**
   * Main method to run class
   *
   * @see Engine#Engine()
   */
   public boolean run(){
     Printer.printbot("Data checkout in progress...");
     return true;
     // build entity
     // sort them
     // build template
   }

   /**
   * Main method to clean temporary data class
   *
   * @see Engine#Engine()
   */
   public void clean(){
     Printer.printag("[@" + this.getType() + "]>", " Website built has been checked!");
   }
}
