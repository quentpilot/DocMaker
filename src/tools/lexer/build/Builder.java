/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           Builder.java
 * @Date:               2017-11-08T18:50:38+01:00
 * @Last modified by:   quentin
 * @Last modified time: 2017-11-10T23:22:46+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


 package src.tools.lexer.build;

 import src.tools.lexer.*;
 import src.tools.lexer.scan.*;
 import src.tools.lexer.resources.*;
 import src.tools.print.*;

 public class Builder extends ALexer {

   protected ALexer tool = null;

   /**
   * Main constructor
   *
   * @see  Builder#Builder()
   */
   public  Builder() {}

   /**
   * Second constructor
   *
   * @see  Builder#Builder()
   */
   public  Builder(ALexer data) {
    this.setTool(data);
  }

   /**
   * This method would to build object actions
   *
   * @return Success or not
   *
   * @see  Builder#run()
   */
   public boolean build() {
     return true;
   }

   public ALexer getTool() { return this.tool; }

   public void  setTool(ALexer data) { this.tool = data; }
 }
