/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            LiveCurrencyConverter
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           Reader.java
 * @Date:               2017-11-05T23:26:58+01:00
 * @Last modified by:   quentpilot
 * @Last modified time: 2017-11-08T13:26:25+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/LiveCurrencyConverter
 */


 package src.tools.lexer.read;

 import src.tools.lexer.*;
 import src.tools.lexer.resources.*;
 import src.tools.print.*;

 public class Reader extends ALexer {

   /**
   * Main constructor
   *
   * @see Reader#Reader()
   */
   public Reader() {
     Printer.printag("[@reader]>", " is working...");
   }

   /**
   * This method would to build object actions
   *
   * @return Success or not
   *
   * @see Reader#run()
   */
   public boolean build() {
     return true;
   }
 }
