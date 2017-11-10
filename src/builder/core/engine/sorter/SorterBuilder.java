/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           SorterBuilder.java
 * @Date:               2017-11-07T12:03:15+01:00
 * @Last modified by:   quentin
 * @Last modified time: 2017-11-10T22:01:07+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


 package src.builder.core.engine.sorter;

 import java.lang.*;
 import src.builder.*;
 import src.tools.print.*;
 import src.tools.check.*;
 import src.tools.lexer.*;
 import src.tools.lexer.resources.*;
 import src.tools.ObjectFactory.array.*;
 import src.tools.ObjectFactory.factory.*;
 import src.builder.core.engine.sorter.Sort;
 import src.builder.entity.resources.models.Model;

 public class  SorterBuilder extends Builder {

   /**
   * This attribute would to store Sort instances
   * to sort array objects following model
   */
   public Sort sort = new Sort();

   /**
   * Main constructor
   *
   * @see  SorterBuilder#SorterBuilder()
   */
   public                      SorterBuilder() {
     super();
     this.setType("sorterbuilderbot");
     this.setChecker(new EntityChecker());
     this.run();
   }

   /**
   * Second constructor
   *
   * @see  SorterBuilder#SorterBuilder()
   */
   public                      SorterBuilder(String classname) {
     super(classname);
     this.setType("sorterbuilderbot");
     this.setChecker(new EntityChecker());
     this.run();
   }

   /**
   * Second constructor
   *
   * @see   SorterBuilder#SorterBuilder()
   */
   public                       SorterBuilder(ArrayObjectFactory database) {
     super();
     this.setType("sorterbuilderbot");
     this.setChecker(new EntityChecker());
     this.setEntities(database);
     this.run();
   }

   /**
   * This method would to build object actions
   *
   * @return Success or not
   *
   * @see  SorterBuilder#run()
   */
   public boolean             build() {
      Factory  builder = new SorterFactory();

      // build models with content file data from format
      this.setSort(new Sort(this.getEntities()));
      this.setEntities(this.getSort().getFactory());
      //this.getEntities().getFactory().listModels();
      // create new object array model with file data
      builder = new SorterFactory(this.getEntities().getFactory().getModels());
      this.getEntities().setFactory(builder);
      return true;
   }

   /**
   * This method would to return sorter attribute
   *
   * @return sorter value
   *
   * @see  SorterBuilder#build()
   */
   public Sort                getSort() {
     return this.sort;
   }

   /**
   * This method would to set sorter attribute
   *
   * @return sorter value
   *
   * @see  SorterBuilder#build()
   */
   public void               setSort(Sort instance) {
     this.sort= instance;
   }
 }
