/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           IDatabase.java
 * @Date:               2017-11-07T13:01:45+01:00
 * @Last modified by:   quentin
 * @Last modified time: 2017-11-08T22:10:54+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


package src.builder.database.resources;

import java.util.ArrayList;
import java.io.File;
import src.builder.database.*;

public interface IDatabase {
  public boolean          load();
  public boolean          set(Request data);
  public Response         get(Request data);
  public Response         find(Request data);
  public boolean          clean();
  public ArrayList<File>  getPaths();
  public void             setPaths(ArrayList<File> list);
}
