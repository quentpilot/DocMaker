/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bianw <quentpilot>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           Model.java
 * @Date:               2017-11-07T18:59:15+01:00
 * @Last modified by:   quentin
 * @Last modified time: 2017-11-10T18:00:00+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


 package src.builder.entity.resources.models;

 import src.builder.*;
 import src.tools.print.*;
 import java.lang.*;

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
   public int            iterator = 0;

   /**
   * This attribute would to store class type
   *
   * @see Builder#Builder()
   */
   public String             type = "modelbot";

   /**
   * This attribute would to store file format
   *
   * @see Builder#Builder()
   */
   public String             format = "json";

   /**
   * This attribute would to store current entity model iteration
   *
   * @see Model#Model()
   */
   public String   dirpath = "resources";

   /**
   * This attribute would to store current entity model iteration
   *
   * @see Model#Model()
   */
   public String   filepath = "/";

   /**
   * Main constructor
   *
   * @see Model#Model()
   */
   public                     Model() {
     this.id = this.iterator;
     this.iterator++;
     this.setType("model#" + this.id);
   }

   /**
   * Second constructor
   *
   * @see Model#Model()
   */
   public                     Model(String classname) {
     this.id = this.iterator;
     this.iterator++;
     this.setType(classname + "#" + this.id);
   }

   /**
   * Copy constructor
   *
   * @see Model#Model()
   */
   public                     Model(Model data) {
     this.id = data.getId();
     this.type = data.getType();
     this.format = data.getFormat();
     this.dirpath = data.getDirpath();
     this.filepath = data.getFilepath();
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
     this.type = classname;
   }

   /**
   * This method would to return format attribute value
   *
   * @return format attribute value
   *
   * @see Model#format
   */
   public String              getFormat() { return this.format; }

   /**
   * This method would to set format attribute value
   *
   * @param type
   *               value to set
   *
   * @see Model#format
   */
   public void                setFormat(String type) {
     this.format = type;
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

   /**
   * This method would to set string with attributes value
   *
   * @return attributes value
   *
   * @see Model#Model()
   */
   public String             toString() {
     StringBuilder str = new StringBuilder();
     str.append("### Model content ###\n\n");
     str.append("ID => " + this.getId() + "\n");
     str.append("Type => " + this.getType() + "\n");
     str.append("Format => " + this.getFormat() + "\n");
     str.append("Directory => " + this.getDirpath() + "\n");
     str.append("File => " + this.getFilepath() + "\n");
     return str.toString();
   }
 }
