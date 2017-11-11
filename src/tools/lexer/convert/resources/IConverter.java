/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           IConverter.java
 * @Date:               2017-11-11T13:23:25+01:00
 * @Last modified by:   quentin
 * @Last modified time: 2017-11-11T20:32:06+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


package src.tools.lexer.convert.resources;

import src.builder.entity.resources.models.tree.*;

public interface IConverter {

  public void toFormat(Format classname);

  public void toObject(Class classname);
}
