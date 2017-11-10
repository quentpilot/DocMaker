/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           Sort.java
 * @Date:               2017-11-09T12:34:41+01:00
 * @Last modified by:   quentin
 * @Last modified time: 2017-11-10T23:14:09+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


 package src.builder.core.engine.sorter;

 import src.tools.lexer.*;
 import src.tools.ObjectFactory.array.*;
 import src.tools.ObjectFactory.factory.*;
 import src.builder.entity.resources.models.*;

 public class Sort {

   Lexer lexer = new Lexer();

   Model model = new DatabaseSorter();

   ArrayObjectFactory factory = new ArrayObjectFactory();


   /**
   * Main constructor
   *
   * @see Sort#Sort()
   */
   public   Sort() {}

   /**
   * Second constructor which instanciate files attribute
   *
   * @param models is an instance to set
   *
   * @see Sort#Sort(ArrayObjectFactory models)
   */
    public   Sort(ArrayObjectFactory models) {
      this.factory = models;
      this.run();
      //this.getFactory().getFactory().listModels();
    }

    /**
    * This method would to run main actions
    *
    * @see Sort#Sort(ArrayObjectFactory models)
    */
    public boolean run() {
      if (!this.build())
        return false;
      return true;
    }

    /**
    * This method would to run main actions
    *
    * @see Sort#run()
    */
    public boolean build() {
      Factory   files = new FilerFactory(this.getFactory().getFactory().getModels());

      this.getFactory().setFactory(files);
      return true;
    }

   /**
   * This method would to return lexer attribute value
   *
   * @return lexer attribute value
   *
   * @see Sort#lexer
   */
   public Lexer getLexer() { return this.lexer; }

   /**
   * This method would to set lexer attribute value
   *
   * @param data
   *               value to set
   *
   * @see Sort#lexer
   */
   public void setLexer(Lexer data) { this.lexer = data; }

   /**
   * This method would to return model attribute value
   *
   * @return model attribute value
   *
   * @see Sort#model
   */
   public Model getModel() { return this.model; }

   /**
   * This method would to set model attribute value
   *
   * @param data
   *               value to set
   *
   * @see Sort#model
   */
   public void setModel(Model data) { this.model = data; }

   /**
   * This method would to return factory attribute
   *
   * @return factory attribute value
   *
   * @see ObjectFactory#factory
   */
   public ArrayObjectFactory   getFactory() { return this.factory; }

   /**
   * This method would to set factory attribute
   *
   * @param of
   *             would to be an instance of Factory class
   *
   * @see ObjectFactory#factory
   */
   public void                setFactory(ArrayObjectFactory of) { this.factory = of; }
 }
