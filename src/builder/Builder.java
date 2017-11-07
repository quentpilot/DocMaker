/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            LiveCurrencyConverter
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           Builder.java
 * @Date:               2017-11-04T17:32:31+01:00
 * @Last modified by:   quentpilot
 * @Last modified time: 2017-11-07T21:06:53+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


package src.builder;

import src.tools.print.*;
import src.tools.ObjectFactory.array.*;
import src.tools.lexer.*;
import src.tools.ResourcesManager.*;
import src.tools.ResourcesManager.builder.*;
import src.builder.entity.resources.models.*;

public class Builder extends ArrayObjectFactory {

  /**
  * This attribute would to store class type
  *
  * @see Builder#Builder()
  */
  public String             type = "builderbot";

  /**
  * This attribute would to store Entities array
  *
  * @see Builder#Builder()
  */
  public ArrayObjectFactory entities = new ArrayObjectFactory();

  /**
  * This attribute would to store Lexer tools
  *
  * @see Builder#Builder()
  */
  public Lexer lexer = new Lexer();

  /**
  * This attribute would to store entities classes models
  *
  * @see Builder#Builder()
  */
  public Model model = new EntityModel();

  /**
  * This attribute would to store Resources tools
  *
  * @see Builder#Builder()
  */
  public Resources resources = new ResourcesBuilder();

  /**
  * Main constructor
  *
  * @see Builder#Builder()
  */
  public                     Builder() {
    this.setType(this.type);
    Printer.printag(this.getType(), "Builder is working...");
  }

  /**
  * Second constructor
  *
  * @see Builder#Builder()
  */
  public                     Builder(String classname) {
    this.setType(classname);
    Printer.printag(this.getType(), "Builder is working...");
  }

  /**
  * This method would to build object actions
  *
  * @return Success or not
  *
  * @see Builder#run()
  */
  public boolean             build() {
    Printer.printag(this.getType(), "Builder is building...");
    return true;
  }

  /**
  * This method would to run main class methods
  *
  * @return Success or not
  *
  * @see Builder#build()
  */
  public boolean             run() {
    if (!this.build())
      return false;
    Printer.printag(this.getType(), "Builder is running...");
    return true;
  }

  /**
  * This method would to clean dump data
  *
  * @return Success or not
  *
  * @see Builder#run()
  */
  public boolean             clean() {
    Printer.printag(this.getType(), "Builder cleaning...");
    return true;
  }

  /**
  * This method would to return type attribute value
  *
  * @return type attribute value
  *
  * @see Builder#type
  */
  public String              getType() { return this.type; }

  /**
  * This method would to set type attribute value
  *
  * @param classname
  *               value to set
  *
  * @see Builder#type
  */
  public void                setType(String classname) {
    this.type = "[@" + classname + "]> ";
  }

  /**
  * This method would to return entities attribute value
  *
  * @return entities attribute value
  *
  * @see Builder#entities
  */
  public ArrayObjectFactory getEntities() { return this.entities; }

  /**
  * This method would to set entity attribute value
  *
  * @param data
  *               value to set
  *
  * @see Builder#entities
  */
  public void setEntities(ArrayObjectFactory data) { this.entities = data; }

  /**
  * This method would to return lexer attribute value
  *
  * @return lexer attribute value
  *
  * @see Builder#lexer
  */
  public Lexer getLexer() { return this.lexer; }

  /**
  * This method would to set lexer attribute value
  *
  * @param data
  *               value to set
  *
  * @see Builder#lexer
  */
  public void setLexer(Lexer data) { this.lexer = data; }

  /**
  * This method would to return model attribute value
  *
  * @return model attribute value
  *
  * @see Builder#model
  */
  //public Model getModel() { return this.model; }

  /**
  * This method would to set model attribute value
  *
  * @param data
  *               value to set
  *
  * @see Builder#modellexer
  */
  //public void setModel(Model data) { this.model = data; }

  /**
  * This method would to return lexer attribute value
  *
  * @return resources attribute value
  *
  * @see Builder#resources
  */
  public Resources getResources() { return this.resources; }

  /**
  * This method would to set resources attribute value
  *
  * @param data
  *               value to set
  *
  * @see Builder#resources
  */
  public void setResources(Resources data) { this.resources = data; }
}
