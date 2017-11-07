/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           EntityBuilder.java
 * @Date:               2017-11-07T12:01:32+01:00
 * @Last modified by:   quentpilot
 * @Last modified time: 2017-11-07T15:32:59+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


 package src.builder.core.engine.entity;

 import src.builder.*;
 import src.tools.print.*;

 public class EntityBuilder extends Builder {

   /**
   * Main constructor
   *
   * @see EntityBuilder#EntityBuilder()
   */
   public                     EntityBuilder() {
     super();
     this.setType("entitybuilderbot");
     Printer.printag(this.getType(), "Builder is working...");
   }

   /**
   * Main constructor
   *
   * @see EntityBuilder#EntityBuilder()
   */
   public                     EntityBuilder(String classname) {
     super(classname);
     Printer.printag(this.getType(), "Builder is working...");
   }

   /**
   * This method would to build object actions
   *
   * @return Success or not
   *
   * @see EntityBuilder#run()
   */
   public boolean             build() {
     Printer.printag(this.getType(), "Builder is building...");
     return true;
   }

   /**
   * This method would to run main class methods
   *
   * @return Success or not
   *
   * @see EntityBuilder#build()
   */
   public boolean             run() {
     Printer.printag(this.getType(), "Builder is running...");
     return true;
   }

   /**
   * This method would to clean dump data
   *
   * @return Success or not
   *
   * @see EntityBuilder#run()
   */
   public boolean             clean() {
     Printer.printag(this.getType(), "Builder cleaning...");
     return true;
   }
}
