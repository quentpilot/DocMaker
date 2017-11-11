/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           FilerModel.java
 * @Date:               2017-11-09T18:48:02+01:00
 * @Last modified by:   quentin
 * @Last modified time: 2017-11-11T16:18:57+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


 package src.builder.entity.resources.models.filer;

 import src.builder.entity.resources.models.Model;

 public class FilerModel extends Model {

   /**
   * Main constructor
   *
   * @see Model#Model()
   )
   */
   public FilerModel() {
     super();
     this.setType("filermodel#" + this.id);
   }

   /**
   * Second constructor
   *
   * @see Model#Model()
   )
   */
   public FilerModel(String name) {
     super();
     this.setType(name);
   }
 }
