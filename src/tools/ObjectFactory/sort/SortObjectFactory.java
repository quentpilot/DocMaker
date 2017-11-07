/**
 * @Description:        SortObjectFactory class would to sort objects
 * @Author:             Quentin Le Bianw <quentpilot>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           SortObjectFactory.java
 * @Date:               2017-11-07T13:58:28+01:00
 * @Last modified by:   quentpilot
 * @Last modified time: 2017-11-07T19:45:21+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


 package src.tools.ObjectFactory.sort;

 import src.tools.ObjectFactory.resources.IObjectFactory;
 import src.tools.print.*;

 public class SortObjectFactory implements IObjectFactory {

   /**
   * Main constructor
   *
   * @see SortObjectFactory#SortObjectFactory()
   */
   public                    SortObjectFactory() {
     Printer.printbot("Sort objects factory is working...");
   }

   /**
   * This method would to build object actions
   *
   * @return Success or not
   *
   * @see SortObjectFactory#run()
   */
   public boolean             build() {
     Printer.printbot("Sort objects factory is building...");
     return true;
   }

   /**
   * This method would to run main class methods
   *
   * @return Success or not
   *
   * @see SortObjectFactory#build()
   */
   public boolean             run() {
     Printer.printbot("Sort objects factory is running...");
     return true;
   }

   /**
   * This method would to clean dump data
   *
   * @return Success or not
   *
   * @see SortObjectFactory#run()
   */
   public boolean             clean() {
     Printer.printbot("Sort objects factory cleaning...");
     return true;
   }

   /**
   * This method would to check actions
   *
   * @see SortObjectFactory#run()
   */
   public boolean             check() {
     return true;
   }
 }
