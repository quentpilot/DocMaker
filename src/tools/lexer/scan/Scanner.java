/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           Scanner.java
 * @Date:               2017-11-09T16:43:31+01:00
 * @Last modified by:   quentin
 * @Last modified time: 2017-11-09T23:57:01+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


package src.tools.lexer.scan;

import java.util.ArrayList;
import java.io.File;
import src.tools.print.*;
import src.tools.print.*;
import src.tools.lexer.*;
import src.tools.lexer.file.*;

public class Scanner extends ALexer {

  public Scanner(){}

  public Scanner(String filename) {}

  public Scanner(ALexer file) {
    this.setModel(file.getModel());
    this.run();
  }

  /**
  * This method would to build object actions
  *
  * @return Success or not
  *
  * @see Writer#run()
  */
  public boolean build() {
    String  folder = this.getModel().getDirpath();
    String  file = this.getModel().getFilepath();

    if (file == null || file.equals("/")) {
      if (!this.scan(folder))
        return false;
    }
    return true;
  }

  /**
  * This method would to scan directory from object model attributes
  *
  * @return Success or not
  *
  * @see Writer#build()
  */
  protected boolean scan(String folder) {
    File    directory = new File(folder);
    File[]  files = directory.listFiles();

    for (File file : files) {
      if (file.isFile()) {
        this.getDump().add(file);
      }
      else if (file.isDirectory()) {
        String path = folder + "/" + file.getName();
        this.getDump().add(file);
        //this.scan(file.getAbsolutePath());
        this.scan(path);
      }
    }
    return true;
  }
}
