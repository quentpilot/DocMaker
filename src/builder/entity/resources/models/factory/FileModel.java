/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           FileModel.java
 * @Date:               2017-11-09T23:26:04+01:00
 * @Last modified by:   quentin
 * @Last modified time: 2017-11-10T17:59:51+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


 package src.builder.entity.resources.models.factory;

 import src.builder.entity.resources.models.Model;
 import src.tools.print.*;
 import java.lang.*;

 public class FileModel extends Model {

   /**
   * Main constructor
   *
   * @see FileModel#FileModel()
   */
   public                     FileModel() {
     super();
     this.setType("fileentity#" + this.id);
   }

   /**
   * Second constructor
   *
   * @see FileModel#FileModel(String classname)
   */
   public                     FileModel(String classname) {
     super(classname);
   }

   /**
   * Copy constructor
   *
   * @see Model#Model()
   */
   public                     FileModel(Model data) {
     super(data);
     this.id = data.getId();
     this.iterator = data.getIterator();
     this.type = data.getType();
     this.format = data.getFormat();
     this.dirpath = data.getDirpath();
     this.filepath = data.getFilepath();
   }
 }
