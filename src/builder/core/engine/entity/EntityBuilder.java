/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           EntityBuilder.java
 * @Date:               2017-11-07T12:01:32+01:00
 * @Last modified by:   quentpilot
 * @Last modified time: 2017-11-07T20:58:39+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


 package src.builder.core.engine.entity;

 import src.builder.*;
 import src.tools.print.*;
 import src.tools.check.*;

 public class EntityBuilder extends Builder {

   /**
   * Main constructor
   *
   * @see EntityBuilder#EntityBuilder()
   */
   public                     EntityBuilder() {
     this.setType("entitybuilderbot");
     this.setChecker(new EntityChecker());
     Printer.printag(this.getType(), "Builder is working...");
   }

   /**
   * Second constructor
   *
   * @see EntityBuilder#EntityBuilder()
   */
   public                     EntityBuilder(String classname) {
     this.setType("entitybuilderbot");
     this.setChecker(new EntityChecker());
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
}
