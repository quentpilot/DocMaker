/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           Filer.java
 * @Date:               2017-11-09T17:59:41+01:00
 * @Last modified by:   quentin
 * @Last modified time: 2017-11-09T21:17:31+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


package src.tools.lexer.file;

import src.tools.lexer.*;
import src.builder.entity.resources.models.Model;
import src.builder.entity.resources.models.filer.*;

public class Filer extends ALexer {

  public Filer() {}

 public Filer(FilerModel file) {
   this.model = file;
 }
}
