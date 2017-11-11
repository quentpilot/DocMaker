/**
 * @Description:        Object class would to do some stuff
 * @Author:             Quentin Le Bian <quentin>
 * @Email:              quentin.lebian@pilotaweb.fr
 * @Project:            LiveCurrencyConverter
 * @About:              You're welcome to hack and code as your are each of theses sources files <3:p|--<;
 * @Filename:           Reader.java
 * @Date:               2017-11-05T23:26:58+01:00
 * @Last modified by:   quentin
 * @Last modified time: 2017-11-11T15:12:03+01:00
 * @License:            MIT
 * @See:                projects.quentinlebian.fr/LiveCurrencyConverter
 */


 package src.tools.lexer.read;

 import java.io.*;
 import src.tools.lexer.*;
 import src.tools.lexer.resources.*;
 import src.tools.print.*;

 public class Reader extends ALexer {

    /**
    * current input to read
    *
    * @see Reader#read()
    */
    protected   String         	input = null;

    /**
    * If it read into a loop
    *
    * @see Reader#read()
    */
    protected   boolean        	running = true;

    /**
    * current stream to read
    *
    * @see Reader#getStream()
    */
    protected   BufferedReader	stream = null;

    /**
     * This constructor would to read standard input STDIN
     *
     * @see Reader#stream
     */
     public                  Reader() {
         BufferedReader  in = new BufferedReader(new InputStreamReader(System.in));

     	this.stream = in;
     }

     /**
     * This constructor would to read a file
     *
     * @param filename
     *                 file path to read
     *
     * @see Reader#stream
     */
     public                  Reader(String filename) {
         try {
     	   BufferedReader	in = new BufferedReader(new FileReader(filename));

         	this.stream = in;
         } catch (IOException e) {
             e.printStackTrace();
         }
     }

   /**
   * This method would to build object actions
   *
   * @return Success or not
   *
   * @see Reader#run()
   */
   public boolean build() {
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
    public String           read() {
    	try {
            String      value = null;
    		this.input = this.stream.readLine();
            this.isValid();
    		return this.getInput();
    	} catch(IOException e) {
    		e.printStackTrace();
    		System.out.println("Value is not an integer");
    		return null;
    	}
    }

    /**
    * Check if value is not null
    *
    * @return success or not
    *
    * @see Reader#getInput()
    */
    public boolean          isValid() {
        if (this.getInput() == null || this.getInput().length() == 0)
            return false;
        return true;
    }

    /**
    * Check if value is an integer
    *
    * @return success or not
    *
    * @see Reader#getInput()
    */
    public boolean          isNumeric()
    {
        return this.getInput().matches("-?\\d+(\\.\\d+)?");
    }

    /**
    * Check if value is an integer
    *
    * @param value
    *               current value to check
    *
    * @return success or not
    *
    * @see Reader#isNumeric()
    */
    public boolean          isNumeric(String value)
    {
        return value.matches("-?\\d+(\\.\\d+)?");
    }

    /**
    * Get value read by current stream
    *
    * @return value read
    *
    * @see Reader#input
    * @see Reader#read()
    */
    public String 			getInput() {return (this.input);}

    /**
    * Set input value
    *
    * @param value
    *               would to set current input value
    *
    * @see Reader#input
    */
    public void             setInput(String value) { this.input = value; }

    /**
    * Get running value
    *
    * @return value of running attribute
    *
    * @see Reader#running
    */
    public boolean 			getRunning() {return (this.running);}

    /**
    * Set running attribute
    *
    * @param run
    *             Set conditional while loop as run or not
    *
    * @see Reader#running
    */
    public void 			setRunning(boolean run) { this.running = run; }

    /**
    * Get value read by current stream
    *
    * @return value of stream attribute
    *
    * @see Reader#stream
    * @see Reader#read()
    */
    public BufferedReader	  getStream() { return (this.stream); }

    /**
    * Set stream to read
    *
    * @param fd
    *           set an instance
    *
    * @see Reader#stream
    */
    public void             setStream(BufferedReader fd) { this.stream = fd; }
 }
