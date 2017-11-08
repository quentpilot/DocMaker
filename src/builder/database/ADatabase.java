/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentpilot>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           ADatabase.java
 * @Date:               2017-11-08T12:18:09+01:00
 * @Last modified by:   quentpilot
 * @Last modified time: 2017-11-08T13:29:11+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


 package src.builder.database;

 import java.util.*;
 import java.io.*;
 import src.builder.database.*;
 import src.builder.database.resources.*;

 public abstract class ADatabase implements IDatabase {

   /**
   * This attribute would to store list of well parsed files
   * before to sort
   */
   public ArrayList<File>   paths = new ArrayList<File>();

   /**
   * Main constructor
   *
   * @see ADatabase#ADatabase()
   */
   public            ADatabase(){}

   /**
   * Second constructor
   *
   * @param dirpath
   *                database (resources) directory to build
   *
   * @see ADatabase#ADatabase()
   */
   public           ADatabase(String dirpath){}


   /**
   * This method would to load current datatable selected
   *
   * @return Success or not
   *
   * @see ADatabase#ADatabase()
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
   * @see ADatabase#ADatabase()
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
   * @see ADatabase#ADatabase()
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
   * @see ADatabase#ADatabase()
   */
   public Response find(Request data){
     return new Response();
   }

   /**
   * This method would to clear database
   *
   * @return success or not
   *
   * @see ADatabase#ADatabase()
   */
   public boolean clean() {
     return true;
   }

   /**
   * This method would to return paths attribute value
   *
   * @return paths attribute value
   *
   * @see Builder#paths
   */
   public ArrayList<File>   getPaths() { return this.paths; }

   /**
   * This method would to set paths attribute value
   *
   * @param list
   *               value to set
   *
   * @see Builder#paths
   */
   public void                setPaths(ArrayList<File> list) { this.paths = list; }
 }
