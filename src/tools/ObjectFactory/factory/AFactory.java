/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           AFactory.java
 * @Date:               2017-11-09T22:27:31+01:00
 * @Last modified by:   quentin
 * @Last modified time: 2017-11-10T21:44:30+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


 package src.tools.ObjectFactory.factory;

 import java.util.ArrayList;
 import java.io.File;
 import src.tools.print.*;
 import src.builder.entity.resources.models.*;
 import src.builder.entity.resources.models.factory.*;
 import src.tools.lexer.*;
 import src.tools.lexer.scan.*;

 public abstract class AFactory {

   /**
   * This attribute would to store list of well parsed files
   * before to sort
   */
   public ArrayList<File>   files = new ArrayList<File>();

   protected File   file = null;

   protected Model[]  model = new Model[255];

   protected ArrayList<Model>  models = new ArrayList<Model>();

   /**
   * This attribute would to store an instance of Lexer
   *
   * @see ObjectFactory#ObjectFactory()
   */
   protected ALexer            lexer = new Lexer();

   /**
   * This attribute would to store an iterator value
   *
   * @see ObjectFactory#ObjectFactory()
   */
   protected int               iterator = 0;

   /**
   * This method would to build object actions
   *
   * @return Success or not
   *
   * @see ObjectFactory#run()
   */
   public boolean             build() {
     return true;
   }

   /**
   * This method would to run main class methods
   *
   * @return Success or not
   *
   * @see ObjectFactory#build()
   */
   public boolean             run() {
     if (!this.build())
      return false;
     return true;
   }

   /**
   * This method would to clean dump data
   *
   * @return Success or not
   *
   * @see ObjectFactory#run()
   */
   public boolean             clean() {
     return true;
   }

   /**
   * This method would to check actions
   *
   * @see ObjectFactory#run()
   */
   public boolean             check() {
     return true;
   }

   /**
   * This method would to list array of models
   *
   * @see ObjectFactory#run()
   */
   public boolean             listModel(Model[] list) {
     for (Model template : list) {
       if (template != null)
        Printer.echo(template.getFilepath());
     }
     return true;
   }

   /**
   * This method would to list array of models
   *
   * @see ObjectFactory#run()
   */
   public boolean             listModels() {
     ArrayList<Model> list = this.getModels();
     for (Model template : list) {
       Printer.echo(template.toString());
     }
     return true;
   }

   /**
   * This method would to return files attribute value
   *
   * @return files attribute value
   *
   * @see AFactory#files
   */
   public ArrayList<File> getFiles() { return this.files; }

   /**
   * This method would to set files attribute value
   *
   * @param list
   *               value to set
   *
   * @see ADatabase#paths
   */
   public void  setFiles(ArrayList<File> list) { this.files = list; }

   public File      getFile() { return this.file; }

   public void      setFile(File data) { this.file = data; }

   public Model[]     getModel() { return this.model; }

   public void      setModel(Model[] data) { this.model = data; }

   public ArrayList<Model>     getModels() { return this.models; }

   public void      setModels(ArrayList<Model> data) { this.models = data; }

   /**
   * This method would to return lexer attribute
   *
   * @return lexer attribute value
   *
   * @see AFactory#lexer
   */
   public ALexer               getLexer() { return this.lexer; }

   /**
   * This method would to set lexer attribute
   *
   * @param data
   *             would to be an instance of Lexer class
   *
   * @see AFactory#lexer
   */
   public void                setLexer(ALexer data) { this.lexer = data; }

   public int                 getIterator() { return this.iterator; }

   public void                setIterator(int data) { this.iterator = data; }

 }
