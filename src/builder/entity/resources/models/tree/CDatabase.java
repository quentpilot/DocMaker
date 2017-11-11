/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           CDatabase.java
 * @Date:               2017-11-11T00:04:46+01:00
 * @Last modified by:   quentin
 * @Last modified time: 2017-11-11T21:08:51+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


package src.builder.entity.resources.models.tree;

public class CDatabase {

  protected String name = "hello";

  protected String login = null;

  protected String pass = null;

  protected String tables = null;

  protected boolean status = false;

  public CDatabase() {
    System.out.println("CDatabase built!");
  }
}
