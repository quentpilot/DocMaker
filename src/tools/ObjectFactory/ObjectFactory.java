/**
 * @Description:        ObjectFactory class would to manage objects collections
 * @Author:             Quentin Le Bianw <quentpilot>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           ObjectFactory.java
 * @Date:               2017-11-07T13:52:23+01:00
 * @Last modified by:   quentpilot
 * @Last modified time: 2017-11-07T15:21:35+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


 package src.tools.ObjectFactory;

 import src.tools.ObjectFactory.resources.IObjectFactory;
 import src.tools.ObjectFactory.sort.*;
 import src.tools.print.*;

 public class ObjectFactory implements IObjectFactory {

   /**
   * This attribute would to store an instance
   * of SortObjectFactory class
   *
   * @see ObjectFactory#build()
   */
   public SortObjectFactory   sorter = new SortObjectFactory();

   /**
   * Main constructor
   *
   * @see ObjectFactory#ObjectFactory()
   */
   public                     ObjectFactory() {
     Printer.printbot("Objects factory is working...");
   }

   /**
   * This method would to build object actions
   *
   * @return Success or not
   *
   * @see ObjectFactory#run()
   */
   public boolean             build() {
     Printer.printbot("Objects factory is building...");
     return true;
   }

   /**
   * This method would to run main class methods
   *
   * @return Success or not
   *
   * @see ObjectFactory#build()
   */
   public boolean             run() {
     Printer.printbot("Objects factory is running...");
     return true;
   }

   /**
   * This method would to clean dump data
   *
   * @return Success or not
   *
   * @see ObjectFactory#run()
   */
   public boolean             clean() {
     Printer.printbot("Objects factory cleaning...");
     return true;
   }

   /**
   * This method would to return sorter attribute
   *
   * @return sorter attribute value
   *
   * @see ObjectFactory#sorter
   */
   public SortObjectFactory   getSorter() { return this.sorter; }

   /**
   * This method would to set sorter attribute
   *
   * @param sort
   *             would to be an instance of SortObjectFactory class
   *
   * @see ObjectFactory#sorter
   */
   public void                setSorter(SortObjectFactory sort) { this.sorter = sort; }
 }
