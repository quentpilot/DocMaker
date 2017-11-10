/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           EntityFactory.java
 * @Date:               2017-11-09T23:05:02+01:00
 * @Last modified by:   quentin
 * @Last modified time: 2017-11-10T18:19:41+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


 package src.tools.ObjectFactory.factory;

 import java.util.ArrayList;
 import java.io.File;
 import src.tools.print.*;
 import src.tools.ObjectFactory.factory.*;
 import src.tools.lexer.file.*;
 import src.tools.lexer.scan.*;
 import src.builder.entity.resources.models.*;
 import src.builder.entity.resources.models.factory.*;
 import src.builder.entity.resources.models.filer.DatabaseFiler;

 public class EntityFactory extends Factory {

   public EntityFactory() {
     super();
   }

   public EntityFactory(ArrayList<File> files) {
     super();
     this.setFiles(files);
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
     DatabaseFiler info = new DatabaseFiler();

     this.setIterator(0);
     this.scan(info.getDirpath());
     return true;
   }

   /**
   * This method would to scan objects
   *
   * @return Success or not
   *
   * @see ObjectFactory#scan()
   */
   protected boolean             scan(String folder) {
     File     directory = new File(folder);
     File[]   files = directory.listFiles();

     for (File file : files) {
       String   path = folder;
       if (file.isDirectory()) {
         Model entity = new Model(this.merge(new DirectoryModel(), file));
         this.getModels().add(entity);
         path = path + "/" + file.getName();
         this.scan(path);
      }
      else {
        Model entity = new Model(this.merge(new FileModel(), file));
        entity.setFilepath(file.getName());
        this.getModels().add(entity);
      }
     }
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
     if (template instanceof DirectoryModel) {
       template.setType(file.getName());
       template.setDirpath(file.getAbsolutePath());
       template.setFilepath("/");
       template.setFormat("rep");
       template.setIterator(this.getIterator());
     }
     if (template instanceof FileModel) {
       template.setType(file.getParentFile().getName());
       template.setDirpath(file.getAbsolutePath());
       template.setFilepath(file.getName());
       template.setIterator(this.getIterator());
     }
     return template;
   }
}
