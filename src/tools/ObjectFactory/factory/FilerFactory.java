/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           FilerFactory.java
 * @Date:               2017-11-10T21:54:25+01:00
 * @Last modified by:   quentin
 * @Last modified time: 2017-11-13T21:23:32+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


 package src.tools.ObjectFactory.factory;

 import java.util.ArrayList;
 import java.io.File;
 import src.tools.print.*;
 import src.tools.ObjectFactory.factory.*;
 import src.tools.lexer.*;
 import src.tools.lexer.file.*;
 import src.tools.lexer.scan.*;
 import src.tools.lexer.write.*;
 import src.tools.lexer.convert.*;
 import src.builder.entity.resources.models.*;
 import src.builder.entity.resources.models.filer.*;
 import src.builder.entity.resources.models.factory.*;
 import src.builder.entity.resources.models.filer.DatabaseFiler;

 public class FilerFactory extends Factory {

   protected ALexer converter = new Converter();

   public FilerFactory() {
     super();
   }

   public FilerFactory(ArrayList<Model> files) {
     super();
     this.setModels(files);
     this.run();
   }

   /**
   * This method would to build object actions
   *
   * @return Success or not
   *
   * @see ObjectFactory#run()
   */
   public boolean             build() {
     FilerModel  info = new DatabaseFiler("CDatabase");

     this.setIterator(0);
     this.scan(info);
     return true;
   }

   /**
   * This method would to scan objects
   *
   * @return Success or not
   *
   * @see ObjectFactory#scan()
   */
   protected boolean             scan(FilerModel infos) {
     Scanner    scan = new Scanner(infos);

     //this.setConverter(new Converter(scan));

     //if (this.getConverter().getResults().getToWrite() != null)
      //Printer.echo("Nice result!");

     return true;
   }

   /**
   * This method would to merge an object to a model
   *
   * @return Success or not
   *
   * @see ObjectFactory#scan()
   */
   protected Model             merge(Model template, File file) {
     return template;
   }

   public ALexer              getConverter() { return this.converter; }

   public void                setConverter(ALexer tool) { this.converter = tool; }
 }
