/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentpilot>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           ADatabase.java
 * @Date:               2017-11-08T12:18:09+01:00
 * @Last modified by:   quentin
 * @Last modified time: 2017-11-09T18:44:09+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


 package src.builder.database;

 import java.util.ArrayList;
 import java.io.File;
 import src.builder.database.*;
 import src.builder.database.resources.*;
 import src.tools.lexer.*;
 import src.tools.lexer.scan.*;
 import src.tools.lexer.file.*;

 public abstract class ADatabase implements IDatabase {

   /**
   * This attribute would to store an instance of Scanner
   */
   public ALexer            lexer = new Scanner();

   /**
   * This attribute would to store an instance of Filer
   */
   public ALexer            filer = new Filer();

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
   * @see ADatabase#paths
   */
   public ArrayList<File> getPaths() { return this.paths; }

   /**
   * This method would to set paths attribute value
   *
   * @param list
   *               value to set
   *
   * @see ADatabase#paths
   */
   public void  setPaths(ArrayList<File> list) { this.paths = list; }

   /**
   * This method would to return lexer attribute value
   *
   * @return lexer attribute value
   *
   * @see ADatabase#lexer
   */
   public ALexer getLexer() { return this.lexer; }

   /**
   * This method would to set lexer attribute value
   *
   * @param data
   *               value to set
   *
   * @see ADatabase#lexer
   */
   public void  setLexer(ALexer data) { this.lexer = data; }

   /**
   * This method would to return filer attribute value
   *
   * @return filer attribute value
   *
   * @see ADatabase#filer
   */
   public ALexer getFiler() { return this.filer; }

   /**
   * This method would to set filer attribute value
   *
   * @param data
   *               value to set
   *
   * @see ADatabase#filer
   */
   public void  setFiler(ALexer data) { this.filer = data; }
 }
