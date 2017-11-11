/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            LiveCurrencyConverter
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           Writer.java
 * @Date:               2017-11-05T23:26:45+01:00
 * @Last modified by:   quentin
 * @Last modified time: 2017-11-11T17:49:16+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/LiveCurrencyConverter
 */


 package src.tools.lexer.write;

 import java.io.BufferedReader;
 import java.io.BufferedWriter;
 import java.io.FileWriter;
 import java.io.File;
 import java.io.IOException;
 import src.tools.lexer.*;
 import src.tools.lexer.read.*;
 import src.tools.lexer.resources.*;
 import src.tools.print.*;

 public class Writer extends ALexer {

   /**
   * current stream to read
   *
   * @see Reader#getStream()
   */
   protected   BufferedWriter	stream = null;

   /**
   * current data to write
   *
   * @see Writer#getReader()
   */
   protected Reader   reader = new Reader();

   /**
   * Main constructor
   *
   * @see Writer#Writer()
   */
   public Writer() {}

   /**
   * Second constructor
   *
   * @see Writer#Writer()
   */
   public Writer(Reader data) {
     this.setReader(data);
   }

   /**
   * third constructor
   *
   * @see Writer#Writer()
   */
   public Writer(Reader data, String output) {
     this.setReader(data);
     this.setFilename(output);
   }

   /**
   * This method would to build object actions
   *
   * @return Success or not
   *
   * @see Writer#run()
   */
   public boolean build() {
     if (this.getFilename() != null) {
       try {
         FileWriter      fw = new FileWriter(new File(this.getFilename()));
         BufferedWriter  file = new BufferedWriter(fw);
         this.setStream(file);
       } catch(IOException io) {
         io.printStackTrace();
         return false;
       }
     }
     if (!this.write())
      return false;
    return true;
   }

   /**
    * Read the current stream, then return value
    *
    * @return value read
    *
    * @see Reader#input
    * @see Reader#stream
    */
    public boolean    write() {
      String line = null;
    	if (this.getReader().getStream() == null)
        return false;

      try {
        while ((line = this.getReader().getStream().readLine()) != null) {
          if (this.getStream() != null)
            this.getStream().write(line);
          else
            Printer.echo(line);
        }
        if (this.getStream() != null)
          this.getStream().close();
        return true;
      } catch(IOException io) {
        io.printStackTrace();
        return false;
      }
    }

   public Reader  getReader() { return this.reader; }

   public void    setReader(Reader data) { this.reader = data; }

   /**
   * Get value write by current stream
   *
   * @return value of stream attribute
   *
   * @see Writer#stream
   * @see Writer#read()
   */
   public BufferedWriter	  getStream() { return (this.stream); }

   /**
   * Set stream to write
   *
   * @param fd
   *           set an instance
   *
   * @see Writer#stream
   */
   public void             setStream(BufferedWriter fd) { this.stream = fd; }
 }
