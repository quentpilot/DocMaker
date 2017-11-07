/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           Printer.java
 * @Date:               2017-11-05T23:28:01+01:00
 * @Last modified by:   quentpilot
 * @Last modified time: 2017-11-06T09:07:37+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


package src.tools.print;

public class Printer {

  /**
  * Main constructor
  *
  * @see Printer#Printer()
  */
  public Printer(){}

  /**
  * This method would to display string
  *
  * @param msg
  *             string to display
  *
  * @return msg value
  *
  * @see Printer#Printer()
  */
  public static String       echo(String msg) {
    System.out.println(msg);
    return msg;
  }

  /**
  * This method would to display string with custom tag
  *
  * @param tag
  *             pre-text to display
  * @param msg
  *             string to display
  *
  * @see Printer#Printer()
  */
  public static void        printag(String tag, String msg) {
    String  pnj = tag + msg;
    System.out.println(pnj);
  }

  /**
  * This method would to display string with generic tag
  *
  * @param msg
  *             string to display
  *
  * @see Printer#Printer()
  */
  public static void        printbot(String msg) {
    String  pnj = "[@bot]> " + msg;
    System.out.println(pnj);
  }
}
