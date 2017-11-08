/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentpilot>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           DatabaseFinder.java
 * @Date:               2017-11-08T11:58:58+01:00
 * @Last modified by:   quentpilot
 * @Last modified time: 2017-11-08T12:31:01+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


 package src.builder.database;

 import src.builder.database.*;
 import src.tools.print.*;

 public class DatabaseFinder extends ADatabase {

   /**
   * Main constructor
   *
   * @see DatabaseFinder#DatabaseFinder()
   */
   public            DatabaseFinder() {
     Printer.printag("[@databasefinder]> ", "Building of database...");
   }

   /**
   * Second constructor
   *
   * @param dirpath
   *                database (resources) directory to build
   *
   * @see DatabaseFinder#DatabaseFinder()
   */
   public           DatabaseFinder(String dirpath){}
}
