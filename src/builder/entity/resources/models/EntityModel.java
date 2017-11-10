/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bianw <quentpilot>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           EntityModel.java
 * @Date:               2017-11-07T18:58:07+01:00
 * @Last modified by:   quentin
 * @Last modified time: 2017-11-09T14:25:11+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


 package src.builder.entity.resources.models;

 import src.builder.entity.resources.models.Model;
 import src.tools.print.*;
 import java.lang.*;

 public class EntityModel extends Model {

   /**
   * Main constructor
   *
   * @see EntityModel#EntityModel()
   */
   public                     EntityModel() {
     super();
     this.setType("entity#" + this.id);
   }

   /**
   * Second constructor
   *
   * @see EntityModel#EntityModel(String classname)
   */
   public                     EntityModel(String classname) {
     super(classname);
   }
 }
