/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bianw <quentpilot>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           ALexer.java
 * @Date:               2017-11-07T16:38:47+01:00
 * @Last modified by:   quentin
 * @Last modified time: 2017-11-08T19:26:08+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


 package src.tools.lexer;

 import java.util.ArrayList;
 import java.io.File;
 import src.tools.lexer.resources.*;

 public abstract class ALexer implements ILexer {

   /**
   * This attribute would to store file type class to use
   *
   * @see ALexer#run()
   */
   protected ArrayList<File> dump = new ArrayList<File>();

   /**
   * This attribute would to store file type class to use
   *
   * @see ALexer#run()
   */
   protected String format = "json";

   /**
   * This method would to build object actions
   *
   * @return Success or not
   *
   * @see ALexer#run()
   */
   public boolean build() {
     return true;
   }

   /**
   * This method would to run main class methods
   *
   * @return Success or not
   *
   * @see ALexer#build()
   */
   public boolean run() {
     if (!this.build())
       return false;
     return true;
   }


   /**
   * This method would to clean dump data
   *
   * @return Success or not
   *
   * @see ALexer#run()
   */
   public boolean clear() {
     return true;
   }

   /**
   * This method would to return dump attribute
   *
   * @return dump value
   *
   * @see ALexer#dump
   */
   public ArrayList<File> getDump() {
     return this.dump;
   }

   /**
   * This method would to set dump attribute
   *
   * @param data
   *              data value to store
   *
   * @see ALexer#format
   */
   public void setDump(ArrayList<File> data) {
     this.dump = data;
   }

   /**
   * This method would to return format attribute
   *
   * @return format value
   *
   * @see ALexer#format
   */
   public String getFormat() {
     return this.format;
   }

   /**
   * This method would to set format attribute
   *
   * @param type
   *              format value to store
   *
   * @see ALexer#format
   */
   public void setFormat(String type) {
     this.format = type;
   }
 }
