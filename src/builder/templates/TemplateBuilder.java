/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            LiveCurrencyConverter
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           TemplateBuilder.java
 * @Date:               2017-11-04T17:46:10+01:00
 * @Last modified by:   quentin
 * @Last modified time: 2017-11-10T20:24:58+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/LiveCurrencyConverter
 */


 package src.builder.templates;

 import src.builder.templates.ATemplate;
 import src.tools.ObjectFactory.array.*;

 public class TemplateBuilder extends ATemplate {

  public TemplateBuilder(){}

  public TemplateBuilder(ArrayObjectFactory database) {
    this.setEntities(database);
  }
 }
