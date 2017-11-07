/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bianw <quentpilot>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           ALexer.java
 * @Date:               2017-11-07T16:38:47+01:00
 * @Last modified by:   quentpilot
 * @Last modified time: 2017-11-07T17:43:18+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


 package src.tools.lexer;

 import src.tools.lexer.resources.*;

 public abstract class ALexer implements ILexer {

   /**
   * This method would to build object actions
   *
   * @return Success or not
   *
   * @see ILexer#run()
   */
   public boolean build() {
     return true;
   }

   /**
   * This method would to run main class methods
   *
   * @return Success or not
   *
   * @see ILexer##build()
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
   * @see ILexer#run()
   */
   public boolean clear(){
     return true;
   }
 }
