/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            LiveCurrencyConverter
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           Writer.java
 * @Date:               2017-11-05T23:26:45+01:00
 * @Last modified by:   quentpilot
 * @Last modified time: 2017-11-07T17:42:41+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/LiveCurrencyConverter
 */


 package src.tools.lexer.write;

 import src.tools.lexer.*;
 import src.tools.print.*;

 public class Writer extends ALexer {

   /**
   * Main constructor
   *
   * @see Writer#Writer()
   */
   public Writer() {
     Printer.printag("[@writer]>", " is working...");
   }

   /**
   * This method would to build object actions
   *
   * @return Success or not
   *
   * @see Writer#run()
   */
   public boolean build() {
     return true;
   }
 }
