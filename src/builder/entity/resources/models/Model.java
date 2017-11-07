/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bianw <quentpilot>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           Model.java
 * @Date:               2017-11-07T18:59:15+01:00
 * @Last modified by:   quentpilot
 * @Last modified time: 2017-11-07T21:10:07+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


 package src.builder.entity.resources.models;

 import src.builder.*;
 import src.tools.print.*;

 public class Model {

   /**
   * This attribute would to store current entity model id
   *
   * @see Model#Model()
   */
   public int             id = 0;

   /**
   * This attribute would to store current entity model iteration
   *
   * @see Model#Model()
   */
   public static int      iterator = 0;

   /**
   * This attribute would to store class type
   *
   * @see Builder#Builder()
   */
   public String             type = "modelbot";

   /**
   * This attribute would to store current entity model iteration
   *
   * @see Model#Model()
   */
   public static String   dirpath = "resources/";

   /**
   * This attribute would to store current entity model iteration
   *
   * @see Model#Model()
   */
   public static String   filepath = null;

   /**
   * Main constructor
   *
   * @see Model#Model()
   */
   public                     Model() {
     this.id = this.iterator;
     this.iterator++;
     this.setType("entitymodel#" + this.id);
     Printer.printag(this.getType(), "Model is building...");
   }

   /**
   * Second constructor
   *
   * @see Model#Model()
   */
   public                     Model(String classname) {
     this.id = this.iterator;
     this.iterator++;
     Printer.printag(this.getType(), "Model is working...");
   }

   /**
   * This method would to return id attribute value
   *
   * @return id attribute value
   *
   * @see Model#id
   */
   public int                 getId() { return this.id; }

   /**
   * This method would to set id attribute value
   *
   * @param id
   *               id to set
   *
   * @see Model#id
   */
   public void               setId(int id) { this.id = id; }

   /**
   * This method would to return iterator attribute value
   *
   * @return iterator attribute value
   *
   * @see Model#iterator
   */
   public int                getIterator() { return this.iterator; }

   /**
   * This method would to set iterator attribute value
   *
   * @param it
   *               iterator to set
   *
   * @see Model#iterator
   */
   public void              setIterator(int it) { this.iterator = it; }

   /**
   * This method would to return type attribute value
   *
   * @return type attribute value
   *
   * @see Model#type
   */
   public String              getType() { return this.type; }

   /**
   * This method would to set type attribute value
   *
   * @param classname
   *               value to set
   *
   * @see Model#type
   */
   public void                setType(String classname) {
     this.type = "[@" + classname + "]> ";
   }

   /**
   * This method would to return dirpath attribute value
   *
   * @return dirpath attribute value
   *
   * @see Model#dirpath
   */
   public String            getDirpath() { return this.dirpath; }

   /**
   * This method would to set filepath attribute value
   *
   * @param dirname
   *               filepath to set
   *
   * @see Model#filepath
   */
   public void               setDirpath(String dirname) { this.dirpath = dirname; }

   /**
   * This method would to return filepath attribute value
   *
   * @return filepath attribute value
   *
   * @see Model#filepath
   */
   public String             getFilepath() { return this.filepath; }

   /**
   * This method would to set filepath attribute value
   *
   * @param filename
   *               filepath to set
   *
   * @see Model#filepath
   */
   public void               setFilepath(String filename) { this.filepath = filename; }
 }
