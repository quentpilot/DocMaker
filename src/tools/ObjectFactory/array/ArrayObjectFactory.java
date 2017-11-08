/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bianw <quentpilot>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           ArrayObjectFactory.java
 * @Date:               2017-11-07T13:52:13+01:00
 * @Last modified by:   quentin
 * @Last modified time: 2017-11-08T23:15:37+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


 package src.tools.ObjectFactory.array;

 import src.tools.print.*;
 import src.tools.lexer.*;
 import src.tools.ObjectFactory.*;
 import src.tools.ObjectFactory.sort.*;
 import src.builder.entity.resources.models.*;

 public class ArrayObjectFactory extends ObjectFactory {

   /**
   * Main constructor
   *
   * @see ObjectFactory#ObjectFactory()
   */
   public                     ArrayObjectFactory() {
     Printer.printbot("Array objects factory is working...");
   }

   /**
   * Model builder constructor
   *
   * @see ObjectFactory#ObjectFactory()
   */
   public                     ArrayObjectFactory(ALexer data) {
     Printer.printbot("Array objects factory is working...");
   }
 }
