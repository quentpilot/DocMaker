/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bianw <quentpilot>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           ArrayObjectFactory.java
 * @Date:               2017-11-07T13:52:13+01:00
 * @Last modified by:   quentin
 * @Last modified time: 2017-11-10T18:18:34+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


 package src.tools.ObjectFactory.array;

 import java.util.ArrayList;
 import java.io.File;
 import src.tools.print.*;
 import src.tools.lexer.*;
 import src.tools.ObjectFactory.*;
 import src.tools.ObjectFactory.sort.*;
 import src.tools.ObjectFactory.factory.*;
 import src.builder.entity.resources.models.*;

 public class ArrayObjectFactory extends ObjectFactory {

   /**
   * Main constructor
   *
   * @see ObjectFactory#ObjectFactory()
   */
   public                     ArrayObjectFactory() {}

   /**
   * Model builder constructor
   *
   * @see ObjectFactory#ObjectFactory()
   */
   public                     ArrayObjectFactory(ALexer data) {
     this.setLexer(data);
     this.run();
   }

   /**
   * Model builder constructor
   *
   * @see ObjectFactory#ObjectFactory()
   */
   public                     ArrayObjectFactory(ALexer data, AFactory builder) {
     this.setLexer(data);
     this.setFactory(builder);
     this.run();
   }

   /**
   * Model builder constructor
   *
   * @see ObjectFactory#ObjectFactory()
   */
   public                     ArrayObjectFactory(AFactory builder) {
     this.setFactory(builder);
   }

   /**
   * This method would to build object actions
   *
   * @return Success or not
   *
   * @see ArrayObjectFactory#run()
   */
   public boolean             build() {
     this.setFactory(new EntityFactory(this.getLexer().getDump()));
     return true;
   }

   /**
   * This method would to run main class methods
   *
   * @return Success or not
   *
   * @see ArrayObjectFactory#build()
   */
   public boolean             run() {
     if (!this.check())
      return false;
    if (!this.build())
      return false;
     return true;
   }
 }
