/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           Looper.java
 * @Date:               2017-11-05T23:16:29+01:00
 * @Last modified by:   quentpilot
 * @Last modified time: 2017-11-07T11:05:12+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


package src.core.engine;

import src.tools.print.*;
import src.core.engine.runner.ApplicationRunner;
import src.core.engine.runner.CheckRunner;

public class Looper { // or Loopyloop, Youpiloop, DocMaker, DokMacer, DocDoc,...

  /**
  * This attribute would to store main check class instance
  *
  * @see Looper#getMandatory()
  * @see CheckRunner#CheckRunner()
  */
  public CheckRunner            mandatory = null;

  /**
  * This attribute would to store main api class instance to run DocMaker
  *
  * @see Looper#getApp()
  * @see ApplicationRunner#ApplicationRunner()
  */
  public ApplicationRunner      app = null;


  /**
  * Main constructor
  *
  * @see Looper#loop()
  */
  public                        Looper() {
    this.loop();
    Printer.printbot("Loop completed!");
  }

  /**
  * This method would to instance main objects to run DocMaker
  *
  * @return Success or not
  *
  * @see Looper#Looper()
  * @see CheckRunner#CheckRunner()
  * @see ApplicationRunner#ApplicationRunner()
  */
  protected boolean             loop() {
    this.setMandatory(new CheckRunner());
    if ((this.getMandatory() == null) ||
        (!this.getMandatory().getStatus()))
      return false;
    this.setApp(new ApplicationRunner());
    if (!this.getApp().getStatus())
      return false;
    return true;
  }

  /**
  * This method would to return mandatory attribute value
  *
  * @return mandatory attribute value
  *
  * @see Looper#mandatory
  */
  public CheckRunner            getMandatory() { return this.mandatory; }

  /**
  * This method would to return app attribute value
  *
  * @return app attribute value
  *
  * @see Looper#app
  */
  public ApplicationRunner      getApp() { return this.app; }

  /**
  * This method would to set mandatory attribute value
  *
  * @param cr
  *           Would to be an instance of CheckRunner
  *
  * @see Looper#mandatory
  */
  public void                   setMandatory(CheckRunner cr) { this.mandatory = cr; }

  /**
  * This method would to set app attribute value
  *
  * @param ar
  *           Would to be an instance of ApplicationRunners
  *
  * @see Looper#app
  */
  public void                   setApp(ApplicationRunner ar) { this.app = ar; }
}
