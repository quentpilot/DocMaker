/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           DatabaseBuilder.java
 * @Date:               2017-11-07T13:01:28+01:00
 * @Last modified by:   quentin
 * @Last modified time: 2017-11-08T19:52:28+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


 package src.builder.database;

 import java.util.ArrayList;
 import java.io.File;
 import src.builder.database.*;
 import src.tools.print.*;

 public class DatabaseBuilder extends ADatabase {

   /**
   * Main constructor
   *
   * @see DatabaseBuilder#DatabaseBuilder()
   */
   public            DatabaseBuilder() {
     this.setPaths(new ArrayList<File>());
     Printer.printag("[@databasebuilder]> ", "Building of database...");
   }

   /**
   * Second constructor
   *
   * @param dirpath
   *                database (resources) directory to build
   *
   * @see DatabaseBuilder#DatabaseBuilder()
   */
   public           DatabaseBuilder(String dirpath){}


   /**
   * This method would to load current datatable selected
   *
   * @return Success or not
   *
   * @see DatabaseBuilder#DatabaseBuilder()
   */
   public boolean load(){
     return true;
   }

   /**
   * This method would to set Request datatable
   *
   * @param data
   *                request to set
   *
   * @return Success or not
   *
   * @see DatabaseBuilder#DatabaseBuilder()
   */
   public boolean set(Request data){
     return true;
   }

   /**
   * This method would to get Request datatable
   *
   * @param data
   *                data to get
   *
   * @return related response
   *
   * @see DatabaseBuilder#DatabaseBuilder()
   */
   public Response get(Request data){
     return new Response();
   }

   /**
   * This method would to set Request datatable
   *
   * @param data
   *                request to find
   *
   * @return related response
   *
   * @see DatabaseBuilder#DatabaseBuilder()
   */
   public Response find(Request data){
     return new Response();
   }

   /**
   * This method would to clear database
   *
   * @return success or not
   *
   * @see DatabaseBuilder#DatabaseBuilder()
   */
   public boolean clean() {
     return true;
   }
 }
