/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bianw <quentpilot>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            DocMaker
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           Lexer.java
 * @Date:               2017-11-07T16:38:55+01:00
 * @Last modified by:   quentin
 * @Last modified time: 2017-11-09T22:13:51+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/DocMaker
 */


package src.tools.lexer;

import java.util.ArrayList;
import java.io.File;
import src.tools.lexer.*;
import src.tools.lexer.resources.*;
import src.tools.lexer.read.*;
import src.tools.lexer.write.*;
import src.tools.lexer.parse.*;
import src.tools.lexer.build.*;

import src.tools.print.*;

public class Lexer extends ALexer {

  /**
  * This attribute would to store Lexer tools
  *
  * @see Lexer#Lexer()
  */
  public ILexer[] lexer = { new Reader(), new Writer(), new Parser(), new Builder() };

  /**
  * Main constructor
  *
  * @see Lexer#Lexer()
  */
  public Lexer() {}

  /**
  * Main constructor
  *
  * @see Lexer#Lexer()
  */
  public Lexer(ArrayList<File> files) {
    this.setDump(files);
  }

  /**
  * This method would to build object actions
  *
  * @return Success or not
  *
  * @see Lexer#run()
  */
  public boolean build() {
    return true;
  }

  /**
  * This method would to run main class methods
  *
  * @return Success or not
  *
  * @see Lexer##build()
  */
  public boolean run() {
    if (!this.build())
      return false;
    return true;
  }

  /**
  * This method would to return Reader() instance
  *
  * @return Reader() instance
  *
  * @see Lexer#lexer
  */
  public ILexer read(){
    return this.getLexer()[0];
  }

  /**
  * This method would to return Writer() instance
  *
  * @return Writer() instance
  *
  * @see Lexer#lexer
  */
  public ILexer write(){
    return this.getLexer()[1];
  }

  /**
  * This method would to return Parser() instance
  *
  * @return Parser() instance
  *
  * @see Lexer#lexer
  */
  public ILexer parse(){
    return this.getLexer()[2];
  }

  /**
  * This method would to return Builder() instance
  *
  * @return Builder instance
  *
  * @see Lexer#lexer
  */
  public ILexer build(String format) {
    return this.getLexer()[3];
  }

  /**
  * This method would to clean dump data
  *
  * @return Success or not
  *
  * @see Lexer#run()
  */
  public boolean clear(){
    return true;
  }

  /**
  * This method would to return lexer attribute value
  *
  * @return entities attribute value
  *
  * @see Lexer#lexer
  */
  public ILexer[] getLexer() { return this.lexer; }

  /**
  * This method would to set lexer attribute value
  *
  * @param data
  *               value to set
  *
  * @see Lexer#lexer
  */
  public void setLexer(ILexer[] data) { this.lexer = data; }
}
