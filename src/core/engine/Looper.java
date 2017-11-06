/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            LiveCurrencyConverter
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           Looper.java
 * @Date:               2017-11-05T23:16:29+01:00
 * @Last modified by:   quentin
 * @Last modified time: 2017-11-06T01:59:31+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/LiveCurrencyConverter
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
  */
  public CheckRunner            mandatory = new CheckRunner();

  /**
  * This attribute would to store main api class instance to run DocMaker
  *
  * @see Looper#getApp()
  */
  public ApplicationRunner      app = null;


  /**
  * Main constructor
  *
  * @see Looper#loop()
  */
  public                        Looper(){
    this.loop();
    Printer.printbot("Loop done!");
  }

  /**
  * This method would to instance main objects to run DocMaker
  *
  * @see Looper#Looper()
  */
  protected boolean             loop() {
    if (this.getMandatory() != null && this.getMandatory().getStatus()) {
      this.setApp(new ApplicationRunner());
      if (this.getApp().getStatus()) {
        this.getApp().clean();
        return true;
      }
    }
    return false;
  }

  /**
  * This method would to return mandatory attribute value
  *
  * @see Engine#mandatory
  */
  public CheckRunner            getMandatory() { return this.mandatory; }

  /**
  * This method would to return app attribute value
  *
  * @see Engine#app
  */
  public ApplicationRunner      getApp() { return this.app; }

  /**
  * This method would to set app attribute value
  *
  * @see Engine#app
  */
  public void                   setApp(ApplicationRunner ap) { this.app = ap; }
}
