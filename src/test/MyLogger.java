/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

/**
 *
 * @author lungua
 */
import java.io.IOException;
 import java.util.logging.FileHandler;
 import java.util.logging.Level;
 import java.util.logging.Logger;
 import java.util.logging.SimpleFormatter;

public class MyLogger {

  public static void main(String[] args) {

    Logger logger = Logger.getLogger("MyLog");
     FileHandler fh;

    try {

      // This block configure the logger with handler and formatter
       fh = new FileHandler("c:\\MyLogFile.log", true);
       logger.addHandler(fh);
       logger.setLevel(Level.ALL);
       SimpleFormatter formatter = new SimpleFormatter();
       fh.setFormatter(formatter);

      // the following statement is used to log any messages
       logger.log(Level.WARNING,"My first log");

    } catch (SecurityException e) {
       e.printStackTrace();
     } catch (IOException e) {
       e.printStackTrace();
     }

   }

}