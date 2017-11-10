/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           BootstrapBuilder.java
 * @Date:               2017-11-07T12:02:08+01:00
 * @Last modified by:   quentin
 * @Last modified time: 2017-11-10T17:25:48+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


 package src.builder.core.engine.bootstrap;

 import java.lang.*;
 import src.builder.*;
 import src.tools.print.*;
 import src.tools.check.*;
 import src.tools.lexer.*;
 import src.tools.lexer.resources.*;
 import src.tools.ObjectFactory.array.*;
 import src.builder.entity.resources.models.Model;
 import src.builder.templates.*;

 public class  BootstrapBuilder extends Builder {

   /**
   * This attribute would to store Sort instances
   * to sort array objects following model
   */
   public ATemplate website = new TemplateBuilder();

   /**
   * Main constructor
   *
   * @see   BootstrapBuilder#BootstrapBuilder()
   */
   public                       BootstrapBuilder() {
     super();
     this.setType("bootstrapbuilderbot");
     this.setChecker(new EntityChecker());
     this.run();
   }

   /**
   * Second constructor
   *
   * @see   BootstrapBuilder#BootstrapBuilder()
   */
   public                       BootstrapBuilder(String classname) {
     super(classname);
     this.setType("bootstrapbuilderbot");
     this.setChecker(new EntityChecker());
     this.run();
   }

   /**
   * This method would to build object actions
   *
   * @return Success or not
   *
   * @see   BootstrapBuilder#run()
   */
   public boolean             build() {
     this.setWebsite(new TemplateBuilder(this.getEntities()));
     this.setLexer(this.getWebsite().getLexer());
     //this.setEntities(new ArrayObjectFactory(this.getLexer()));
     return true;
   }

   /**
   * This method would to return website attribute
   *
   * @return website value
   *
   * @see  BootstrapBuilder#build()
   */
   public ATemplate           getWebsite() {
     return this.website;
   }

   /**
   * This method would to set website attribute
   *
   * @return website value
   *
   * @see  BootstrapBuilder#build()
   */
   public void               setWebsite(ATemplate instance) {
     this.website = instance;
   }
 }
