/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           EntityBuilder.java
 * @Date:               2017-11-07T12:01:32+01:00
 * @Last modified by:   quentin
 * @Last modified time: 2017-11-08T23:16:34+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


 package src.builder.core.engine.entity;

 import java.lang.*;
 import src.builder.*;
 import src.tools.print.*;
 import src.tools.check.*;
 import src.tools.lexer.*;
 import src.tools.lexer.resources.*;
 import src.tools.ObjectFactory.array.*;
 import src.builder.entity.resources.models.Model;

 public class EntityBuilder extends Builder {

   /**
   * Main constructor
   *
   * @see EntityBuilder#EntityBuilder()
   */
   public                     EntityBuilder() {
     super();
     this.setType("entitybuilderbot");
     this.setLexer(new Lexer());
     this.setChecker(new EntityChecker());
     Printer.printag(this.getType(), "Builder is working...");
     this.run();
   }

   /**
   * Second constructor
   *
   * @see EntityBuilder#EntityBuilder()
   */
   public                     EntityBuilder(String classname) {
     super(classname);
     this.setType("entitybuilderbot");
     this.setChecker(new EntityChecker());
     Printer.printag(this.getType(), "Builder is working...");
     this.run();
   }

   /**
   * This method would to build object actions
   *
   * @return Success or not
   *
   * @see EntityBuilder#run()
   */
   public boolean             build() {
    if (!this.getDatabases()[0].load())
      return false;
    this.setLexer(new Lexer(this.getDatabases()[0].getPaths()));
    if (!this.getLexer().run())
      return false;
    this.setEntities(new ArrayObjectFactory(this.getLexer()));
     Printer.printag(this.getType(), "Builder is building...");
     return true;
   }
}
